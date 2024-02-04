/*
 * Machines API
 * # Introduction  Fly Machines are the compute behind the Fly.io platform. They are fast-launching VMs that can be started and stopped at subsecond speeds. A Machine is the configuration and state for a single VM running on our platform. Every Machine will belong to a Fly App; Apps can have more than one Machine. Read more [here](https://fly.io/docs/machines/).  The Machines REST API allows you to provison and manage Apps, Machines and Volumes on the Fly.io platform. To manage other Fly.io resources like organizations, use the [GraphQL API](https://fly.io/docs/networking/custom-domains-with-fly/#graphql-api-notes).  ## Authentication  All requests must include the Fly API Token in the HTTP Headers as follows:  ``` Authorization: Bearer [TOKEN] ```  You can get your API token using [flyctl](https://fly.io/docs/hands-on/install-flyctl/) by running `fly auth token`  ## Base URL  The easiest (and recommended) way to connect to the Machines API is to use the public `api.machines.dev` endpoint, a simpler and more performant alternative to connecting over WireGuard. You can still access your Machines directly over a WireGuard VPN, and use the private Machines API endpoint: `http://_api.internal:4280`. This method requires more setup.  Follow the [instructions](https://fly.io/docs/networking/private-networking/#private-network-vpn) to set up a permanent WireGuard connection to your Fly.io [IPv6 private network](https://fly.io/docs/networking/private-networking/). Once you’re connected, Fly internal DNS should expose the Machines API endpoint at: `http://_api.internal:4280`  ## Response Codes  The API uses conventional HTTP status codes to signal whether a request was successful or not.  Typically, 2xx HTTP status codes denote successful operations, 4xx codes imply failures related to the user, and 5xx codes suggest problems with the infrastructure.  | Status | Description                                 | | :----: | ------------------------------------------- | | `200`  | Successful request.                         | | `201`  | Created successfully.                       | | `202`  | Successful request. No content.             | | `400`  | Check that the parameters were correct.     | | `401`  | The API key used was missing or invalid.    | | `404`  | The resource was not found.                 | | `5xx`  | Indicates an error with Fly.io API servers. | 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.fly.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fly.client.model.ApiDNSConfig;
import io.fly.client.model.ApiFile;
import io.fly.client.model.ApiMachineCheck;
import io.fly.client.model.ApiMachineGuest;
import io.fly.client.model.ApiMachineInit;
import io.fly.client.model.ApiMachineMetrics;
import io.fly.client.model.ApiMachineMount;
import io.fly.client.model.ApiMachineProcess;
import io.fly.client.model.ApiMachineRestart;
import io.fly.client.model.ApiMachineService;
import io.fly.client.model.ApiStatic;
import io.fly.client.model.ApiStopConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Model tests for ApiMachineConfig
 */
public class ApiMachineConfigTest {
    private final ApiMachineConfig model = new ApiMachineConfig();

    /**
     * Model tests for ApiMachineConfig
     */
    @Test
    public void testApiMachineConfig() {
        // TODO: test ApiMachineConfig
    }

    /**
     * Test the property 'autoDestroy'
     */
    @Test
    public void autoDestroyTest() {
        // TODO: test autoDestroy
    }

    /**
     * Test the property 'checks'
     */
    @Test
    public void checksTest() {
        // TODO: test checks
    }

    /**
     * Test the property 'disableMachineAutostart'
     */
    @Test
    public void disableMachineAutostartTest() {
        // TODO: test disableMachineAutostart
    }

    /**
     * Test the property 'dns'
     */
    @Test
    public void dnsTest() {
        // TODO: test dns
    }

    /**
     * Test the property 'env'
     */
    @Test
    public void envTest() {
        // TODO: test env
    }

    /**
     * Test the property 'files'
     */
    @Test
    public void filesTest() {
        // TODO: test files
    }

    /**
     * Test the property 'guest'
     */
    @Test
    public void guestTest() {
        // TODO: test guest
    }

    /**
     * Test the property 'image'
     */
    @Test
    public void imageTest() {
        // TODO: test image
    }

    /**
     * Test the property 'init'
     */
    @Test
    public void initTest() {
        // TODO: test init
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    public void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'metrics'
     */
    @Test
    public void metricsTest() {
        // TODO: test metrics
    }

    /**
     * Test the property 'mounts'
     */
    @Test
    public void mountsTest() {
        // TODO: test mounts
    }

    /**
     * Test the property 'processes'
     */
    @Test
    public void processesTest() {
        // TODO: test processes
    }

    /**
     * Test the property 'restart'
     */
    @Test
    public void restartTest() {
        // TODO: test restart
    }

    /**
     * Test the property 'schedule'
     */
    @Test
    public void scheduleTest() {
        // TODO: test schedule
    }

    /**
     * Test the property 'services'
     */
    @Test
    public void servicesTest() {
        // TODO: test services
    }

    /**
     * Test the property 'size'
     */
    @Test
    public void sizeTest() {
        // TODO: test size
    }

    /**
     * Test the property 'standbys'
     */
    @Test
    public void standbysTest() {
        // TODO: test standbys
    }

    /**
     * Test the property 'statics'
     */
    @Test
    public void staticsTest() {
        // TODO: test statics
    }

    /**
     * Test the property 'stopConfig'
     */
    @Test
    public void stopConfigTest() {
        // TODO: test stopConfig
    }

}
