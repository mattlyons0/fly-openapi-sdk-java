package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContainerConfig implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * CmdOverride is used to override the default command of the image.
     */
    private java.util.List<String> cmd;
    /**
     * DependsOn can be used to define dependencies between containers. The container will only bestarted after all of its dependent conditions have been satisfied.
     */
    private java.util.List<ContainerDependency> dependsOn;
    /**
     * EntrypointOverride is used to override the default entrypoint of the image.
     */
    private java.util.List<String> entrypoint;
    /**
     * ExtraEnv is used to add additional environment variables to the container.
     */
    private ContainerConfigEnv env;
    /**
     * EnvFrom can be provided to set environment variables from machine fields.
     */
    private java.util.List<EnvFrom> envFrom;
    /**
     * Image Config overrides - these fields are used to override the image configuration.If not provided, the image configuration will be used.ExecOverride is used to override the default command of the image.
     */
    private java.util.List<String> exec;
    /**
     * Files are files that will be written to the container file system.
     */
    private java.util.List<File> files;
    /**
     * Healthchecks determine the health of your containers. Healthchecks can use HTTP, TCP or an Exec command.
     */
    private java.util.List<ContainerHealthcheck> healthchecks;
    /**
     * Image is the docker image to run.
     */
    private String image;
    /**
     * Set of mounts added to the container. These must reference a volume in the machine config via its name.
     */
    private java.util.List<ContainerMount> mounts;
    /**
     * Name is used to identify the container in the machine.
     */
    private String name;
    /**
     * Restart is used to define the restart policy for the container. NOTE: spot-price is notsupported for containers.
     */
    private MachineRestart restart;
    /**
     * Secrets can be provided at the process level to explicitly indicate which secrets should beused for the process. If not provided, the secrets provided at the machine level will be used.
     */
    private java.util.List<MachineSecret> secrets;
    /**
     * Stop is used to define the signal and timeout for stopping the container.
     */
    private StopConfig stop;
    /**
     * UserOverride is used to override the default user of the image.
     */
    private String user;
    /**
     * Instantiates a new {@link ContainerConfig} and sets the default values.
     */
    public ContainerConfig() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContainerConfig}
     */
    @jakarta.annotation.Nonnull
    public static ContainerConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContainerConfig();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the cmd property value. CmdOverride is used to override the default command of the image.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCmd() {
        return this.cmd;
    }
    /**
     * Gets the depends_on property value. DependsOn can be used to define dependencies between containers. The container will only bestarted after all of its dependent conditions have been satisfied.
     * @return a {@link java.util.List<ContainerDependency>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContainerDependency> getDependsOn() {
        return this.dependsOn;
    }
    /**
     * Gets the entrypoint property value. EntrypointOverride is used to override the default entrypoint of the image.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEntrypoint() {
        return this.entrypoint;
    }
    /**
     * Gets the env property value. ExtraEnv is used to add additional environment variables to the container.
     * @return a {@link ContainerConfigEnv}
     */
    @jakarta.annotation.Nullable
    public ContainerConfigEnv getEnv() {
        return this.env;
    }
    /**
     * Gets the env_from property value. EnvFrom can be provided to set environment variables from machine fields.
     * @return a {@link java.util.List<EnvFrom>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EnvFrom> getEnvFrom() {
        return this.envFrom;
    }
    /**
     * Gets the exec property value. Image Config overrides - these fields are used to override the image configuration.If not provided, the image configuration will be used.ExecOverride is used to override the default command of the image.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExec() {
        return this.exec;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("cmd", (n) -> { this.setCmd(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("depends_on", (n) -> { this.setDependsOn(n.getCollectionOfObjectValues(ContainerDependency::createFromDiscriminatorValue)); });
        deserializerMap.put("entrypoint", (n) -> { this.setEntrypoint(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("env", (n) -> { this.setEnv(n.getObjectValue(ContainerConfigEnv::createFromDiscriminatorValue)); });
        deserializerMap.put("env_from", (n) -> { this.setEnvFrom(n.getCollectionOfObjectValues(EnvFrom::createFromDiscriminatorValue)); });
        deserializerMap.put("exec", (n) -> { this.setExec(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfObjectValues(File::createFromDiscriminatorValue)); });
        deserializerMap.put("healthchecks", (n) -> { this.setHealthchecks(n.getCollectionOfObjectValues(ContainerHealthcheck::createFromDiscriminatorValue)); });
        deserializerMap.put("image", (n) -> { this.setImage(n.getStringValue()); });
        deserializerMap.put("mounts", (n) -> { this.setMounts(n.getCollectionOfObjectValues(ContainerMount::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("restart", (n) -> { this.setRestart(n.getObjectValue(MachineRestart::createFromDiscriminatorValue)); });
        deserializerMap.put("secrets", (n) -> { this.setSecrets(n.getCollectionOfObjectValues(MachineSecret::createFromDiscriminatorValue)); });
        deserializerMap.put("stop", (n) -> { this.setStop(n.getObjectValue(StopConfig::createFromDiscriminatorValue)); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the files property value. Files are files that will be written to the container file system.
     * @return a {@link java.util.List<File>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<File> getFiles() {
        return this.files;
    }
    /**
     * Gets the healthchecks property value. Healthchecks determine the health of your containers. Healthchecks can use HTTP, TCP or an Exec command.
     * @return a {@link java.util.List<ContainerHealthcheck>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContainerHealthcheck> getHealthchecks() {
        return this.healthchecks;
    }
    /**
     * Gets the image property value. Image is the docker image to run.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImage() {
        return this.image;
    }
    /**
     * Gets the mounts property value. Set of mounts added to the container. These must reference a volume in the machine config via its name.
     * @return a {@link java.util.List<ContainerMount>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ContainerMount> getMounts() {
        return this.mounts;
    }
    /**
     * Gets the name property value. Name is used to identify the container in the machine.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the restart property value. Restart is used to define the restart policy for the container. NOTE: spot-price is notsupported for containers.
     * @return a {@link MachineRestart}
     */
    @jakarta.annotation.Nullable
    public MachineRestart getRestart() {
        return this.restart;
    }
    /**
     * Gets the secrets property value. Secrets can be provided at the process level to explicitly indicate which secrets should beused for the process. If not provided, the secrets provided at the machine level will be used.
     * @return a {@link java.util.List<MachineSecret>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MachineSecret> getSecrets() {
        return this.secrets;
    }
    /**
     * Gets the stop property value. Stop is used to define the signal and timeout for stopping the container.
     * @return a {@link StopConfig}
     */
    @jakarta.annotation.Nullable
    public StopConfig getStop() {
        return this.stop;
    }
    /**
     * Gets the user property value. UserOverride is used to override the default user of the image.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("cmd", this.getCmd());
        writer.writeCollectionOfObjectValues("depends_on", this.getDependsOn());
        writer.writeCollectionOfPrimitiveValues("entrypoint", this.getEntrypoint());
        writer.writeObjectValue("env", this.getEnv());
        writer.writeCollectionOfObjectValues("env_from", this.getEnvFrom());
        writer.writeCollectionOfPrimitiveValues("exec", this.getExec());
        writer.writeCollectionOfObjectValues("files", this.getFiles());
        writer.writeCollectionOfObjectValues("healthchecks", this.getHealthchecks());
        writer.writeStringValue("image", this.getImage());
        writer.writeCollectionOfObjectValues("mounts", this.getMounts());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("restart", this.getRestart());
        writer.writeCollectionOfObjectValues("secrets", this.getSecrets());
        writer.writeObjectValue("stop", this.getStop());
        writer.writeStringValue("user", this.getUser());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the cmd property value. CmdOverride is used to override the default command of the image.
     * @param value Value to set for the cmd property.
     */
    public void setCmd(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.cmd = value;
    }
    /**
     * Sets the depends_on property value. DependsOn can be used to define dependencies between containers. The container will only bestarted after all of its dependent conditions have been satisfied.
     * @param value Value to set for the depends_on property.
     */
    public void setDependsOn(@jakarta.annotation.Nullable final java.util.List<ContainerDependency> value) {
        this.dependsOn = value;
    }
    /**
     * Sets the entrypoint property value. EntrypointOverride is used to override the default entrypoint of the image.
     * @param value Value to set for the entrypoint property.
     */
    public void setEntrypoint(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.entrypoint = value;
    }
    /**
     * Sets the env property value. ExtraEnv is used to add additional environment variables to the container.
     * @param value Value to set for the env property.
     */
    public void setEnv(@jakarta.annotation.Nullable final ContainerConfigEnv value) {
        this.env = value;
    }
    /**
     * Sets the env_from property value. EnvFrom can be provided to set environment variables from machine fields.
     * @param value Value to set for the env_from property.
     */
    public void setEnvFrom(@jakarta.annotation.Nullable final java.util.List<EnvFrom> value) {
        this.envFrom = value;
    }
    /**
     * Sets the exec property value. Image Config overrides - these fields are used to override the image configuration.If not provided, the image configuration will be used.ExecOverride is used to override the default command of the image.
     * @param value Value to set for the exec property.
     */
    public void setExec(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.exec = value;
    }
    /**
     * Sets the files property value. Files are files that will be written to the container file system.
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<File> value) {
        this.files = value;
    }
    /**
     * Sets the healthchecks property value. Healthchecks determine the health of your containers. Healthchecks can use HTTP, TCP or an Exec command.
     * @param value Value to set for the healthchecks property.
     */
    public void setHealthchecks(@jakarta.annotation.Nullable final java.util.List<ContainerHealthcheck> value) {
        this.healthchecks = value;
    }
    /**
     * Sets the image property value. Image is the docker image to run.
     * @param value Value to set for the image property.
     */
    public void setImage(@jakarta.annotation.Nullable final String value) {
        this.image = value;
    }
    /**
     * Sets the mounts property value. Set of mounts added to the container. These must reference a volume in the machine config via its name.
     * @param value Value to set for the mounts property.
     */
    public void setMounts(@jakarta.annotation.Nullable final java.util.List<ContainerMount> value) {
        this.mounts = value;
    }
    /**
     * Sets the name property value. Name is used to identify the container in the machine.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the restart property value. Restart is used to define the restart policy for the container. NOTE: spot-price is notsupported for containers.
     * @param value Value to set for the restart property.
     */
    public void setRestart(@jakarta.annotation.Nullable final MachineRestart value) {
        this.restart = value;
    }
    /**
     * Sets the secrets property value. Secrets can be provided at the process level to explicitly indicate which secrets should beused for the process. If not provided, the secrets provided at the machine level will be used.
     * @param value Value to set for the secrets property.
     */
    public void setSecrets(@jakarta.annotation.Nullable final java.util.List<MachineSecret> value) {
        this.secrets = value;
    }
    /**
     * Sets the stop property value. Stop is used to define the signal and timeout for stopping the container.
     * @param value Value to set for the stop property.
     */
    public void setStop(@jakarta.annotation.Nullable final StopConfig value) {
        this.stop = value;
    }
    /**
     * Sets the user property value. UserOverride is used to override the default user of the image.
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final String value) {
        this.user = value;
    }
}
