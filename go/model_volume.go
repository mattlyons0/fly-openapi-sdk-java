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

// checks if the Volume type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Volume{}

// Volume struct for Volume
type Volume struct {
	AttachedAllocId *string `json:"attached_alloc_id,omitempty"`
	AttachedMachineId *string `json:"attached_machine_id,omitempty"`
	BlockSize *int32 `json:"block_size,omitempty"`
	Blocks *int32 `json:"blocks,omitempty"`
	BlocksAvail *int32 `json:"blocks_avail,omitempty"`
	BlocksFree *int32 `json:"blocks_free,omitempty"`
	CreatedAt *string `json:"created_at,omitempty"`
	Encrypted *bool `json:"encrypted,omitempty"`
	Fstype *string `json:"fstype,omitempty"`
	Id *string `json:"id,omitempty"`
	Name *string `json:"name,omitempty"`
	Region *string `json:"region,omitempty"`
	SizeGb *int32 `json:"size_gb,omitempty"`
	State *string `json:"state,omitempty"`
	Zone *string `json:"zone,omitempty"`
}

// NewVolume instantiates a new Volume object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVolume() *Volume {
	this := Volume{}
	return &this
}

// NewVolumeWithDefaults instantiates a new Volume object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVolumeWithDefaults() *Volume {
	this := Volume{}
	return &this
}

// GetAttachedAllocId returns the AttachedAllocId field value if set, zero value otherwise.
func (o *Volume) GetAttachedAllocId() string {
	if o == nil || IsNil(o.AttachedAllocId) {
		var ret string
		return ret
	}
	return *o.AttachedAllocId
}

// GetAttachedAllocIdOk returns a tuple with the AttachedAllocId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetAttachedAllocIdOk() (*string, bool) {
	if o == nil || IsNil(o.AttachedAllocId) {
		return nil, false
	}
	return o.AttachedAllocId, true
}

// HasAttachedAllocId returns a boolean if a field has been set.
func (o *Volume) HasAttachedAllocId() bool {
	if o != nil && !IsNil(o.AttachedAllocId) {
		return true
	}

	return false
}

// SetAttachedAllocId gets a reference to the given string and assigns it to the AttachedAllocId field.
func (o *Volume) SetAttachedAllocId(v string) {
	o.AttachedAllocId = &v
}

// GetAttachedMachineId returns the AttachedMachineId field value if set, zero value otherwise.
func (o *Volume) GetAttachedMachineId() string {
	if o == nil || IsNil(o.AttachedMachineId) {
		var ret string
		return ret
	}
	return *o.AttachedMachineId
}

// GetAttachedMachineIdOk returns a tuple with the AttachedMachineId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetAttachedMachineIdOk() (*string, bool) {
	if o == nil || IsNil(o.AttachedMachineId) {
		return nil, false
	}
	return o.AttachedMachineId, true
}

// HasAttachedMachineId returns a boolean if a field has been set.
func (o *Volume) HasAttachedMachineId() bool {
	if o != nil && !IsNil(o.AttachedMachineId) {
		return true
	}

	return false
}

// SetAttachedMachineId gets a reference to the given string and assigns it to the AttachedMachineId field.
func (o *Volume) SetAttachedMachineId(v string) {
	o.AttachedMachineId = &v
}

// GetBlockSize returns the BlockSize field value if set, zero value otherwise.
func (o *Volume) GetBlockSize() int32 {
	if o == nil || IsNil(o.BlockSize) {
		var ret int32
		return ret
	}
	return *o.BlockSize
}

// GetBlockSizeOk returns a tuple with the BlockSize field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetBlockSizeOk() (*int32, bool) {
	if o == nil || IsNil(o.BlockSize) {
		return nil, false
	}
	return o.BlockSize, true
}

// HasBlockSize returns a boolean if a field has been set.
func (o *Volume) HasBlockSize() bool {
	if o != nil && !IsNil(o.BlockSize) {
		return true
	}

	return false
}

// SetBlockSize gets a reference to the given int32 and assigns it to the BlockSize field.
func (o *Volume) SetBlockSize(v int32) {
	o.BlockSize = &v
}

// GetBlocks returns the Blocks field value if set, zero value otherwise.
func (o *Volume) GetBlocks() int32 {
	if o == nil || IsNil(o.Blocks) {
		var ret int32
		return ret
	}
	return *o.Blocks
}

// GetBlocksOk returns a tuple with the Blocks field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetBlocksOk() (*int32, bool) {
	if o == nil || IsNil(o.Blocks) {
		return nil, false
	}
	return o.Blocks, true
}

