/*
Fly Machines API

Testing MachinesAPIService

*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech);

package fly-sdk

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"testing"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func Test_fly-sdk_MachinesAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test MachinesAPIService MachinesCordon", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		httpRes, err := apiClient.MachinesAPI.MachinesCordon(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesCreate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string

		resp, httpRes, err := apiClient.MachinesAPI.MachinesCreate(context.Background(), appName).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesCreateLease", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		resp, httpRes, err := apiClient.MachinesAPI.MachinesCreateLease(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesDelete", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		httpRes, err := apiClient.MachinesAPI.MachinesDelete(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesDeleteMetadata", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string
		var key string

		httpRes, err := apiClient.MachinesAPI.MachinesDeleteMetadata(context.Background(), appName, machineId, key).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesExec", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		resp, httpRes, err := apiClient.MachinesAPI.MachinesExec(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesList", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string

		resp, httpRes, err := apiClient.MachinesAPI.MachinesList(context.Background(), appName).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesListEvents", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		resp, httpRes, err := apiClient.MachinesAPI.MachinesListEvents(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesListProcesses", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		resp, httpRes, err := apiClient.MachinesAPI.MachinesListProcesses(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesListVersions", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		resp, httpRes, err := apiClient.MachinesAPI.MachinesListVersions(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesReleaseLease", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		httpRes, err := apiClient.MachinesAPI.MachinesReleaseLease(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesRestart", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		httpRes, err := apiClient.MachinesAPI.MachinesRestart(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesShow", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		resp, httpRes, err := apiClient.MachinesAPI.MachinesShow(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesShowLease", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		resp, httpRes, err := apiClient.MachinesAPI.MachinesShowLease(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesShowMetadata", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		resp, httpRes, err := apiClient.MachinesAPI.MachinesShowMetadata(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesSignal", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		httpRes, err := apiClient.MachinesAPI.MachinesSignal(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesStart", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		httpRes, err := apiClient.MachinesAPI.MachinesStart(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesStop", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		httpRes, err := apiClient.MachinesAPI.MachinesStop(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesUncordon", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		httpRes, err := apiClient.MachinesAPI.MachinesUncordon(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesUpdate", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		resp, httpRes, err := apiClient.MachinesAPI.MachinesUpdate(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesUpdateMetadata", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string
		var key string

		httpRes, err := apiClient.MachinesAPI.MachinesUpdateMetadata(context.Background(), appName, machineId, key).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test MachinesAPIService MachinesWait", func(t *testing.T) {

		t.Skip("skip test")  // remove to run test

		var appName string
		var machineId string

		httpRes, err := apiClient.MachinesAPI.MachinesWait(context.Background(), appName, machineId).Execute()

		require.Nil(t, err)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
