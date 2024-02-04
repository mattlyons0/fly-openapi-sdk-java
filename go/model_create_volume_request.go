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

// checks if the CreateVolumeRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CreateVolumeRequest{}

// CreateVolumeRequest struct for CreateVolumeRequest
type CreateVolumeRequest struct {
	Compute *ApiMachineGuest `json:"compute,omitempty"`
	Encrypted *bool `json:"encrypted,omitempty"`
	Fstype *string `json:"fstype,omitempty"`
	MachinesOnly *bool `json:"machines_only,omitempty"`
	Name *string `json:"name,omitempty"`
	Region *string `json:"region,omitempty"`
	RequireUniqueZone *bool `json:"require_unique_zone,omitempty"`
	SizeGb *int32 `json:"size_gb,omitempty"`
	// restore from snapshot
	SnapshotId *string `json:"snapshot_id,omitempty"`
	SnapshotRetention *int32 `json:"snapshot_retention,omitempty"`
	// fork from remote volume
	SourceVolumeId *string `json:"source_volume_id,omitempty"`
}

// NewCreateVolumeRequest instantiates a new CreateVolumeRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateVolumeRequest() *CreateVolumeRequest {
	this := CreateVolumeRequest{}
	return &this
}

// NewCreateVolumeRequestWithDefaults instantiates a new CreateVolumeRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateVolumeRequestWithDefaults() *CreateVolumeRequest {
	this := CreateVolumeRequest{}
	return &this
}

// GetCompute returns the Compute field value if set, zero value otherwise.
func (o *CreateVolumeRequest) GetCompute() ApiMachineGuest {
	if o == nil || IsNil(o.Compute) {
		var ret ApiMachineGuest
		return ret
	}
	return *o.Compute
}

// GetComputeOk returns a tuple with the Compute field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateVolumeRequest) GetComputeOk() (*ApiMachineGuest, bool) {
	if o == nil || IsNil(o.Compute) {
		return nil, false
	}
	return o.Compute, true
}

// HasCompute returns a boolean if a field has been set.
func (o *CreateVolumeRequest) HasCompute() bool {
	if o != nil && !IsNil(o.Compute) {
		return true
	}

	return false
}

// SetCompute gets a reference to the given ApiMachineGuest and assigns it to the Compute field.
func (o *CreateVolumeRequest) SetCompute(v ApiMachineGuest) {
	o.Compute = &v
}

// GetEncrypted returns the Encrypted field value if set, zero value otherwise.
func (o *CreateVolumeRequest) GetEncrypted() bool {
	if o == nil || IsNil(o.Encrypted) {
		var ret bool
		return ret
	}
	return *o.Encrypted
}

// GetEncryptedOk returns a tuple with the Encrypted field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateVolumeRequest) GetEncryptedOk() (*bool, bool) {
	if o == nil || IsNil(o.Encrypted) {
		return nil, false
	}
	return o.Encrypted, true
}

// HasEncrypted returns a boolean if a field has been set.
func (o *CreateVolumeRequest) HasEncrypted() bool {
	if o != nil && !IsNil(o.Encrypted) {
		return true
	}

	return false
}

// SetEncrypted gets a reference to the given bool and assigns it to the Encrypted field.
func (o *CreateVolumeRequest) SetEncrypted(v bool) {
	o.Encrypted = &v
}

// GetFstype returns the Fstype field value if set, zero value otherwise.
func (o *CreateVolumeRequest) GetFstype() string {
	if o == nil || IsNil(o.Fstype) {
		var ret string
		return ret
	}
	return *o.Fstype
}

// GetFstypeOk returns a tuple with the Fstype field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateVolumeRequest) GetFstypeOk() (*string, bool) {
	if o == nil || IsNil(o.Fstype) {
		return nil, false
	}
	return o.Fstype, true
}

// HasFstype returns a boolean if a field has been set.
func (o *CreateVolumeRequest) HasFstype() bool {
	if o != nil && !IsNil(o.Fstype) {
		return true
	}

	return false
}

// SetFstype gets a reference to the given string and assigns it to the Fstype field.
func (o *CreateVolumeRequest) SetFstype(v string) {
	o.Fstype = &v
}

// GetMachinesOnly returns the MachinesOnly field value if set, zero value otherwise.
func (o *CreateVolumeRequest) GetMachinesOnly() bool {
	if o == nil || IsNil(o.MachinesOnly) {
		var ret bool
		return ret
	}
	return *o.MachinesOnly
}

