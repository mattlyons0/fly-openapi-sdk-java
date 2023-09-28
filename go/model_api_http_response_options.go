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


