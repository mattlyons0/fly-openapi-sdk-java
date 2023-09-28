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

// checks if the MachineExecRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &MachineExecRequest{}

// MachineExecRequest struct for MachineExecRequest
type MachineExecRequest struct {
	// Deprecated: use Command instead
	Cmd *string `json:"cmd,omitempty"`
	Command []string `json:"command,omitempty"`
	Timeout *int32 `json:"timeout,omitempty"`
}

// NewMachineExecRequest instantiates a new MachineExecRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMachineExecRequest() *MachineExecRequest {
	this := MachineExecRequest{}
	return &this
}

// NewMachineExecRequestWithDefaults instantiates a new MachineExecRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMachineExecRequestWithDefaults() *MachineExecRequest {
	this := MachineExecRequest{}
	return &this
}

// GetCmd returns the Cmd field value if set, zero value otherwise.
func (o *MachineExecRequest) GetCmd() string {
	if o == nil || IsNil(o.Cmd) {
		var ret string
		return ret
	}
	return *o.Cmd
}

// GetCmdOk returns a tuple with the Cmd field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MachineExecRequest) GetCmdOk() (*string, bool) {
	if o == nil || IsNil(o.Cmd) {
		return nil, false
	}
	return o.Cmd, true
}

// HasCmd returns a boolean if a field has been set.
func (o *MachineExecRequest) HasCmd() bool {
	if o != nil && !IsNil(o.Cmd) {
		return true
	}

	return false
}

// SetCmd gets a reference to the given string and assigns it to the Cmd field.
func (o *MachineExecRequest) SetCmd(v string) {
	o.Cmd = &v
}

// GetCommand returns the Command field value if set, zero value otherwise.
func (o *MachineExecRequest) GetCommand() []string {
	if o == nil || IsNil(o.Command) {
		var ret []string
		return ret
	}
	return o.Command
}

// GetCommandOk returns a tuple with the Command field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MachineExecRequest) GetCommandOk() ([]string, bool) {
	if o == nil || IsNil(o.Command) {
		return nil, false
	}
	return o.Command, true
}

// HasCommand returns a boolean if a field has been set.
func (o *MachineExecRequest) HasCommand() bool {
	if o != nil && !IsNil(o.Command) {
		return true
	}

	return false
}

// SetCommand gets a reference to the given []string and assigns it to the Command field.
func (o *MachineExecRequest) SetCommand(v []string) {
	o.Command = v
}

// GetTimeout returns the Timeout field value if set, zero value otherwise.
func (o *MachineExecRequest) GetTimeout() int32 {
	if o == nil || IsNil(o.Timeout) {
		var ret int32
		return ret
	}
	return *o.Timeout
}

// GetTimeoutOk returns a tuple with the Timeout field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MachineExecRequest) GetTimeoutOk() (*int32, bool) {
	if o == nil || IsNil(o.Timeout) {
		return nil, false
	}
	return o.Timeout, true
}

// HasTimeout returns a boolean if a field has been set.
func (o *MachineExecRequest) HasTimeout() bool {
	if o != nil && !IsNil(o.Timeout) {
		return true
	}

	return false
}

// SetTimeout gets a reference to the given int32 and assigns it to the Timeout field.
func (o *MachineExecRequest) SetTimeout(v int32) {
	o.Timeout = &v
}

func (o MachineExecRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MachineExecRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Cmd) {
		toSerialize["cmd"] = o.Cmd
	}
	if !IsNil(o.Command) {
		toSerialize["command"] = o.Command
	}
	if !IsNil(o.Timeout) {
		toSerialize["timeout"] = o.Timeout
	}
	return toSerialize, nil
}

type NullableMachineExecRequest struct {
	value *MachineExecRequest
	isSet bool
}

func (v NullableMachineExecRequest) Get() *MachineExecRequest {
	return v.value
}

func (v *NullableMachineExecRequest) Set(val *MachineExecRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableMachineExecRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableMachineExecRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMachineExecRequest(val *MachineExecRequest) *NullableMachineExecRequest {
	return &NullableMachineExecRequest{value: val, isSet: true}
}

func (v NullableMachineExecRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMachineExecRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


