# coding: utf-8

"""
    Machines API

    # Introduction  Fly Machines are the compute behind the Fly.io platform. They are fast-launching VMs that can be started and stopped at subsecond speeds. A Machine is the configuration and state for a single VM running on our platform. Every Machine will belong to a Fly App; Apps can have more than one Machine. Read more [here](https://fly.io/docs/machines/).  The Machines REST API allows you to provison and manage Apps, Machines and Volumes on the Fly.io platform. To manage other Fly.io resources like organizations, use the [GraphQL API](https://fly.io/docs/networking/custom-domains-with-fly/#graphql-api-notes).  ## Authentication  All requests must include the Fly API Token in the HTTP Headers as follows:  ``` Authorization: Bearer [TOKEN] ```  You can get your API token using [flyctl](https://fly.io/docs/hands-on/install-flyctl/) by running `fly auth token`  ## Base URL  The easiest (and recommended) way to connect to the Machines API is to use the public `api.machines.dev` endpoint, a simpler and more performant alternative to connecting over WireGuard. You can still access your Machines directly over a WireGuard VPN, and use the private Machines API endpoint: `http://_api.internal:4280`. This method requires more setup.  Follow the [instructions](https://fly.io/docs/networking/private-networking/#private-network-vpn) to set up a permanent WireGuard connection to your Fly.io [IPv6 private network](https://fly.io/docs/networking/private-networking/). Once you’re connected, Fly internal DNS should expose the Machines API endpoint at: `http://_api.internal:4280`  ## Response Codes  The API uses conventional HTTP status codes to signal whether a request was successful or not.  Typically, 2xx HTTP status codes denote successful operations, 4xx codes imply failures related to the user, and 5xx codes suggest problems with the infrastructure.  | Status | Description                                 | | :----: | ------------------------------------------- | | `200`  | Successful request.                         | | `201`  | Created successfully.                       | | `202`  | Successful request. No content.             | | `400`  | Check that the parameters were correct.     | | `401`  | The API key used was missing or invalid.    | | `404`  | The resource was not found.                 | | `5xx`  | Indicates an error with Fly.io API servers. | 

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from fly_sdk.models.api_machine_metrics import ApiMachineMetrics

class TestApiMachineMetrics(unittest.TestCase):
    """ApiMachineMetrics unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ApiMachineMetrics:
        """Test ApiMachineMetrics
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ApiMachineMetrics`
        """
        model = ApiMachineMetrics()
        if include_optional:
            return ApiMachineMetrics(
                path = '',
                port = 56
            )
        else:
            return ApiMachineMetrics(
        )
        """

    def testApiMachineMetrics(self):
        """Test ApiMachineMetrics"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
