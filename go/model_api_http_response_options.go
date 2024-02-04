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

// checks if the ApiHTTPResponseOptions type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ApiHTTPResponseOptions{}

// ApiHTTPResponseOptions struct for ApiHTTPResponseOptions
type ApiHTTPResponseOptions struct {
	Headers map[string]map[string]interface{} `json:"headers,omitempty"`
}

// NewApiHTTPResponseOptions instantiates a new ApiHTTPResponseOptions object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewApiHTTPResponseOptions() *ApiHTTPResponseOptions {
	this := ApiHTTPResponseOptions{}
	return &this
}

// NewApiHTTPResponseOptionsWithDefaults instantiates a new ApiHTTPResponseOptions object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewApiHTTPResponseOptionsWithDefaults() *ApiHTTPResponseOptions {
	this := ApiHTTPResponseOptions{}
	return &this
}

// GetHeaders returns the Headers field value if set, zero value otherwise.
func (o *ApiHTTPResponseOptions) GetHeaders() map[string]map[string]interface{} {
	if o == nil || IsNil(o.Headers) {
		var ret map[string]map[string]interface{}
		return ret
	}
	return o.Headers
}

// GetHeadersOk returns a tuple with the Headers field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiHTTPResponseOptions) GetHeadersOk() (map[string]map[string]interface{}, bool) {
	if o == nil || IsNil(o.Headers) {
		return map[string]map[string]interface{}{}, false
	}
	return o.Headers, true
}

// HasHeaders returns a boolean if a field has been set.
func (o *ApiHTTPResponseOptions) HasHeaders() bool {
	if o != nil && !IsNil(o.Headers) {
		return true
	}

	return false
}

// SetHeaders gets a reference to the given map[string]map[string]interface{} and assigns it to the Headers field.
func (o *ApiHTTPResponseOptions) SetHeaders(v map[string]map[string]interface{}) {
	o.Headers = v
}

func (o ApiHTTPResponseOptions) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ApiHTTPResponseOptions) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Headers) {
		toSerialize["headers"] = o.Headers
	}
	return toSerialize, nil
}

type NullableApiHTTPResponseOptions struct {
	value *ApiHTTPResponseOptions
	isSet bool
}

func (v NullableApiHTTPResponseOptions) Get() *ApiHTTPResponseOptions {
	return v.value
}

func (v *NullableApiHTTPResponseOptions) Set(val *ApiHTTPResponseOptions) {
	v.value = val
	v.isSet = true
}

func (v NullableApiHTTPResponseOptions) IsSet() bool {
	return v.isSet
}

func (v *NullableApiHTTPResponseOptions) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableApiHTTPResponseOptions(val *ApiHTTPResponseOptions) *NullableApiHTTPResponseOptions {
	return &NullableApiHTTPResponseOptions{value: val, isSet: true}
}

func (v NullableApiHTTPResponseOptions) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableApiHTTPResponseOptions) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


