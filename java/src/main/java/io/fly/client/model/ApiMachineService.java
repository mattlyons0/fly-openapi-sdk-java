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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.fly.client.model.ApiMachineCheck;
import io.fly.client.model.ApiMachinePort;
import io.fly.client.model.ApiMachineServiceConcurrency;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiMachineService
 */
@JsonPropertyOrder({
  ApiMachineService.JSON_PROPERTY_AUTOSTART,
  ApiMachineService.JSON_PROPERTY_AUTOSTOP,
  ApiMachineService.JSON_PROPERTY_CHECKS,
  ApiMachineService.JSON_PROPERTY_CONCURRENCY,
  ApiMachineService.JSON_PROPERTY_FORCE_INSTANCE_DESCRIPTION,
  ApiMachineService.JSON_PROPERTY_FORCE_INSTANCE_KEY,
  ApiMachineService.JSON_PROPERTY_INTERNAL_PORT,
  ApiMachineService.JSON_PROPERTY_MIN_MACHINES_RUNNING,
  ApiMachineService.JSON_PROPERTY_PORTS,
  ApiMachineService.JSON_PROPERTY_PROTOCOL
})
@JsonTypeName("api.MachineService")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-04T03:51:46.085129836Z[Etc/UTC]")
public class ApiMachineService {
  public static final String JSON_PROPERTY_AUTOSTART = "autostart";
  private Boolean autostart;

  public static final String JSON_PROPERTY_AUTOSTOP = "autostop";
  private Boolean autostop;

  public static final String JSON_PROPERTY_CHECKS = "checks";
  private List<ApiMachineCheck> checks;

  public static final String JSON_PROPERTY_CONCURRENCY = "concurrency";
  private ApiMachineServiceConcurrency concurrency;

  public static final String JSON_PROPERTY_FORCE_INSTANCE_DESCRIPTION = "force_instance_description";
  private String forceInstanceDescription;

  public static final String JSON_PROPERTY_FORCE_INSTANCE_KEY = "force_instance_key";
  private String forceInstanceKey;

  public static final String JSON_PROPERTY_INTERNAL_PORT = "internal_port";
  private Integer internalPort;

  public static final String JSON_PROPERTY_MIN_MACHINES_RUNNING = "min_machines_running";
  private Integer minMachinesRunning;

  public static final String JSON_PROPERTY_PORTS = "ports";
  private List<ApiMachinePort> ports;

  public static final String JSON_PROPERTY_PROTOCOL = "protocol";
  private String protocol;

  public ApiMachineService() {
  }

  public ApiMachineService autostart(Boolean autostart) {
    
    this.autostart = autostart;
    return this;
  }

