=begin
#Fly Machines API

#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 7.1.0-SNAPSHOT

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for FlySDK::SignalRequest
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe FlySDK::SignalRequest do
  let(:instance) { FlySDK::SignalRequest.new }

  describe 'test an instance of SignalRequest' do
    it 'should create an instance of SignalRequest' do
      expect(instance).to be_instance_of(FlySDK::SignalRequest)
    end
  end
  describe 'test attribute "signal"' do
    it 'should work' do
      # assertion here. ref: https://rspec.info/features/3-12/rspec-expectations/built-in-matchers/
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["SIGABRT", "SIGALRM", "SIGFPE", "SIGHUP", "SIGILL", "SIGINT", "SIGKILL", "SIGPIPE", "SIGQUIT", "SIGSEGV", "SIGTERM", "SIGTRAP", "SIGUSR1"])
      # validator.allowable_values.each do |value|
      #   expect { instance.signal = value }.not_to raise_error
      # end
    end
  end

end
