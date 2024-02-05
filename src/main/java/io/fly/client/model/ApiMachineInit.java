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
 * ApiMachineInit
 */
@JsonPropertyOrder({
  ApiMachineInit.JSON_PROPERTY_CMD,
  ApiMachineInit.JSON_PROPERTY_ENTRYPOINT,
  ApiMachineInit.JSON_PROPERTY_EXEC,
  ApiMachineInit.JSON_PROPERTY_KERNEL_ARGS,
  ApiMachineInit.JSON_PROPERTY_SWAP_SIZE_MB,
  ApiMachineInit.JSON_PROPERTY_TTY
})
@JsonTypeName("api.MachineInit")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiMachineInit {
  public static final String JSON_PROPERTY_CMD = "cmd";
  private List<String> cmd;

  public static final String JSON_PROPERTY_ENTRYPOINT = "entrypoint";
  private List<String> entrypoint;

  public static final String JSON_PROPERTY_EXEC = "exec";
  private List<String> exec;

  public static final String JSON_PROPERTY_KERNEL_ARGS = "kernel_args";
  private List<String> kernelArgs;

  public static final String JSON_PROPERTY_SWAP_SIZE_MB = "swap_size_mb";
  private Long swapSizeMb;

  public static final String JSON_PROPERTY_TTY = "tty";
  private Boolean tty;

  public ApiMachineInit() {
  }

  public ApiMachineInit cmd(List<String> cmd) {
    
    this.cmd = cmd;
    return this;
  }

  public ApiMachineInit addCmdItem(String cmdItem) {
    if (this.cmd == null) {
      this.cmd = new ArrayList<>();
    }
    this.cmd.add(cmdItem);
    return this;
  }

   /**
   * Get cmd
   * @return cmd
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CMD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCmd() {
    return cmd;
  }


  @JsonProperty(JSON_PROPERTY_CMD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCmd(List<String> cmd) {
    this.cmd = cmd;
  }


  public ApiMachineInit entrypoint(List<String> entrypoint) {
    
    this.entrypoint = entrypoint;
    return this;
  }

  public ApiMachineInit addEntrypointItem(String entrypointItem) {
    if (this.entrypoint == null) {
      this.entrypoint = new ArrayList<>();
    }
    this.entrypoint.add(entrypointItem);
    return this;
  }

   /**
   * Get entrypoint
   * @return entrypoint
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ENTRYPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEntrypoint() {
    return entrypoint;
  }


  @JsonProperty(JSON_PROPERTY_ENTRYPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
  }


  public ApiMachineInit exec(List<String> exec) {
    
    this.exec = exec;
    return this;
  }

  public ApiMachineInit addExecItem(String execItem) {
    if (this.exec == null) {
      this.exec = new ArrayList<>();
    }
    this.exec.add(execItem);
    return this;
  }

   /**
   * Get exec
   * @return exec
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_EXEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getExec() {
    return exec;
  }


  @JsonProperty(JSON_PROPERTY_EXEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExec(List<String> exec) {
    this.exec = exec;
  }


  public ApiMachineInit kernelArgs(List<String> kernelArgs) {
    
    this.kernelArgs = kernelArgs;
    return this;
  }

  public ApiMachineInit addKernelArgsItem(String kernelArgsItem) {
    if (this.kernelArgs == null) {
      this.kernelArgs = new ArrayList<>();
    }
    this.kernelArgs.add(kernelArgsItem);
    return this;
  }

   /**
   * Get kernelArgs
   * @return kernelArgs
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_KERNEL_ARGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getKernelArgs() {
    return kernelArgs;
  }


  @JsonProperty(JSON_PROPERTY_KERNEL_ARGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKernelArgs(List<String> kernelArgs) {
    this.kernelArgs = kernelArgs;
  }


  public ApiMachineInit swapSizeMb(Long swapSizeMb) {
    
    this.swapSizeMb = swapSizeMb;
    return this;
  }

   /**
   * Get swapSizeMb
   * @return swapSizeMb
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SWAP_SIZE_MB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSwapSizeMb() {
    return swapSizeMb;
  }


  @JsonProperty(JSON_PROPERTY_SWAP_SIZE_MB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwapSizeMb(Long swapSizeMb) {
    this.swapSizeMb = swapSizeMb;
  }


  public ApiMachineInit tty(Boolean tty) {
    
    this.tty = tty;
    return this;
  }

   /**
   * Get tty
   * @return tty
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTty() {
    return tty;
  }


  @JsonProperty(JSON_PROPERTY_TTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTty(Boolean tty) {
    this.tty = tty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiMachineInit apiMachineInit = (ApiMachineInit) o;
    return Objects.equals(this.cmd, apiMachineInit.cmd) &&
        Objects.equals(this.entrypoint, apiMachineInit.entrypoint) &&
        Objects.equals(this.exec, apiMachineInit.exec) &&
        Objects.equals(this.kernelArgs, apiMachineInit.kernelArgs) &&
        Objects.equals(this.swapSizeMb, apiMachineInit.swapSizeMb) &&
        Objects.equals(this.tty, apiMachineInit.tty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cmd, entrypoint, exec, kernelArgs, swapSizeMb, tty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiMachineInit {\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    kernelArgs: ").append(toIndentedString(kernelArgs)).append("\n");
    sb.append("    swapSizeMb: ").append(toIndentedString(swapSizeMb)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
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

