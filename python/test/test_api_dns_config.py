# coding: utf-8

"""
    Fly Machines API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from fly-sdk.models.api_dns_config import ApiDNSConfig  # noqa: E501

class TestApiDNSConfig(unittest.TestCase):
    """ApiDNSConfig unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ApiDNSConfig:
        """Test ApiDNSConfig
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ApiDNSConfig`
        """
        model = ApiDNSConfig()  # noqa: E501
        if include_optional:
            return ApiDNSConfig(
                skip_registration = True
            )
        else:
            return ApiDNSConfig(
        )
        """

    def testApiDNSConfig(self):
        """Test ApiDNSConfig"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
