/*
Machines API

# Introduction  Fly Machines are the compute behind the Fly.io platform. They are fast-launching VMs that can be started and stopped at subsecond speeds. A Machine is the configuration and state for a single VM running on our platform. Every Machine will belong to a Fly App; Apps can have more than one Machine. Read more [here](https://fly.io/docs/machines/).  The Machines REST API allows you to provison and manage Apps, Machines and Volumes on the Fly.io platform. To manage other Fly.io resources like organizations, use the [GraphQL API](https://fly.io/docs/networking/custom-domains-with-fly/#graphql-api-notes).  ## Authentication  All requests must include the Fly API Token in the HTTP Headers as follows:  ``` Authorization: Bearer [TOKEN] ```  You can get your API token using [flyctl](https://fly.io/docs/hands-on/install-flyctl/) by running `fly auth token`  ## Base URL  The easiest (and recommended) way to connect to the Machines API is to use the public `api.machines.dev` endpoint, a simpler and more performant alternative to connecting over WireGuard. You can still access your Machines directly over a WireGuard VPN, and use the private Machines API endpoint: `http://_api.internal:4280`. This method requires more setup.  Follow the [instructions](https://fly.io/docs/networking/private-networking/#private-network-vpn) to set up a permanent WireGuard connection to your Fly.io [IPv6 private network](https://fly.io/docs/networking/private-networking/). Once you’re connected, Fly internal DNS should expose the Machines API endpoint at: `http://_api.internal:4280`  ## Response Codes  The API uses conventional HTTP status codes to signal whether a request was successful or not.  Typically, 2xx HTTP status codes denote successful operations, 4xx codes imply failures related to the user, and 5xx codes suggest problems with the infrastructure.  | Status | Description                                 | | :----: | ------------------------------------------- | | `200`  | Successful request.                         | | `201`  | Created successfully.                       | | `202`  | Successful request. No content.             | | `400`  | Check that the parameters were correct.     | | `401`  | The API key used was missing or invalid.    | | `404`  | The resource was not found.                 | | `5xx`  | Indicates an error with Fly.io API servers. | 

API version: 1.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package fly-sdk

import (
	"encoding/json"
)

// checks if the ApiMachineMetrics type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ApiMachineMetrics{}

// ApiMachineMetrics struct for ApiMachineMetrics
type ApiMachineMetrics struct {
	Path *string `json:"path,omitempty"`
	Port *int32 `json:"port,omitempty"`
}

// NewApiMachineMetrics instantiates a new ApiMachineMetrics object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewApiMachineMetrics() *ApiMachineMetrics {
	this := ApiMachineMetrics{}
	return &this
}

// NewApiMachineMetricsWithDefaults instantiates a new ApiMachineMetrics object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewApiMachineMetricsWithDefaults() *ApiMachineMetrics {
	this := ApiMachineMetrics{}
	return &this
}

// GetPath returns the Path field value if set, zero value otherwise.
func (o *ApiMachineMetrics) GetPath() string {
	if o == nil || IsNil(o.Path) {
		var ret string
		return ret
	}
	return *o.Path
}

// GetPathOk returns a tuple with the Path field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineMetrics) GetPathOk() (*string, bool) {
	if o == nil || IsNil(o.Path) {
		return nil, false
	}
	return o.Path, true
}

// HasPath returns a boolean if a field has been set.
func (o *ApiMachineMetrics) HasPath() bool {
	if o != nil && !IsNil(o.Path) {
		return true
	}

	return false
}

// SetPath gets a reference to the given string and assigns it to the Path field.
func (o *ApiMachineMetrics) SetPath(v string) {
	o.Path = &v
}

// GetPort returns the Port field value if set, zero value otherwise.
func (o *ApiMachineMetrics) GetPort() int32 {
	if o == nil || IsNil(o.Port) {
		var ret int32
		return ret
	}
	return *o.Port
}

// GetPortOk returns a tuple with the Port field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineMetrics) GetPortOk() (*int32, bool) {
	if o == nil || IsNil(o.Port) {
		return nil, false
	}
	return o.Port, true
}

// HasPort returns a boolean if a field has been set.
func (o *ApiMachineMetrics) HasPort() bool {
	if o != nil && !IsNil(o.Port) {
		return true
	}

	return false
}

// SetPort gets a reference to the given int32 and assigns it to the Port field.
func (o *ApiMachineMetrics) SetPort(v int32) {
	o.Port = &v
}

func (o ApiMachineMetrics) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ApiMachineMetrics) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Path) {
		toSerialize["path"] = o.Path
	}
	if !IsNil(o.Port) {
		toSerialize["port"] = o.Port
	}
	return toSerialize, nil
}

type NullableApiMachineMetrics struct {
	value *ApiMachineMetrics
	isSet bool
}

func (v NullableApiMachineMetrics) Get() *ApiMachineMetrics {
	return v.value
}

func (v *NullableApiMachineMetrics) Set(val *ApiMachineMetrics) {
	v.value = val
	v.isSet = true
}

func (v NullableApiMachineMetrics) IsSet() bool {
	return v.isSet
}

func (v *NullableApiMachineMetrics) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableApiMachineMetrics(val *ApiMachineMetrics) *NullableApiMachineMetrics {
	return &NullableApiMachineMetrics{value: val, isSet: true}
}

func (v NullableApiMachineMetrics) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableApiMachineMetrics) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


