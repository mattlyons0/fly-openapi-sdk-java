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

// checks if the ApiMachineGuest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ApiMachineGuest{}

// ApiMachineGuest struct for ApiMachineGuest
type ApiMachineGuest struct {
	CpuKind *string `json:"cpu_kind,omitempty"`
	Cpus *int32 `json:"cpus,omitempty"`
	GpuKind *string `json:"gpu_kind,omitempty"`
	Gpus *int32 `json:"gpus,omitempty"`
	HostDedicationId *string `json:"host_dedication_id,omitempty"`
	KernelArgs []string `json:"kernel_args,omitempty"`
	MemoryMb *int32 `json:"memory_mb,omitempty"`
}

// NewApiMachineGuest instantiates a new ApiMachineGuest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewApiMachineGuest() *ApiMachineGuest {
	this := ApiMachineGuest{}
	return &this
}

// NewApiMachineGuestWithDefaults instantiates a new ApiMachineGuest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewApiMachineGuestWithDefaults() *ApiMachineGuest {
	this := ApiMachineGuest{}
	return &this
}

// GetCpuKind returns the CpuKind field value if set, zero value otherwise.
func (o *ApiMachineGuest) GetCpuKind() string {
	if o == nil || IsNil(o.CpuKind) {
		var ret string
		return ret
	}
	return *o.CpuKind
}

// GetCpuKindOk returns a tuple with the CpuKind field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineGuest) GetCpuKindOk() (*string, bool) {
	if o == nil || IsNil(o.CpuKind) {
		return nil, false
	}
	return o.CpuKind, true
}

// HasCpuKind returns a boolean if a field has been set.
func (o *ApiMachineGuest) HasCpuKind() bool {
	if o != nil && !IsNil(o.CpuKind) {
		return true
	}

	return false
}

// SetCpuKind gets a reference to the given string and assigns it to the CpuKind field.
func (o *ApiMachineGuest) SetCpuKind(v string) {
	o.CpuKind = &v
}

// GetCpus returns the Cpus field value if set, zero value otherwise.
func (o *ApiMachineGuest) GetCpus() int32 {
	if o == nil || IsNil(o.Cpus) {
		var ret int32
		return ret
	}
	return *o.Cpus
}

// GetCpusOk returns a tuple with the Cpus field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineGuest) GetCpusOk() (*int32, bool) {
	if o == nil || IsNil(o.Cpus) {
		return nil, false
	}
	return o.Cpus, true
}

// HasCpus returns a boolean if a field has been set.
func (o *ApiMachineGuest) HasCpus() bool {
	if o != nil && !IsNil(o.Cpus) {
		return true
	}

	return false
}

// SetCpus gets a reference to the given int32 and assigns it to the Cpus field.
func (o *ApiMachineGuest) SetCpus(v int32) {
	o.Cpus = &v
}

// GetGpuKind returns the GpuKind field value if set, zero value otherwise.
func (o *ApiMachineGuest) GetGpuKind() string {
	if o == nil || IsNil(o.GpuKind) {
		var ret string
		return ret
	}
	return *o.GpuKind
}

// GetGpuKindOk returns a tuple with the GpuKind field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineGuest) GetGpuKindOk() (*string, bool) {
	if o == nil || IsNil(o.GpuKind) {
		return nil, false
	}
	return o.GpuKind, true
}

// HasGpuKind returns a boolean if a field has been set.
func (o *ApiMachineGuest) HasGpuKind() bool {
	if o != nil && !IsNil(o.GpuKind) {
		return true
	}

	return false
}

// SetGpuKind gets a reference to the given string and assigns it to the GpuKind field.
func (o *ApiMachineGuest) SetGpuKind(v string) {
	o.GpuKind = &v
}

// GetGpus returns the Gpus field value if set, zero value otherwise.
func (o *ApiMachineGuest) GetGpus() int32 {
	if o == nil || IsNil(o.Gpus) {
		var ret int32
		return ret
	}
	return *o.Gpus
}

// GetGpusOk returns a tuple with the Gpus field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineGuest) GetGpusOk() (*int32, bool) {
	if o == nil || IsNil(o.Gpus) {
		return nil, false
	}
	return o.Gpus, true
}

// HasGpus returns a boolean if a field has been set.
func (o *ApiMachineGuest) HasGpus() bool {
	if o != nil && !IsNil(o.Gpus) {
		return true
	}

	return false
}

// SetGpus gets a reference to the given int32 and assigns it to the Gpus field.
func (o *ApiMachineGuest) SetGpus(v int32) {
	o.Gpus = &v
}

