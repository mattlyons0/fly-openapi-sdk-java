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
import io.fly.client.model.ListenSocket;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ProcessStat
 */
@JsonPropertyOrder({
  ProcessStat.JSON_PROPERTY_COMMAND,
  ProcessStat.JSON_PROPERTY_CPU,
  ProcessStat.JSON_PROPERTY_DIRECTORY,
  ProcessStat.JSON_PROPERTY_LISTEN_SOCKETS,
  ProcessStat.JSON_PROPERTY_PID,
  ProcessStat.JSON_PROPERTY_RSS,
  ProcessStat.JSON_PROPERTY_RTIME,
  ProcessStat.JSON_PROPERTY_STIME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProcessStat {
  public static final String JSON_PROPERTY_COMMAND = "command";
  private String command;

  public static final String JSON_PROPERTY_CPU = "cpu";
  private Integer cpu;

  public static final String JSON_PROPERTY_DIRECTORY = "directory";
  private String directory;

  public static final String JSON_PROPERTY_LISTEN_SOCKETS = "listen_sockets";
  private List<ListenSocket> listenSockets;

  public static final String JSON_PROPERTY_PID = "pid";
  private Integer pid;

  public static final String JSON_PROPERTY_RSS = "rss";
  private Integer rss;

  public static final String JSON_PROPERTY_RTIME = "rtime";
  private Integer rtime;

  public static final String JSON_PROPERTY_STIME = "stime";
  private Integer stime;

  public ProcessStat() {
  }

  public ProcessStat command(String command) {
    
    this.command = command;
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

  public String getCommand() {
    return command;
  }


  @JsonProperty(JSON_PROPERTY_COMMAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommand(String command) {
    this.command = command;
  }


  public ProcessStat cpu(Integer cpu) {
    
    this.cpu = cpu;
    return this;
  }

   /**
   * Get cpu
   * @return cpu
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCpu() {
    return cpu;
  }


  @JsonProperty(JSON_PROPERTY_CPU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpu(Integer cpu) {
    this.cpu = cpu;
  }


  public ProcessStat directory(String directory) {
    
    this.directory = directory;
    return this;
  }

   /**
   * Get directory
   * @return directory
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDirectory() {
    return directory;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectory(String directory) {
    this.directory = directory;
  }


  public ProcessStat listenSockets(List<ListenSocket> listenSockets) {
    
    this.listenSockets = listenSockets;
    return this;
  }

  public ProcessStat addListenSocketsItem(ListenSocket listenSocketsItem) {
    if (this.listenSockets == null) {
      this.listenSockets = new ArrayList<>();
    }
    this.listenSockets.add(listenSocketsItem);
    return this;
  }

   /**
   * Get listenSockets
   * @return listenSockets
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LISTEN_SOCKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ListenSocket> getListenSockets() {
    return listenSockets;
  }


  @JsonProperty(JSON_PROPERTY_LISTEN_SOCKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListenSockets(List<ListenSocket> listenSockets) {
    this.listenSockets = listenSockets;
  }


  public ProcessStat pid(Integer pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPid() {
    return pid;
  }


  @JsonProperty(JSON_PROPERTY_PID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPid(Integer pid) {
    this.pid = pid;
  }


  public ProcessStat rss(Integer rss) {
    
    this.rss = rss;
    return this;
  }

   /**
   * Get rss
   * @return rss
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_RSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRss() {
    return rss;
  }


  @JsonProperty(JSON_PROPERTY_RSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRss(Integer rss) {
    this.rss = rss;
  }


  public ProcessStat rtime(Integer rtime) {
    
    this.rtime = rtime;
    return this;
  }

   /**
   * Get rtime
   * @return rtime
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_RTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRtime() {
    return rtime;
  }


  @JsonProperty(JSON_PROPERTY_RTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRtime(Integer rtime) {
    this.rtime = rtime;
  }


  public ProcessStat stime(Integer stime) {
    
    this.stime = stime;
    return this;
  }

   /**
   * Get stime
   * @return stime
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_STIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStime() {
    return stime;
  }


  @JsonProperty(JSON_PROPERTY_STIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStime(Integer stime) {
    this.stime = stime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessStat processStat = (ProcessStat) o;
    return Objects.equals(this.command, processStat.command) &&
        Objects.equals(this.cpu, processStat.cpu) &&
        Objects.equals(this.directory, processStat.directory) &&
        Objects.equals(this.listenSockets, processStat.listenSockets) &&
        Objects.equals(this.pid, processStat.pid) &&
        Objects.equals(this.rss, processStat.rss) &&
        Objects.equals(this.rtime, processStat.rtime) &&
        Objects.equals(this.stime, processStat.stime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, cpu, directory, listenSockets, pid, rss, rtime, stime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessStat {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    listenSockets: ").append(toIndentedString(listenSockets)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    rss: ").append(toIndentedString(rss)).append("\n");
    sb.append("    rtime: ").append(toIndentedString(rtime)).append("\n");
    sb.append("    stime: ").append(toIndentedString(stime)).append("\n");
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

