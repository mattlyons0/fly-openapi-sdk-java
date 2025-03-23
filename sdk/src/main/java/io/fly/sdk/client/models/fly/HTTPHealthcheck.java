package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HTTPHealthcheck implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Additional headers to send with the request
     */
    private java.util.List<MachineHTTPHeader> headers;
    /**
     * The HTTP method to use to when making the request
     */
    private String method;
    /**
     * The path to send the request to
     */
    private String path;
    /**
     * The port to connect to, often the same as internal_port
     */
    private Integer port;
    /**
     * Whether to use http or https
     */
    private ContainerHealthcheckScheme scheme;
    /**
     * If the protocol is https, the hostname to use for TLS certificate validation
     */
    private String tlsServerName;
    /**
     * If the protocol is https, whether or not to verify the TLS certificate
     */
    private Boolean tlsSkipVerify;
    /**
     * Instantiates a new {@link HTTPHealthcheck} and sets the default values.
     */
    public HTTPHealthcheck() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HTTPHealthcheck}
     */
    @jakarta.annotation.Nonnull
    public static HTTPHealthcheck createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HTTPHealthcheck();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("headers", (n) -> { this.setHeaders(n.getCollectionOfObjectValues(MachineHTTPHeader::createFromDiscriminatorValue)); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getStringValue()); });
        deserializerMap.put("path", (n) -> { this.setPath(n.getStringValue()); });
        deserializerMap.put("port", (n) -> { this.setPort(n.getIntegerValue()); });
        deserializerMap.put("scheme", (n) -> { this.setScheme(n.getEnumValue(ContainerHealthcheckScheme::forValue)); });
        deserializerMap.put("tls_server_name", (n) -> { this.setTlsServerName(n.getStringValue()); });
        deserializerMap.put("tls_skip_verify", (n) -> { this.setTlsSkipVerify(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the headers property value. Additional headers to send with the request
     * @return a {@link java.util.List<MachineHTTPHeader>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MachineHTTPHeader> getHeaders() {
        return this.headers;
    }
    /**
     * Gets the method property value. The HTTP method to use to when making the request
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMethod() {
        return this.method;
    }
    /**
     * Gets the path property value. The path to send the request to
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPath() {
        return this.path;
    }
    /**
     * Gets the port property value. The port to connect to, often the same as internal_port
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPort() {
        return this.port;
    }
    /**
     * Gets the scheme property value. Whether to use http or https
     * @return a {@link ContainerHealthcheckScheme}
     */
    @jakarta.annotation.Nullable
    public ContainerHealthcheckScheme getScheme() {
        return this.scheme;
    }
    /**
     * Gets the tls_server_name property value. If the protocol is https, the hostname to use for TLS certificate validation
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTlsServerName() {
        return this.tlsServerName;
    }
    /**
     * Gets the tls_skip_verify property value. If the protocol is https, whether or not to verify the TLS certificate
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTlsSkipVerify() {
        return this.tlsSkipVerify;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("headers", this.getHeaders());
        writer.writeStringValue("method", this.getMethod());
        writer.writeStringValue("path", this.getPath());
        writer.writeIntegerValue("port", this.getPort());
        writer.writeEnumValue("scheme", this.getScheme());
        writer.writeStringValue("tls_server_name", this.getTlsServerName());
        writer.writeBooleanValue("tls_skip_verify", this.getTlsSkipVerify());
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
     * Sets the headers property value. Additional headers to send with the request
     * @param value Value to set for the headers property.
     */
    public void setHeaders(@jakarta.annotation.Nullable final java.util.List<MachineHTTPHeader> value) {
        this.headers = value;
    }
    /**
     * Sets the method property value. The HTTP method to use to when making the request
     * @param value Value to set for the method property.
     */
    public void setMethod(@jakarta.annotation.Nullable final String value) {
        this.method = value;
    }
    /**
     * Sets the path property value. The path to send the request to
     * @param value Value to set for the path property.
     */
    public void setPath(@jakarta.annotation.Nullable final String value) {
        this.path = value;
    }
    /**
     * Sets the port property value. The port to connect to, often the same as internal_port
     * @param value Value to set for the port property.
     */
    public void setPort(@jakarta.annotation.Nullable final Integer value) {
        this.port = value;
    }
    /**
     * Sets the scheme property value. Whether to use http or https
     * @param value Value to set for the scheme property.
     */
    public void setScheme(@jakarta.annotation.Nullable final ContainerHealthcheckScheme value) {
        this.scheme = value;
    }
    /**
     * Sets the tls_server_name property value. If the protocol is https, the hostname to use for TLS certificate validation
     * @param value Value to set for the tls_server_name property.
     */
    public void setTlsServerName(@jakarta.annotation.Nullable final String value) {
        this.tlsServerName = value;
    }
    /**
     * Sets the tls_skip_verify property value. If the protocol is https, whether or not to verify the TLS certificate
     * @param value Value to set for the tls_skip_verify property.
     */
    public void setTlsSkipVerify(@jakarta.annotation.Nullable final Boolean value) {
        this.tlsSkipVerify = value;
    }
}