// HasBlocks returns a boolean if a field has been set.
func (o *Volume) HasBlocks() bool {
	if o != nil && !IsNil(o.Blocks) {
		return true
	}

	return false
}

// SetBlocks gets a reference to the given int32 and assigns it to the Blocks field.
func (o *Volume) SetBlocks(v int32) {
	o.Blocks = &v
}

// GetBlocksAvail returns the BlocksAvail field value if set, zero value otherwise.
func (o *Volume) GetBlocksAvail() int32 {
	if o == nil || IsNil(o.BlocksAvail) {
		var ret int32
		return ret
	}
	return *o.BlocksAvail
}

// GetBlocksAvailOk returns a tuple with the BlocksAvail field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetBlocksAvailOk() (*int32, bool) {
	if o == nil || IsNil(o.BlocksAvail) {
		return nil, false
	}
	return o.BlocksAvail, true
}

// HasBlocksAvail returns a boolean if a field has been set.
func (o *Volume) HasBlocksAvail() bool {
	if o != nil && !IsNil(o.BlocksAvail) {
		return true
	}

	return false
}

// SetBlocksAvail gets a reference to the given int32 and assigns it to the BlocksAvail field.
func (o *Volume) SetBlocksAvail(v int32) {
	o.BlocksAvail = &v
}

// GetBlocksFree returns the BlocksFree field value if set, zero value otherwise.
func (o *Volume) GetBlocksFree() int32 {
	if o == nil || IsNil(o.BlocksFree) {
		var ret int32
		return ret
	}
	return *o.BlocksFree
}

// GetBlocksFreeOk returns a tuple with the BlocksFree field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetBlocksFreeOk() (*int32, bool) {
	if o == nil || IsNil(o.BlocksFree) {
		return nil, false
	}
	return o.BlocksFree, true
}

// HasBlocksFree returns a boolean if a field has been set.
func (o *Volume) HasBlocksFree() bool {
	if o != nil && !IsNil(o.BlocksFree) {
		return true
	}

	return false
}

// SetBlocksFree gets a reference to the given int32 and assigns it to the BlocksFree field.
func (o *Volume) SetBlocksFree(v int32) {
	o.BlocksFree = &v
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *Volume) GetCreatedAt() string {
	if o == nil || IsNil(o.CreatedAt) {
		var ret string
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetCreatedAtOk() (*string, bool) {
	if o == nil || IsNil(o.CreatedAt) {
		return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *Volume) HasCreatedAt() bool {
	if o != nil && !IsNil(o.CreatedAt) {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given string and assigns it to the CreatedAt field.
func (o *Volume) SetCreatedAt(v string) {
	o.CreatedAt = &v
}

// GetEncrypted returns the Encrypted field value if set, zero value otherwise.
func (o *Volume) GetEncrypted() bool {
	if o == nil || IsNil(o.Encrypted) {
		var ret bool
		return ret
	}
	return *o.Encrypted
}

// GetEncryptedOk returns a tuple with the Encrypted field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetEncryptedOk() (*bool, bool) {
	if o == nil || IsNil(o.Encrypted) {
		return nil, false
	}
	return o.Encrypted, true
}

// HasEncrypted returns a boolean if a field has been set.
func (o *Volume) HasEncrypted() bool {
	if o != nil && !IsNil(o.Encrypted) {
		return true
	}

	return false
}

// SetEncrypted gets a reference to the given bool and assigns it to the Encrypted field.
func (o *Volume) SetEncrypted(v bool) {
	o.Encrypted = &v
}

// GetFstype returns the Fstype field value if set, zero value otherwise.
func (o *Volume) GetFstype() string {
	if o == nil || IsNil(o.Fstype) {
		var ret string
		return ret
	}
	return *o.Fstype
}

// GetFstypeOk returns a tuple with the Fstype field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetFstypeOk() (*string, bool) {
	if o == nil || IsNil(o.Fstype) {
		return nil, false
	}
	return o.Fstype, true
}

// HasFstype returns a boolean if a field has been set.
func (o *Volume) HasFstype() bool {
	if o != nil && !IsNil(o.Fstype) {
		return true
	}

	return false
}

// SetFstype gets a reference to the given string and assigns it to the Fstype field.
func (o *Volume) SetFstype(v string) {
	o.Fstype = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *Volume) GetId() string {
	if o == nil || IsNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetIdOk() (*string, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *Volume) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *Volume) SetId(v string) {
	o.Id = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *Volume) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *Volume) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *Volume) SetName(v string) {
	o.Name = &v
}

// GetRegion returns the Region field value if set, zero value otherwise.
func (o *Volume) GetRegion() string {
	if o == nil || IsNil(o.Region) {
		var ret string
		return ret
	}
	return *o.Region
}

// GetRegionOk returns a tuple with the Region field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetRegionOk() (*string, bool) {
	if o == nil || IsNil(o.Region) {
		return nil, false
	}
	return o.Region, true
}

