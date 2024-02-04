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

// checks if the ApiMachineInit type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ApiMachineInit{}

// ApiMachineInit struct for ApiMachineInit
type ApiMachineInit struct {
	Cmd []string `json:"cmd,omitempty"`
	Entrypoint []string `json:"entrypoint,omitempty"`
	Exec []string `json:"exec,omitempty"`
	KernelArgs []string `json:"kernel_args,omitempty"`
	SwapSizeMb *int32 `json:"swap_size_mb,omitempty"`
	Tty *bool `json:"tty,omitempty"`
}

// NewApiMachineInit instantiates a new ApiMachineInit object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewApiMachineInit() *ApiMachineInit {
	this := ApiMachineInit{}
	return &this
}

// NewApiMachineInitWithDefaults instantiates a new ApiMachineInit object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewApiMachineInitWithDefaults() *ApiMachineInit {
	this := ApiMachineInit{}
	return &this
}

// GetCmd returns the Cmd field value if set, zero value otherwise.
func (o *ApiMachineInit) GetCmd() []string {
	if o == nil || IsNil(o.Cmd) {
		var ret []string
		return ret
	}
	return o.Cmd
}

// GetCmdOk returns a tuple with the Cmd field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineInit) GetCmdOk() ([]string, bool) {
	if o == nil || IsNil(o.Cmd) {
		return nil, false
	}
	return o.Cmd, true
}

// HasCmd returns a boolean if a field has been set.
func (o *ApiMachineInit) HasCmd() bool {
	if o != nil && !IsNil(o.Cmd) {
		return true
	}

	return false
}

// SetCmd gets a reference to the given []string and assigns it to the Cmd field.
func (o *ApiMachineInit) SetCmd(v []string) {
	o.Cmd = v
}

// GetEntrypoint returns the Entrypoint field value if set, zero value otherwise.
func (o *ApiMachineInit) GetEntrypoint() []string {
	if o == nil || IsNil(o.Entrypoint) {
		var ret []string
		return ret
	}
	return o.Entrypoint
}

// GetEntrypointOk returns a tuple with the Entrypoint field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineInit) GetEntrypointOk() ([]string, bool) {
	if o == nil || IsNil(o.Entrypoint) {
		return nil, false
	}
	return o.Entrypoint, true
}

// HasEntrypoint returns a boolean if a field has been set.
func (o *ApiMachineInit) HasEntrypoint() bool {
	if o != nil && !IsNil(o.Entrypoint) {
		return true
	}

	return false
}

// SetEntrypoint gets a reference to the given []string and assigns it to the Entrypoint field.
func (o *ApiMachineInit) SetEntrypoint(v []string) {
	o.Entrypoint = v
}

// GetExec returns the Exec field value if set, zero value otherwise.
func (o *ApiMachineInit) GetExec() []string {
	if o == nil || IsNil(o.Exec) {
		var ret []string
		return ret
	}
	return o.Exec
}

// GetExecOk returns a tuple with the Exec field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineInit) GetExecOk() ([]string, bool) {
	if o == nil || IsNil(o.Exec) {
		return nil, false
	}
	return o.Exec, true
}

// HasExec returns a boolean if a field has been set.
func (o *ApiMachineInit) HasExec() bool {
	if o != nil && !IsNil(o.Exec) {
		return true
	}

	return false
}

// SetExec gets a reference to the given []string and assigns it to the Exec field.
func (o *ApiMachineInit) SetExec(v []string) {
	o.Exec = v
}

// GetKernelArgs returns the KernelArgs field value if set, zero value otherwise.
func (o *ApiMachineInit) GetKernelArgs() []string {
	if o == nil || IsNil(o.KernelArgs) {
		var ret []string
		return ret
	}
	return o.KernelArgs
}

// GetKernelArgsOk returns a tuple with the KernelArgs field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineInit) GetKernelArgsOk() ([]string, bool) {
	if o == nil || IsNil(o.KernelArgs) {
		return nil, false
	}
	return o.KernelArgs, true
}

// HasKernelArgs returns a boolean if a field has been set.
func (o *ApiMachineInit) HasKernelArgs() bool {
	if o != nil && !IsNil(o.KernelArgs) {
		return true
	}

	return false
}

// SetKernelArgs gets a reference to the given []string and assigns it to the KernelArgs field.
func (o *ApiMachineInit) SetKernelArgs(v []string) {
	o.KernelArgs = v
}

// GetSwapSizeMb returns the SwapSizeMb field value if set, zero value otherwise.
func (o *ApiMachineInit) GetSwapSizeMb() int32 {
	if o == nil || IsNil(o.SwapSizeMb) {
		var ret int32
		return ret
	}
	return *o.SwapSizeMb
}

// GetSwapSizeMbOk returns a tuple with the SwapSizeMb field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineInit) GetSwapSizeMbOk() (*int32, bool) {
	if o == nil || IsNil(o.SwapSizeMb) {
		return nil, false
	}
	return o.SwapSizeMb, true
}

// HasSwapSizeMb returns a boolean if a field has been set.
func (o *ApiMachineInit) HasSwapSizeMb() bool {
	if o != nil && !IsNil(o.SwapSizeMb) {
		return true
	}

	return false
}

// SetSwapSizeMb gets a reference to the given int32 and assigns it to the SwapSizeMb field.
func (o *ApiMachineInit) SetSwapSizeMb(v int32) {
	o.SwapSizeMb = &v
}

// GetTty returns the Tty field value if set, zero value otherwise.
func (o *ApiMachineInit) GetTty() bool {
	if o == nil || IsNil(o.Tty) {
		var ret bool
		return ret
	}
	return *o.Tty
}

// GetTtyOk returns a tuple with the Tty field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineInit) GetTtyOk() (*bool, bool) {
	if o == nil || IsNil(o.Tty) {
		return nil, false
	}
	return o.Tty, true
}

// HasTty returns a boolean if a field has been set.
func (o *ApiMachineInit) HasTty() bool {
	if o != nil && !IsNil(o.Tty) {
		return true
	}

	return false
}

// SetTty gets a reference to the given bool and assigns it to the Tty field.
func (o *ApiMachineInit) SetTty(v bool) {
	o.Tty = &v
}

func (o ApiMachineInit) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ApiMachineInit) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Cmd) {
		toSerialize["cmd"] = o.Cmd
	}
	if !IsNil(o.Entrypoint) {
		toSerialize["entrypoint"] = o.Entrypoint
	}
	if !IsNil(o.Exec) {
		toSerialize["exec"] = o.Exec
	}
	if !IsNil(o.KernelArgs) {
		toSerialize["kernel_args"] = o.KernelArgs
	}
	if !IsNil(o.SwapSizeMb) {
		toSerialize["swap_size_mb"] = o.SwapSizeMb
	}
	if !IsNil(o.Tty) {
		toSerialize["tty"] = o.Tty
	}
	return toSerialize, nil
}

type NullableApiMachineInit struct {
	value *ApiMachineInit
	isSet bool
}

func (v NullableApiMachineInit) Get() *ApiMachineInit {
	return v.value
}

func (v *NullableApiMachineInit) Set(val *ApiMachineInit) {
	v.value = val
	v.isSet = true
}

func (v NullableApiMachineInit) IsSet() bool {
	return v.isSet
}

func (v *NullableApiMachineInit) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableApiMachineInit(val *ApiMachineInit) *NullableApiMachineInit {
	return &NullableApiMachineInit{value: val, isSet: true}
}

func (v NullableApiMachineInit) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableApiMachineInit) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