// GetHostDedicationId returns the HostDedicationId field value if set, zero value otherwise.
func (o *ApiMachineGuest) GetHostDedicationId() string {
	if o == nil || IsNil(o.HostDedicationId) {
		var ret string
		return ret
	}
	return *o.HostDedicationId
}

// GetHostDedicationIdOk returns a tuple with the HostDedicationId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineGuest) GetHostDedicationIdOk() (*string, bool) {
	if o == nil || IsNil(o.HostDedicationId) {
		return nil, false
	}
	return o.HostDedicationId, true
}

// HasHostDedicationId returns a boolean if a field has been set.
func (o *ApiMachineGuest) HasHostDedicationId() bool {
	if o != nil && !IsNil(o.HostDedicationId) {
		return true
	}

	return false
}

// SetHostDedicationId gets a reference to the given string and assigns it to the HostDedicationId field.
func (o *ApiMachineGuest) SetHostDedicationId(v string) {
	o.HostDedicationId = &v
}

// GetKernelArgs returns the KernelArgs field value if set, zero value otherwise.
func (o *ApiMachineGuest) GetKernelArgs() []string {
	if o == nil || IsNil(o.KernelArgs) {
		var ret []string
		return ret
	}
	return o.KernelArgs
}

// GetKernelArgsOk returns a tuple with the KernelArgs field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineGuest) GetKernelArgsOk() ([]string, bool) {
	if o == nil || IsNil(o.KernelArgs) {
		return nil, false
	}
	return o.KernelArgs, true
}

// HasKernelArgs returns a boolean if a field has been set.
func (o *ApiMachineGuest) HasKernelArgs() bool {
	if o != nil && !IsNil(o.KernelArgs) {
		return true
	}

	return false
}

// SetKernelArgs gets a reference to the given []string and assigns it to the KernelArgs field.
func (o *ApiMachineGuest) SetKernelArgs(v []string) {
	o.KernelArgs = v
}

// GetMemoryMb returns the MemoryMb field value if set, zero value otherwise.
func (o *ApiMachineGuest) GetMemoryMb() int32 {
	if o == nil || IsNil(o.MemoryMb) {
		var ret int32
		return ret
	}
	return *o.MemoryMb
}

// GetMemoryMbOk returns a tuple with the MemoryMb field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiMachineGuest) GetMemoryMbOk() (*int32, bool) {
	if o == nil || IsNil(o.MemoryMb) {
		return nil, false
	}
	return o.MemoryMb, true
}

// HasMemoryMb returns a boolean if a field has been set.
func (o *ApiMachineGuest) HasMemoryMb() bool {
	if o != nil && !IsNil(o.MemoryMb) {
		return true
	}

	return false
}

// SetMemoryMb gets a reference to the given int32 and assigns it to the MemoryMb field.
func (o *ApiMachineGuest) SetMemoryMb(v int32) {
	o.MemoryMb = &v
}

func (o ApiMachineGuest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ApiMachineGuest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.CpuKind) {
		toSerialize["cpu_kind"] = o.CpuKind
	}
	if !IsNil(o.Cpus) {
		toSerialize["cpus"] = o.Cpus
	}
	if !IsNil(o.GpuKind) {
		toSerialize["gpu_kind"] = o.GpuKind
	}
	if !IsNil(o.Gpus) {
		toSerialize["gpus"] = o.Gpus
	}
	if !IsNil(o.HostDedicationId) {
		toSerialize["host_dedication_id"] = o.HostDedicationId
	}
	if !IsNil(o.KernelArgs) {
		toSerialize["kernel_args"] = o.KernelArgs
	}
	if !IsNil(o.MemoryMb) {
		toSerialize["memory_mb"] = o.MemoryMb
	}
	return toSerialize, nil
}

type NullableApiMachineGuest struct {
	value *ApiMachineGuest
	isSet bool
}

func (v NullableApiMachineGuest) Get() *ApiMachineGuest {
	return v.value
}

func (v *NullableApiMachineGuest) Set(val *ApiMachineGuest) {
	v.value = val
	v.isSet = true
}

func (v NullableApiMachineGuest) IsSet() bool {
	return v.isSet
}

func (v *NullableApiMachineGuest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableApiMachineGuest(val *ApiMachineGuest) *NullableApiMachineGuest {
	return &NullableApiMachineGuest{value: val, isSet: true}
}

func (v NullableApiMachineGuest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableApiMachineGuest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