// GetMachinesOnlyOk returns a tuple with the MachinesOnly field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateVolumeRequest) GetMachinesOnlyOk() (*bool, bool) {
	if o == nil || IsNil(o.MachinesOnly) {
		return nil, false
	}
	return o.MachinesOnly, true
}

// HasMachinesOnly returns a boolean if a field has been set.
func (o *CreateVolumeRequest) HasMachinesOnly() bool {
	if o != nil && !IsNil(o.MachinesOnly) {
		return true
	}

	return false
}

// SetMachinesOnly gets a reference to the given bool and assigns it to the MachinesOnly field.
func (o *CreateVolumeRequest) SetMachinesOnly(v bool) {
	o.MachinesOnly = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *CreateVolumeRequest) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateVolumeRequest) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *CreateVolumeRequest) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *CreateVolumeRequest) SetName(v string) {
	o.Name = &v
}

// GetRegion returns the Region field value if set, zero value otherwise.
func (o *CreateVolumeRequest) GetRegion() string {
	if o == nil || IsNil(o.Region) {
		var ret string
		return ret
	}
	return *o.Region
}

// GetRegionOk returns a tuple with the Region field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateVolumeRequest) GetRegionOk() (*string, bool) {
	if o == nil || IsNil(o.Region) {
		return nil, false
	}
	return o.Region, true
}

// HasRegion returns a boolean if a field has been set.
func (o *CreateVolumeRequest) HasRegion() bool {
	if o != nil && !IsNil(o.Region) {
		return true
	}

	return false
}

// SetRegion gets a reference to the given string and assigns it to the Region field.
func (o *CreateVolumeRequest) SetRegion(v string) {
	o.Region = &v
}

// GetRequireUniqueZone returns the RequireUniqueZone field value if set, zero value otherwise.
func (o *CreateVolumeRequest) GetRequireUniqueZone() bool {
	if o == nil || IsNil(o.RequireUniqueZone) {
		var ret bool
		return ret
	}
	return *o.RequireUniqueZone
}

// GetRequireUniqueZoneOk returns a tuple with the RequireUniqueZone field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateVolumeRequest) GetRequireUniqueZoneOk() (*bool, bool) {
	if o == nil || IsNil(o.RequireUniqueZone) {
		return nil, false
	}
	return o.RequireUniqueZone, true
}

// HasRequireUniqueZone returns a boolean if a field has been set.
func (o *CreateVolumeRequest) HasRequireUniqueZone() bool {
	if o != nil && !IsNil(o.RequireUniqueZone) {
		return true
	}

	return false
}

// SetRequireUniqueZone gets a reference to the given bool and assigns it to the RequireUniqueZone field.
func (o *CreateVolumeRequest) SetRequireUniqueZone(v bool) {
	o.RequireUniqueZone = &v
}

// GetSizeGb returns the SizeGb field value if set, zero value otherwise.
func (o *CreateVolumeRequest) GetSizeGb() int32 {
	if o == nil || IsNil(o.SizeGb) {
		var ret int32
		return ret
	}
	return *o.SizeGb
}

// GetSizeGbOk returns a tuple with the SizeGb field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateVolumeRequest) GetSizeGbOk() (*int32, bool) {
	if o == nil || IsNil(o.SizeGb) {
		return nil, false
	}
	return o.SizeGb, true
}

// HasSizeGb returns a boolean if a field has been set.
func (o *CreateVolumeRequest) HasSizeGb() bool {
	if o != nil && !IsNil(o.SizeGb) {
		return true
	}

	return false
}

// SetSizeGb gets a reference to the given int32 and assigns it to the SizeGb field.
func (o *CreateVolumeRequest) SetSizeGb(v int32) {
	o.SizeGb = &v
}

// GetSnapshotId returns the SnapshotId field value if set, zero value otherwise.
func (o *CreateVolumeRequest) GetSnapshotId() string {
	if o == nil || IsNil(o.SnapshotId) {
		var ret string
		return ret
	}
	return *o.SnapshotId
}

// GetSnapshotIdOk returns a tuple with the SnapshotId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateVolumeRequest) GetSnapshotIdOk() (*string, bool) {
	if o == nil || IsNil(o.SnapshotId) {
		return nil, false
	}
	return o.SnapshotId, true
}

