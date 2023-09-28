# coding: utf-8

"""
    Fly Machines API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional
from pydantic import BaseModel, StrictInt, StrictStr
from pydantic import Field

class Lease(BaseModel):
    """
    Lease
    """
    description: Optional[StrictStr] = Field(default=None, description="Description or reason for the Lease.")
    expires_at: Optional[StrictInt] = Field(default=None, description="ExpiresAt is the unix timestamp in UTC to denote when the Lease will no longer be valid.")
    nonce: Optional[StrictStr] = Field(default=None, description="Nonce is the unique ID autogenerated and associated with the Lease.")
    owner: Optional[StrictStr] = Field(default=None, description="Owner is the user identifier which acquired the Lease.")
    __properties = ["description", "expires_at", "nonce", "owner"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Lease:
        """Create an instance of Lease from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Lease:
        """Create an instance of Lease from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Lease.parse_obj(obj)

        _obj = Lease.parse_obj({
            "description": obj.get("description"),
            "expires_at": obj.get("expires_at"),
            "nonce": obj.get("nonce"),
            "owner": obj.get("owner")
        })
        return _obj