   /**
   * Get autostart
   * @return autostart
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_AUTOSTART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutostart() {
    return autostart;
  }


  @JsonProperty(JSON_PROPERTY_AUTOSTART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutostart(Boolean autostart) {
    this.autostart = autostart;
  }


  public ApiMachineService autostop(Boolean autostop) {
    
    this.autostop = autostop;
    return this;
  }

   /**
   * Get autostop
   * @return autostop
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_AUTOSTOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutostop() {
    return autostop;
  }


  @JsonProperty(JSON_PROPERTY_AUTOSTOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutostop(Boolean autostop) {
    this.autostop = autostop;
  }


  public ApiMachineService checks(List<ApiMachineCheck> checks) {
    
    this.checks = checks;
    return this;
  }

  public ApiMachineService addChecksItem(ApiMachineCheck checksItem) {
    if (this.checks == null) {
      this.checks = new ArrayList<>();
    }
    this.checks.add(checksItem);
    return this;
  }

   /**
   * Get checks
   * @return checks
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CHECKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiMachineCheck> getChecks() {
    return checks;
  }


  @JsonProperty(JSON_PROPERTY_CHECKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChecks(List<ApiMachineCheck> checks) {
    this.checks = checks;
  }


  public ApiMachineService concurrency(ApiMachineServiceConcurrency concurrency) {
    
    this.concurrency = concurrency;
    return this;
  }

   /**
   * Get concurrency
   * @return concurrency
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CONCURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiMachineServiceConcurrency getConcurrency() {
    return concurrency;
  }


  @JsonProperty(JSON_PROPERTY_CONCURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConcurrency(ApiMachineServiceConcurrency concurrency) {
    this.concurrency = concurrency;
  }


  public ApiMachineService forceInstanceDescription(String forceInstanceDescription) {
    
    this.forceInstanceDescription = forceInstanceDescription;
    return this;
  }

   /**
   * Get forceInstanceDescription
   * @return forceInstanceDescription
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FORCE_INSTANCE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getForceInstanceDescription() {
    return forceInstanceDescription;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_INSTANCE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForceInstanceDescription(String forceInstanceDescription) {
    this.forceInstanceDescription = forceInstanceDescription;
  }


  public ApiMachineService forceInstanceKey(String forceInstanceKey) {
    
    this.forceInstanceKey = forceInstanceKey;
    return this;
  }

   /**
   * Get forceInstanceKey
   * @return forceInstanceKey
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FORCE_INSTANCE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getForceInstanceKey() {
    return forceInstanceKey;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_INSTANCE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForceInstanceKey(String forceInstanceKey) {
    this.forceInstanceKey = forceInstanceKey;
  }


  public ApiMachineService internalPort(Integer internalPort) {
    
    this.internalPort = internalPort;
    return this;
  }

   /**
   * Get internalPort
   * @return internalPort
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_INTERNAL_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInternalPort() {
    return internalPort;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternalPort(Integer internalPort) {
    this.internalPort = internalPort;
  }


  public ApiMachineService minMachinesRunning(Integer minMachinesRunning) {
    
    this.minMachinesRunning = minMachinesRunning;
    return this;
  }

   /**
   * Get minMachinesRunning
   * @return minMachinesRunning
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MIN_MACHINES_RUNNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinMachinesRunning() {
    return minMachinesRunning;
  }


  @JsonProperty(JSON_PROPERTY_MIN_MACHINES_RUNNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinMachinesRunning(Integer minMachinesRunning) {
    this.minMachinesRunning = minMachinesRunning;
  }


  public ApiMachineService ports(List<ApiMachinePort> ports) {
    
    this.ports = ports;
    return this;
  }

  public ApiMachineService addPortsItem(ApiMachinePort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Get ports
   * @return ports
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiMachinePort> getPorts() {
    return ports;
  }


  @JsonProperty(JSON_PROPERTY_PORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPorts(List<ApiMachinePort> ports) {
    this.ports = ports;
  }


  public ApiMachineService protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProtocol() {
    return protocol;
  }


  @JsonProperty(JSON_PROPERTY_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiMachineService apiMachineService = (ApiMachineService) o;
    return Objects.equals(this.autostart, apiMachineService.autostart) &&
        Objects.equals(this.autostop, apiMachineService.autostop) &&
        Objects.equals(this.checks, apiMachineService.checks) &&
        Objects.equals(this.concurrency, apiMachineService.concurrency) &&
        Objects.equals(this.forceInstanceDescription, apiMachineService.forceInstanceDescription) &&
        Objects.equals(this.forceInstanceKey, apiMachineService.forceInstanceKey) &&
        Objects.equals(this.internalPort, apiMachineService.internalPort) &&
        Objects.equals(this.minMachinesRunning, apiMachineService.minMachinesRunning) &&
        Objects.equals(this.ports, apiMachineService.ports) &&
        Objects.equals(this.protocol, apiMachineService.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autostart, autostop, checks, concurrency, forceInstanceDescription, forceInstanceKey, internalPort, minMachinesRunning, ports, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiMachineService {\n");
    sb.append("    autostart: ").append(toIndentedString(autostart)).append("\n");
    sb.append("    autostop: ").append(toIndentedString(autostop)).append("\n");
    sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
    sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
    sb.append("    forceInstanceDescription: ").append(toIndentedString(forceInstanceDescription)).append("\n");
    sb.append("    forceInstanceKey: ").append(toIndentedString(forceInstanceKey)).append("\n");
    sb.append("    internalPort: ").append(toIndentedString(internalPort)).append("\n");
    sb.append("    minMachinesRunning: ").append(toIndentedString(minMachinesRunning)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

