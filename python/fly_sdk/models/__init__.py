# coding: utf-8

# flake8: noqa
"""
    Machines API

    # Introduction  Fly Machines are the compute behind the Fly.io platform. They are fast-launching VMs that can be started and stopped at subsecond speeds. A Machine is the configuration and state for a single VM running on our platform. Every Machine will belong to a Fly App; Apps can have more than one Machine. Read more [here](https://fly.io/docs/machines/).  The Machines REST API allows you to provison and manage Apps, Machines and Volumes on the Fly.io platform. To manage other Fly.io resources like organizations, use the [GraphQL API](https://fly.io/docs/networking/custom-domains-with-fly/#graphql-api-notes).  ## Authentication  All requests must include the Fly API Token in the HTTP Headers as follows:  ``` Authorization: Bearer [TOKEN] ```  You can get your API token using [flyctl](https://fly.io/docs/hands-on/install-flyctl/) by running `fly auth token`  ## Base URL  The easiest (and recommended) way to connect to the Machines API is to use the public `api.machines.dev` endpoint, a simpler and more performant alternative to connecting over WireGuard. You can still access your Machines directly over a WireGuard VPN, and use the private Machines API endpoint: `http://_api.internal:4280`. This method requires more setup.  Follow the [instructions](https://fly.io/docs/networking/private-networking/#private-network-vpn) to set up a permanent WireGuard connection to your Fly.io [IPv6 private network](https://fly.io/docs/networking/private-networking/). Once you’re connected, Fly internal DNS should expose the Machines API endpoint at: `http://_api.internal:4280`  ## Response Codes  The API uses conventional HTTP status codes to signal whether a request was successful or not.  Typically, 2xx HTTP status codes denote successful operations, 4xx codes imply failures related to the user, and 5xx codes suggest problems with the infrastructure.  | Status | Description                                 | | :----: | ------------------------------------------- | | `200`  | Successful request.                         | | `201`  | Created successfully.                       | | `202`  | Successful request. No content.             | | `400`  | Check that the parameters were correct.     | | `401`  | The API key used was missing or invalid.    | | `404`  | The resource was not found.                 | | `5xx`  | Indicates an error with Fly.io API servers. | 

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


# import models into model package
from fly_sdk.models.api_dns_config import ApiDNSConfig
from fly_sdk.models.api_dns_option import ApiDnsOption
from fly_sdk.models.api_file import ApiFile
from fly_sdk.models.api_http_options import ApiHTTPOptions
from fly_sdk.models.api_http_response_options import ApiHTTPResponseOptions
from fly_sdk.models.api_machine_check import ApiMachineCheck
from fly_sdk.models.api_machine_config import ApiMachineConfig
from fly_sdk.models.api_machine_guest import ApiMachineGuest
from fly_sdk.models.api_machine_http_header import ApiMachineHTTPHeader
from fly_sdk.models.api_machine_init import ApiMachineInit
from fly_sdk.models.api_machine_metrics import ApiMachineMetrics
from fly_sdk.models.api_machine_mount import ApiMachineMount
from fly_sdk.models.api_machine_port import ApiMachinePort
from fly_sdk.models.api_machine_process import ApiMachineProcess
from fly_sdk.models.api_machine_restart import ApiMachineRestart
from fly_sdk.models.api_machine_service import ApiMachineService
from fly_sdk.models.api_machine_service_concurrency import ApiMachineServiceConcurrency
from fly_sdk.models.api_proxy_proto_options import ApiProxyProtoOptions
from fly_sdk.models.api_static import ApiStatic
from fly_sdk.models.api_stop_config import ApiStopConfig
from fly_sdk.models.api_tls_options import ApiTLSOptions
from fly_sdk.models.app import App
from fly_sdk.models.check_status import CheckStatus
from fly_sdk.models.create_app_request import CreateAppRequest
from fly_sdk.models.create_lease_request import CreateLeaseRequest
from fly_sdk.models.create_machine_request import CreateMachineRequest
from fly_sdk.models.create_volume_request import CreateVolumeRequest
from fly_sdk.models.error_response import ErrorResponse
from fly_sdk.models.extend_volume_request import ExtendVolumeRequest
from fly_sdk.models.extend_volume_response import ExtendVolumeResponse
from fly_sdk.models.image_ref import ImageRef
from fly_sdk.models.lease import Lease
from fly_sdk.models.list_app import ListApp
from fly_sdk.models.list_apps_response import ListAppsResponse
from fly_sdk.models.listen_socket import ListenSocket
from fly_sdk.models.machine import Machine
from fly_sdk.models.machine_event import MachineEvent
from fly_sdk.models.machine_exec_request import MachineExecRequest
from fly_sdk.models.machine_version import MachineVersion
from fly_sdk.models.main_status_code import MainStatusCode
from fly_sdk.models.organization import Organization
from fly_sdk.models.process_stat import ProcessStat
from fly_sdk.models.signal_request import SignalRequest
from fly_sdk.models.stop_request import StopRequest
from fly_sdk.models.update_machine_request import UpdateMachineRequest
from fly_sdk.models.update_volume_request import UpdateVolumeRequest
from fly_sdk.models.volume import Volume
from fly_sdk.models.volume_snapshot import VolumeSnapshot
