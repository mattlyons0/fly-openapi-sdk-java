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

from fly-sdk.models.app import App

class TestApp(unittest.TestCase):
    """App unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> App:
        """Test App
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `App`
        """
        model = App()
        if include_optional:
            return App(
                id = '',
                name = '',
                organization = fly-sdk.models.organization.Organization(
                    name = '', 
                    slug = '', ),
                status = ''
            )
        else:
            return App(
        )
        """

    def testApp(self):
        """Test App"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