// HasSnapshotId returns a boolean if a field has been set.
func (o *CreateVolumeRequest) HasSnapshotId() bool {
	if o != nil && !IsNil(o.SnapshotId) {
		return true
	}

	return false
}

// SetSnapshotId gets a reference to the given string and assigns it to the SnapshotId field.
func (o *CreateVolumeRequest) SetSnapshotId(v string) {
	o.SnapshotId = &v
}

// GetSnapshotRetention returns the SnapshotRetention field value if set, zero value otherwise.
func (o *CreateVolumeRequest) GetSnapshotRetention() int32 {
	if o == nil || IsNil(o.SnapshotRetention) {
		var ret int32
		return ret
	}
	return *o.SnapshotRetention
}

// GetSnapshotRetentionOk returns a tuple with the SnapshotRetention field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateVolumeRequest) GetSnapshotRetentionOk() (*int32, bool) {
	if o == nil || IsNil(o.SnapshotRetention) {
		return nil, false
	}
	return o.SnapshotRetention, true
}

// HasSnapshotRetention returns a boolean if a field has been set.
func (o *CreateVolumeRequest) HasSnapshotRetention() bool {
	if o != nil && !IsNil(o.SnapshotRetention) {
		return true
	}

	return false
}

// SetSnapshotRetention gets a reference to the given int32 and assigns it to the SnapshotRetention field.
func (o *CreateVolumeRequest) SetSnapshotRetention(v int32) {
	o.SnapshotRetention = &v
}

// GetSourceVolumeId returns the SourceVolumeId field value if set, zero value otherwise.
func (o *CreateVolumeRequest) GetSourceVolumeId() string {
	if o == nil || IsNil(o.SourceVolumeId) {
		var ret string
		return ret
	}
	return *o.SourceVolumeId
}

// GetSourceVolumeIdOk returns a tuple with the SourceVolumeId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateVolumeRequest) GetSourceVolumeIdOk() (*string, bool) {
	if o == nil || IsNil(o.SourceVolumeId) {
		return nil, false
	}
	return o.SourceVolumeId, true
}

// HasSourceVolumeId returns a boolean if a field has been set.
func (o *CreateVolumeRequest) HasSourceVolumeId() bool {
	if o != nil && !IsNil(o.SourceVolumeId) {
		return true
	}

	return false
}

// SetSourceVolumeId gets a reference to the given string and assigns it to the SourceVolumeId field.
func (o *CreateVolumeRequest) SetSourceVolumeId(v string) {
	o.SourceVolumeId = &v
}

func (o CreateVolumeRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreateVolumeRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Compute) {
		toSerialize["compute"] = o.Compute
	}
	if !IsNil(o.Encrypted) {
		toSerialize["encrypted"] = o.Encrypted
	}
	if !IsNil(o.Fstype) {
		toSerialize["fstype"] = o.Fstype
	}
	if !IsNil(o.MachinesOnly) {
		toSerialize["machines_only"] = o.MachinesOnly
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Region) {
		toSerialize["region"] = o.Region
	}
	if !IsNil(o.RequireUniqueZone) {
		toSerialize["require_unique_zone"] = o.RequireUniqueZone
	}
	if !IsNil(o.SizeGb) {
		toSerialize["size_gb"] = o.SizeGb
	}
	if !IsNil(o.SnapshotId) {
		toSerialize["snapshot_id"] = o.SnapshotId
	}
	if !IsNil(o.SnapshotRetention) {
		toSerialize["snapshot_retention"] = o.SnapshotRetention
	}
	if !IsNil(o.SourceVolumeId) {
		toSerialize["source_volume_id"] = o.SourceVolumeId
	}
	return toSerialize, nil
}

type NullableCreateVolumeRequest struct {
	value *CreateVolumeRequest
	isSet bool
}

func (v NullableCreateVolumeRequest) Get() *CreateVolumeRequest {
	return v.value
}

func (v *NullableCreateVolumeRequest) Set(val *CreateVolumeRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateVolumeRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateVolumeRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateVolumeRequest(val *CreateVolumeRequest) *NullableCreateVolumeRequest {
	return &NullableCreateVolumeRequest{value: val, isSet: true}
}

func (v NullableCreateVolumeRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateVolumeRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


