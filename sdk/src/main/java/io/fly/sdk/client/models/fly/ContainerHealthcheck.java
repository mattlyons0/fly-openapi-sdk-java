package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContainerHealthcheck implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The exec property
     */
    private ExecHealthcheck exec;
    /**
     * The number of times the check must fail before considering the container unhealthy.
     */
    private Integer failureThreshold;
    /**
     * The time in seconds to wait after a container starts before checking its health.
     */
    private Integer gracePeriod;
    /**
     * The http property
     */
    private HTTPHealthcheck http;
    /**
     * The time in seconds between executing the defined check.
     */
    private Integer interval;
    /**
     * Kind of healthcheck (readiness, liveness)
     */
    private ContainerHealthcheckKind kind;
    /**
     * The name of the check. Must be unique within the container.
     */
    private String name;
    /**
     * The number of times the check must succeeed before considering the container healthy.
     */
    private Integer successThreshold;
    /**
     * The tcp property
     */
    private TCPHealthcheck tcp;
    /**
     * The time in seconds to wait for the check to complete.
     */
    private Integer timeout;
    /**
     * Unhealthy policy that determines what action to take if a container is deemed unhealthy
     */
    private UnhealthyPolicy unhealthy;
    /**
     * Instantiates a new {@link ContainerHealthcheck} and sets the default values.
     */
    public ContainerHealthcheck() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContainerHealthcheck}
     */
    @jakarta.annotation.Nonnull
    public static ContainerHealthcheck createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContainerHealthcheck();
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
     * Gets the exec property value. The exec property
     * @return a {@link ExecHealthcheck}
     */
    @jakarta.annotation.Nullable
    public ExecHealthcheck getExec() {
        return this.exec;
    }
    /**
     * Gets the failure_threshold property value. The number of times the check must fail before considering the container unhealthy.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("exec", (n) -> { this.setExec(n.getObjectValue(ExecHealthcheck::createFromDiscriminatorValue)); });
        deserializerMap.put("failure_threshold", (n) -> { this.setFailureThreshold(n.getIntegerValue()); });
        deserializerMap.put("grace_period", (n) -> { this.setGracePeriod(n.getIntegerValue()); });
        deserializerMap.put("http", (n) -> { this.setHttp(n.getObjectValue(HTTPHealthcheck::createFromDiscriminatorValue)); });
        deserializerMap.put("interval", (n) -> { this.setInterval(n.getIntegerValue()); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getEnumValue(ContainerHealthcheckKind::forValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("success_threshold", (n) -> { this.setSuccessThreshold(n.getIntegerValue()); });
        deserializerMap.put("tcp", (n) -> { this.setTcp(n.getObjectValue(TCPHealthcheck::createFromDiscriminatorValue)); });
        deserializerMap.put("timeout", (n) -> { this.setTimeout(n.getIntegerValue()); });
        deserializerMap.put("unhealthy", (n) -> { this.setUnhealthy(n.getEnumValue(UnhealthyPolicy::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the grace_period property value. The time in seconds to wait after a container starts before checking its health.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getGracePeriod() {
        return this.gracePeriod;
    }
    /**
     * Gets the http property value. The http property
     * @return a {@link HTTPHealthcheck}
     */
    @jakarta.annotation.Nullable
    public HTTPHealthcheck getHttp() {
        return this.http;
    }
    /**
     * Gets the interval property value. The time in seconds between executing the defined check.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInterval() {
        return this.interval;
    }
    /**
     * Gets the kind property value. Kind of healthcheck (readiness, liveness)
     * @return a {@link ContainerHealthcheckKind}
     */
    @jakarta.annotation.Nullable
    public ContainerHealthcheckKind getKind() {
        return this.kind;
    }
    /**
     * Gets the name property value. The name of the check. Must be unique within the container.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the success_threshold property value. The number of times the check must succeeed before considering the container healthy.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }
    /**
     * Gets the tcp property value. The tcp property
     * @return a {@link TCPHealthcheck}
     */
    @jakarta.annotation.Nullable
    public TCPHealthcheck getTcp() {
        return this.tcp;
    }
    /**
     * Gets the timeout property value. The time in seconds to wait for the check to complete.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTimeout() {
        return this.timeout;
    }
    /**
     * Gets the unhealthy property value. Unhealthy policy that determines what action to take if a container is deemed unhealthy
     * @return a {@link UnhealthyPolicy}
     */
    @jakarta.annotation.Nullable
    public UnhealthyPolicy getUnhealthy() {
        return this.unhealthy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("exec", this.getExec());
        writer.writeIntegerValue("failure_threshold", this.getFailureThreshold());
        writer.writeIntegerValue("grace_period", this.getGracePeriod());
        writer.writeObjectValue("http", this.getHttp());
        writer.writeIntegerValue("interval", this.getInterval());
        writer.writeEnumValue("kind", this.getKind());
        writer.writeStringValue("name", this.getName());
        writer.writeIntegerValue("success_threshold", this.getSuccessThreshold());
        writer.writeObjectValue("tcp", this.getTcp());
        writer.writeIntegerValue("timeout", this.getTimeout());
        writer.writeEnumValue("unhealthy", this.getUnhealthy());
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
     * Sets the exec property value. The exec property
     * @param value Value to set for the exec property.
     */
    public void setExec(@jakarta.annotation.Nullable final ExecHealthcheck value) {
        this.exec = value;
    }
    /**
     * Sets the failure_threshold property value. The number of times the check must fail before considering the container unhealthy.
     * @param value Value to set for the failure_threshold property.
     */
    public void setFailureThreshold(@jakarta.annotation.Nullable final Integer value) {
        this.failureThreshold = value;
    }
    /**
     * Sets the grace_period property value. The time in seconds to wait after a container starts before checking its health.
     * @param value Value to set for the grace_period property.
     */
    public void setGracePeriod(@jakarta.annotation.Nullable final Integer value) {
        this.gracePeriod = value;
    }
    /**
     * Sets the http property value. The http property
     * @param value Value to set for the http property.
     */
    public void setHttp(@jakarta.annotation.Nullable final HTTPHealthcheck value) {
        this.http = value;
    }
    /**
     * Sets the interval property value. The time in seconds between executing the defined check.
     * @param value Value to set for the interval property.
     */
    public void setInterval(@jakarta.annotation.Nullable final Integer value) {
        this.interval = value;
    }
    /**
     * Sets the kind property value. Kind of healthcheck (readiness, liveness)
     * @param value Value to set for the kind property.
     */
    public void setKind(@jakarta.annotation.Nullable final ContainerHealthcheckKind value) {
        this.kind = value;
    }
    /**
     * Sets the name property value. The name of the check. Must be unique within the container.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the success_threshold property value. The number of times the check must succeeed before considering the container healthy.
     * @param value Value to set for the success_threshold property.
     */
    public void setSuccessThreshold(@jakarta.annotation.Nullable final Integer value) {
        this.successThreshold = value;
    }
    /**
     * Sets the tcp property value. The tcp property
     * @param value Value to set for the tcp property.
     */
    public void setTcp(@jakarta.annotation.Nullable final TCPHealthcheck value) {
        this.tcp = value;
    }
    /**
     * Sets the timeout property value. The time in seconds to wait for the check to complete.
     * @param value Value to set for the timeout property.
     */
    public void setTimeout(@jakarta.annotation.Nullable final Integer value) {
        this.timeout = value;
    }
    /**
     * Sets the unhealthy property value. Unhealthy policy that determines what action to take if a container is deemed unhealthy
     * @param value Value to set for the unhealthy property.
     */
    public void setUnhealthy(@jakarta.annotation.Nullable final UnhealthyPolicy value) {
        this.unhealthy = value;
    }
}