// HasRegion returns a boolean if a field has been set.
func (o *Volume) HasRegion() bool {
	if o != nil && !IsNil(o.Region) {
		return true
	}

	return false
}

// SetRegion gets a reference to the given string and assigns it to the Region field.
func (o *Volume) SetRegion(v string) {
	o.Region = &v
}

// GetSizeGb returns the SizeGb field value if set, zero value otherwise.
func (o *Volume) GetSizeGb() int32 {
	if o == nil || IsNil(o.SizeGb) {
		var ret int32
		return ret
	}
	return *o.SizeGb
}

// GetSizeGbOk returns a tuple with the SizeGb field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetSizeGbOk() (*int32, bool) {
	if o == nil || IsNil(o.SizeGb) {
		return nil, false
	}
	return o.SizeGb, true
}

// HasSizeGb returns a boolean if a field has been set.
func (o *Volume) HasSizeGb() bool {
	if o != nil && !IsNil(o.SizeGb) {
		return true
	}

	return false
}

// SetSizeGb gets a reference to the given int32 and assigns it to the SizeGb field.
func (o *Volume) SetSizeGb(v int32) {
	o.SizeGb = &v
}

// GetState returns the State field value if set, zero value otherwise.
func (o *Volume) GetState() string {
	if o == nil || IsNil(o.State) {
		var ret string
		return ret
	}
	return *o.State
}

// GetStateOk returns a tuple with the State field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetStateOk() (*string, bool) {
	if o == nil || IsNil(o.State) {
		return nil, false
	}
	return o.State, true
}

// HasState returns a boolean if a field has been set.
func (o *Volume) HasState() bool {
	if o != nil && !IsNil(o.State) {
		return true
	}

	return false
}

// SetState gets a reference to the given string and assigns it to the State field.
func (o *Volume) SetState(v string) {
	o.State = &v
}

// GetZone returns the Zone field value if set, zero value otherwise.
func (o *Volume) GetZone() string {
	if o == nil || IsNil(o.Zone) {
		var ret string
		return ret
	}
	return *o.Zone
}

// GetZoneOk returns a tuple with the Zone field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Volume) GetZoneOk() (*string, bool) {
	if o == nil || IsNil(o.Zone) {
		return nil, false
	}
	return o.Zone, true
}

// HasZone returns a boolean if a field has been set.
func (o *Volume) HasZone() bool {
	if o != nil && !IsNil(o.Zone) {
		return true
	}

	return false
}

// SetZone gets a reference to the given string and assigns it to the Zone field.
func (o *Volume) SetZone(v string) {
	o.Zone = &v
}

func (o Volume) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Volume) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.AttachedAllocId) {
		toSerialize["attached_alloc_id"] = o.AttachedAllocId
	}
	if !IsNil(o.AttachedMachineId) {
		toSerialize["attached_machine_id"] = o.AttachedMachineId
	}
	if !IsNil(o.BlockSize) {
		toSerialize["block_size"] = o.BlockSize
	}
	if !IsNil(o.Blocks) {
		toSerialize["blocks"] = o.Blocks
	}
	if !IsNil(o.BlocksAvail) {
		toSerialize["blocks_avail"] = o.BlocksAvail
	}
	if !IsNil(o.BlocksFree) {
		toSerialize["blocks_free"] = o.BlocksFree
	}
	if !IsNil(o.CreatedAt) {
		toSerialize["created_at"] = o.CreatedAt
	}
	if !IsNil(o.Encrypted) {
		toSerialize["encrypted"] = o.Encrypted
	}
	if !IsNil(o.Fstype) {
		toSerialize["fstype"] = o.Fstype
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Region) {
		toSerialize["region"] = o.Region
	}
	if !IsNil(o.SizeGb) {
		toSerialize["size_gb"] = o.SizeGb
	}
	if !IsNil(o.State) {
		toSerialize["state"] = o.State
	}
	if !IsNil(o.Zone) {
		toSerialize["zone"] = o.Zone
	}
	return toSerialize, nil
}

type NullableVolume struct {
	value *Volume
	isSet bool
}

func (v NullableVolume) Get() *Volume {
	return v.value
}

func (v *NullableVolume) Set(val *Volume) {
	v.value = val
	v.isSet = true
}

func (v NullableVolume) IsSet() bool {
	return v.isSet
}

func (v *NullableVolume) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVolume(val *Volume) *NullableVolume {
	return &NullableVolume{value: val, isSet: true}
}

func (v NullableVolume) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVolume) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


