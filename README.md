# fly-sdk

Machines API

- API version: 1.0

# Introduction

Fly Machines are the compute behind the Fly.io platform. They are fast-launching VMs that can be started and stopped at subsecond speeds. A Machine is the configuration and state for a single VM running on our platform. Every Machine will belong to a Fly App; Apps can have more than one Machine. Read more [here](https://fly.io/docs/machines/).

The Machines REST API allows you to provison and manage Apps, Machines and Volumes on the Fly.io platform. To manage other Fly.io resources like organizations, use the [GraphQL API](https://fly.io/docs/networking/custom-domains-with-fly/#graphql-api-notes).

## Authentication

All requests must include the Fly API Token in the HTTP Headers as follows:

```
Authorization: Bearer [TOKEN]
```

You can get your API token using [flyctl](https://fly.io/docs/hands-on/install-flyctl/) by running `fly auth token`

## Base URL

The easiest (and recommended) way to connect to the Machines API is to use the public `api.machines.dev` endpoint, a simpler and more performant alternative to connecting over WireGuard. You can still access your Machines directly over a WireGuard VPN, and use the private Machines API endpoint: `http://_api.internal:4280`. This method requires more setup.

Follow the [instructions](https://fly.io/docs/networking/private-networking/#private-network-vpn) to set up a permanent WireGuard connection to your Fly.io [IPv6 private network](https://fly.io/docs/networking/private-networking/). Once you’re connected, Fly internal DNS should expose the Machines API endpoint at: `http://_api.internal:4280`

## Response Codes

The API uses conventional HTTP status codes to signal whether a request was successful or not.

Typically, 2xx HTTP status codes denote successful operations, 4xx codes imply failures related to the user, and 5xx codes suggest problems with the infrastructure.

| Status | Description                                 |
| :----: | ------------------------------------------- |
| `200`  | Successful request.                         |
| `201`  | Created successfully.                       |
| `202`  | Successful request. No content.             |
| `400`  | Check that the parameters were correct.     |
| `401`  | The API key used was missing or invalid.    |
| `404`  | The resource was not found.                 |
| `5xx`  | Indicates an error with Fly.io API servers. |



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.fly</groupId>
  <artifactId>fly-sdk</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'fly-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'fly-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "io.fly:fly-sdk:1.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/fly-sdk-1.1.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.fly.client.*;
import io.fly.client.auth.*;
import io.fly.client.model.*;
import io.fly.sdk.AppsApi;

public class AppsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.machines.dev/v1");
        
        AppsApi apiInstance = new AppsApi(defaultClient);
        CreateAppRequest request = new CreateAppRequest(); // CreateAppRequest | App body
        try {
            apiInstance.appsCreate(request);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppsApi#appsCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.machines.dev/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppsApi* | [**appsCreate**](docs/AppsApi.md#appsCreate) | **POST** /apps | Create App
*AppsApi* | [**appsDelete**](docs/AppsApi.md#appsDelete) | **DELETE** /apps/{app_name} | Destroy App
*AppsApi* | [**appsList**](docs/AppsApi.md#appsList) | **GET** /apps | List Apps
*AppsApi* | [**appsShow**](docs/AppsApi.md#appsShow) | **GET** /apps/{app_name} | Get App
*MachinesApi* | [**machinesCordon**](docs/MachinesApi.md#machinesCordon) | **POST** /apps/{app_name}/machines/{machine_id}/cordon | Cordon Machine
*MachinesApi* | [**machinesCreate**](docs/MachinesApi.md#machinesCreate) | **POST** /apps/{app_name}/machines | Create Machine
*MachinesApi* | [**machinesCreateLease**](docs/MachinesApi.md#machinesCreateLease) | **POST** /apps/{app_name}/machines/{machine_id}/lease | Create Lease
*MachinesApi* | [**machinesDelete**](docs/MachinesApi.md#machinesDelete) | **DELETE** /apps/{app_name}/machines/{machine_id} | Destroy Machine
*MachinesApi* | [**machinesDeleteMetadata**](docs/MachinesApi.md#machinesDeleteMetadata) | **DELETE** /apps/{app_name}/machines/{machine_id}/metadata/{key} | Delete Metadata
*MachinesApi* | [**machinesExec**](docs/MachinesApi.md#machinesExec) | **POST** /apps/{app_name}/machines/{machine_id}/exec | Execute Command
*MachinesApi* | [**machinesList**](docs/MachinesApi.md#machinesList) | **GET** /apps/{app_name}/machines | List Machines
*MachinesApi* | [**machinesListEvents**](docs/MachinesApi.md#machinesListEvents) | **GET** /apps/{app_name}/machines/{machine_id}/events | List Events
*MachinesApi* | [**machinesListProcesses**](docs/MachinesApi.md#machinesListProcesses) | **GET** /apps/{app_name}/machines/{machine_id}/ps | List Processes
*MachinesApi* | [**machinesListVersions**](docs/MachinesApi.md#machinesListVersions) | **GET** /apps/{app_name}/machines/{machine_id}/versions | List Versions
*MachinesApi* | [**machinesReleaseLease**](docs/MachinesApi.md#machinesReleaseLease) | **DELETE** /apps/{app_name}/machines/{machine_id}/lease | Release Lease
*MachinesApi* | [**machinesRestart**](docs/MachinesApi.md#machinesRestart) | **POST** /apps/{app_name}/machines/{machine_id}/restart | Restart Machine
*MachinesApi* | [**machinesShow**](docs/MachinesApi.md#machinesShow) | **GET** /apps/{app_name}/machines/{machine_id} | Get Machine
*MachinesApi* | [**machinesShowLease**](docs/MachinesApi.md#machinesShowLease) | **GET** /apps/{app_name}/machines/{machine_id}/lease | Get Lease
*MachinesApi* | [**machinesShowMetadata**](docs/MachinesApi.md#machinesShowMetadata) | **GET** /apps/{app_name}/machines/{machine_id}/metadata | Get Metadata
*MachinesApi* | [**machinesSignal**](docs/MachinesApi.md#machinesSignal) | **POST** /apps/{app_name}/machines/{machine_id}/signal | Signal Machine
*MachinesApi* | [**machinesStart**](docs/MachinesApi.md#machinesStart) | **POST** /apps/{app_name}/machines/{machine_id}/start | Start Machine
*MachinesApi* | [**machinesStop**](docs/MachinesApi.md#machinesStop) | **POST** /apps/{app_name}/machines/{machine_id}/stop | Stop Machine
*MachinesApi* | [**machinesUncordon**](docs/MachinesApi.md#machinesUncordon) | **POST** /apps/{app_name}/machines/{machine_id}/uncordon | Uncordon Machine
*MachinesApi* | [**machinesUpdate**](docs/MachinesApi.md#machinesUpdate) | **POST** /apps/{app_name}/machines/{machine_id} | Update Machine
*MachinesApi* | [**machinesUpdateMetadata**](docs/MachinesApi.md#machinesUpdateMetadata) | **POST** /apps/{app_name}/machines/{machine_id}/metadata/{key} | Update Metadata
*MachinesApi* | [**machinesWait**](docs/MachinesApi.md#machinesWait) | **GET** /apps/{app_name}/machines/{machine_id}/wait | Wait for State
*VolumesApi* | [**createVolumeSnapshot**](docs/VolumesApi.md#createVolumeSnapshot) | **POST** /apps/{app_name}/volumes/{volume_id}/snapshots | Create Snapshot
*VolumesApi* | [**volumeDelete**](docs/VolumesApi.md#volumeDelete) | **DELETE** /apps/{app_name}/volumes/{volume_id} | Destroy Volume
*VolumesApi* | [**volumesCreate**](docs/VolumesApi.md#volumesCreate) | **POST** /apps/{app_name}/volumes | Create Volume
*VolumesApi* | [**volumesExtend**](docs/VolumesApi.md#volumesExtend) | **PUT** /apps/{app_name}/volumes/{volume_id}/extend | Extend Volume
*VolumesApi* | [**volumesGetById**](docs/VolumesApi.md#volumesGetById) | **GET** /apps/{app_name}/volumes/{volume_id} | Get Volume
*VolumesApi* | [**volumesList**](docs/VolumesApi.md#volumesList) | **GET** /apps/{app_name}/volumes | List Volumes
*VolumesApi* | [**volumesListSnapshots**](docs/VolumesApi.md#volumesListSnapshots) | **GET** /apps/{app_name}/volumes/{volume_id}/snapshots | List Snapshots
*VolumesApi* | [**volumesUpdate**](docs/VolumesApi.md#volumesUpdate) | **POST** /apps/{app_name}/volumes/{volume_id} | Update Volume


## Documentation for Models

 - [ApiDNSConfig](docs/ApiDNSConfig.md)
 - [ApiDnsOption](docs/ApiDnsOption.md)
 - [ApiFile](docs/ApiFile.md)
 - [ApiHTTPOptions](docs/ApiHTTPOptions.md)
 - [ApiHTTPResponseOptions](docs/ApiHTTPResponseOptions.md)
 - [ApiMachineCheck](docs/ApiMachineCheck.md)
 - [ApiMachineConfig](docs/ApiMachineConfig.md)
 - [ApiMachineGuest](docs/ApiMachineGuest.md)
 - [ApiMachineHTTPHeader](docs/ApiMachineHTTPHeader.md)
 - [ApiMachineInit](docs/ApiMachineInit.md)
 - [ApiMachineMetrics](docs/ApiMachineMetrics.md)
 - [ApiMachineMount](docs/ApiMachineMount.md)
 - [ApiMachinePort](docs/ApiMachinePort.md)
 - [ApiMachineProcess](docs/ApiMachineProcess.md)
 - [ApiMachineRestart](docs/ApiMachineRestart.md)
 - [ApiMachineService](docs/ApiMachineService.md)
 - [ApiMachineServiceConcurrency](docs/ApiMachineServiceConcurrency.md)
 - [ApiProxyProtoOptions](docs/ApiProxyProtoOptions.md)
 - [ApiStatic](docs/ApiStatic.md)
 - [ApiStopConfig](docs/ApiStopConfig.md)
 - [ApiTLSOptions](docs/ApiTLSOptions.md)
 - [App](docs/App.md)
 - [CheckStatus](docs/CheckStatus.md)
 - [CreateAppRequest](docs/CreateAppRequest.md)
 - [CreateLeaseRequest](docs/CreateLeaseRequest.md)
 - [CreateMachineRequest](docs/CreateMachineRequest.md)
 - [CreateVolumeRequest](docs/CreateVolumeRequest.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ExtendVolumeRequest](docs/ExtendVolumeRequest.md)
 - [ExtendVolumeResponse](docs/ExtendVolumeResponse.md)
 - [ImageRef](docs/ImageRef.md)
 - [Lease](docs/Lease.md)
 - [ListApp](docs/ListApp.md)
 - [ListAppsResponse](docs/ListAppsResponse.md)
 - [ListenSocket](docs/ListenSocket.md)
 - [Machine](docs/Machine.md)
 - [MachineEvent](docs/MachineEvent.md)
 - [MachineExecRequest](docs/MachineExecRequest.md)
 - [MachineVersion](docs/MachineVersion.md)
 - [MainStatusCode](docs/MainStatusCode.md)
 - [Organization](docs/Organization.md)
 - [ProcessStat](docs/ProcessStat.md)
 - [SignalRequest](docs/SignalRequest.md)
 - [StopRequest](docs/StopRequest.md)
 - [UpdateMachineRequest](docs/UpdateMachineRequest.md)
 - [UpdateVolumeRequest](docs/UpdateVolumeRequest.md)
 - [Volume](docs/Volume.md)
 - [VolumeSnapshot](docs/VolumeSnapshot.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



