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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MachineExecRequest
 */
@JsonPropertyOrder({
  MachineExecRequest.JSON_PROPERTY_CMD,
  MachineExecRequest.JSON_PROPERTY_COMMAND,
  MachineExecRequest.JSON_PROPERTY_TIMEOUT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MachineExecRequest {
  public static final String JSON_PROPERTY_CMD = "cmd";
  private String cmd;

  public static final String JSON_PROPERTY_COMMAND = "command";
  private List<String> command;

  public static final String JSON_PROPERTY_TIMEOUT = "timeout";
  private Integer timeout;

  public MachineExecRequest() {
  }

  public MachineExecRequest cmd(String cmd) {
    
    this.cmd = cmd;
    return this;
  }

   /**
   * Deprecated: use Command instead
   * @return cmd
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Deprecated: use Command instead")
  @JsonProperty(JSON_PROPERTY_CMD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCmd() {
    return cmd;
  }


  @JsonProperty(JSON_PROPERTY_CMD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCmd(String cmd) {
    this.cmd = cmd;
  }


  public MachineExecRequest command(List<String> command) {
    
    this.command = command;
    return this;
  }

  public MachineExecRequest addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_COMMAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCommand() {
    return command;
  }


  @JsonProperty(JSON_PROPERTY_COMMAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommand(List<String> command) {
    this.command = command;
  }


  public MachineExecRequest timeout(Integer timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeout() {
    return timeout;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineExecRequest machineExecRequest = (MachineExecRequest) o;
    return Objects.equals(this.cmd, machineExecRequest.cmd) &&
        Objects.equals(this.command, machineExecRequest.command) &&
        Objects.equals(this.timeout, machineExecRequest.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cmd, command, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineExecRequest {\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

