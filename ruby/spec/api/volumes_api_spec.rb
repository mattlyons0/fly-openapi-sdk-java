=begin
#Machines API

## Introduction  Fly Machines are the compute behind the Fly.io platform. They are fast-launching VMs that can be started and stopped at subsecond speeds. A Machine is the configuration and state for a single VM running on our platform. Every Machine will belong to a Fly App; Apps can have more than one Machine. Read more [here](https://fly.io/docs/machines/).  The Machines REST API allows you to provison and manage Apps, Machines and Volumes on the Fly.io platform. To manage other Fly.io resources like organizations, use the [GraphQL API](https://fly.io/docs/networking/custom-domains-with-fly/#graphql-api-notes).  ## Authentication  All requests must include the Fly API Token in the HTTP Headers as follows:  ``` Authorization: Bearer [TOKEN] ```  You can get your API token using [flyctl](https://fly.io/docs/hands-on/install-flyctl/) by running `fly auth token`  ## Base URL  The easiest (and recommended) way to connect to the Machines API is to use the public `api.machines.dev` endpoint, a simpler and more performant alternative to connecting over WireGuard. You can still access your Machines directly over a WireGuard VPN, and use the private Machines API endpoint: `http://_api.internal:4280`. This method requires more setup.  Follow the [instructions](https://fly.io/docs/networking/private-networking/#private-network-vpn) to set up a permanent WireGuard connection to your Fly.io [IPv6 private network](https://fly.io/docs/networking/private-networking/). Once you’re connected, Fly internal DNS should expose the Machines API endpoint at: `http://_api.internal:4280`  ## Response Codes  The API uses conventional HTTP status codes to signal whether a request was successful or not.  Typically, 2xx HTTP status codes denote successful operations, 4xx codes imply failures related to the user, and 5xx codes suggest problems with the infrastructure.  | Status | Description                                 | | :----: | ------------------------------------------- | | `200`  | Successful request.                         | | `201`  | Created successfully.                       | | `202`  | Successful request. No content.             | | `400`  | Check that the parameters were correct.     | | `401`  | The API key used was missing or invalid.    | | `404`  | The resource was not found.                 | | `5xx`  | Indicates an error with Fly.io API servers. | 

The version of the OpenAPI document: 1.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 7.3.0-SNAPSHOT

=end

require 'spec_helper'
require 'json'

# Unit tests for FlySDK::VolumesApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'VolumesApi' do
  before do
    # run before each test
    @api_instance = FlySDK::VolumesApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of VolumesApi' do
    it 'should create an instance of VolumesApi' do
      expect(@api_instance).to be_instance_of(FlySDK::VolumesApi)
    end
  end

  # unit tests for create_volume_snapshot
  # Create Snapshot
  # Create a snapshot for a specific volume within an app. 
  # @param app_name Fly App Name
  # @param volume_id Volume ID
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'create_volume_snapshot test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for volume_delete
  # Destroy Volume
  # Delete a specific volume within an app by volume ID. 
  # @param app_name Fly App Name
  # @param volume_id Volume ID
  # @param [Hash] opts the optional parameters
  # @return [Volume]
  describe 'volume_delete test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for volumes_create
  # Create Volume
  # Create a volume for a specific app using the details provided in the request body. 
  # @param app_name Fly App Name
  # @param request Request body
  # @param [Hash] opts the optional parameters
  # @return [Volume]
  describe 'volumes_create test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for volumes_extend
  # Extend Volume
  # Extend a volume&#39;s size within an app using the details provided in the request body. 
  # @param app_name Fly App Name
  # @param volume_id Volume ID
  # @param request Request body
  # @param [Hash] opts the optional parameters
  # @return [ExtendVolumeResponse]
  describe 'volumes_extend test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for volumes_get_by_id
  # Get Volume
  # Retrieve details about a specific volume by its ID within an app. 
  # @param app_name Fly App Name
  # @param volume_id Volume ID
  # @param [Hash] opts the optional parameters
  # @return [Volume]
  describe 'volumes_get_by_id test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for volumes_list
  # List Volumes
  # List all volumes associated with a specific app. 
  # @param app_name Fly App Name
  # @param [Hash] opts the optional parameters
  # @return [Array<Volume>]
  describe 'volumes_list test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for volumes_list_snapshots
  # List Snapshots
  # List all snapshots for a specific volume within an app. 
  # @param app_name Fly App Name
  # @param volume_id Volume ID
  # @param [Hash] opts the optional parameters
  # @return [Array<VolumeSnapshot>]
  describe 'volumes_list_snapshots test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

  # unit tests for volumes_update
  # Update Volume
  # Update a volume&#39;s configuration using the details provided in the request body. 
  # @param app_name Fly App Name
  # @param volume_id Volume ID
  # @param request Request body
  # @param [Hash] opts the optional parameters
  # @return [Volume]
  describe 'volumes_update test' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
    end
  end

end
