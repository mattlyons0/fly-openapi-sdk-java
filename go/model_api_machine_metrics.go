/*
Fly Machines API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

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


