package io.fly.sdk.client.models.reads;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCapacityPerRegionRow implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The capacity property
     */
    private Integer capacity;
    /**
     * The code property
     */
    private String code;
    /**
     * The gateway_available property
     */
    private Boolean gatewayAvailable;
    /**
     * The geo_region property
     */
    private String geoRegion;
    /**
     * The latitude property
     */
    private Double latitude;
    /**
     * The longitude property
     */
    private Double longitude;
    /**
     * The name property
     */
    private String name;
    /**
     * The requires_paid_plan property
     */
    private Boolean requiresPaidPlan;
    /**
     * Instantiates a new {@link GetCapacityPerRegionRow} and sets the default values.
     */
    public GetCapacityPerRegionRow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetCapacityPerRegionRow}
     */
    @jakarta.annotation.Nonnull
    public static GetCapacityPerRegionRow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetCapacityPerRegionRow();
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
     * Gets the capacity property value. The capacity property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCapacity() {
        return this.capacity;
    }
    /**
     * Gets the code property value. The code property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("capacity", (n) -> { this.setCapacity(n.getIntegerValue()); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("gateway_available", (n) -> { this.setGatewayAvailable(n.getBooleanValue()); });
        deserializerMap.put("geo_region", (n) -> { this.setGeoRegion(n.getStringValue()); });
        deserializerMap.put("latitude", (n) -> { this.setLatitude(n.getDoubleValue()); });
        deserializerMap.put("longitude", (n) -> { this.setLongitude(n.getDoubleValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("requires_paid_plan", (n) -> { this.setRequiresPaidPlan(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gateway_available property value. The gateway_available property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGatewayAvailable() {
        return this.gatewayAvailable;
    }
    /**
     * Gets the geo_region property value. The geo_region property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGeoRegion() {
        return this.geoRegion;
    }
    /**
     * Gets the latitude property value. The latitude property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLatitude() {
        return this.latitude;
    }
    /**
     * Gets the longitude property value. The longitude property
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getLongitude() {
        return this.longitude;
    }
    /**
     * Gets the name property value. The name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the requires_paid_plan property value. The requires_paid_plan property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequiresPaidPlan() {
        return this.requiresPaidPlan;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("capacity", this.getCapacity());
        writer.writeStringValue("code", this.getCode());
        writer.writeBooleanValue("gateway_available", this.getGatewayAvailable());
        writer.writeStringValue("geo_region", this.getGeoRegion());
        writer.writeDoubleValue("latitude", this.getLatitude());
        writer.writeDoubleValue("longitude", this.getLongitude());
        writer.writeStringValue("name", this.getName());
        writer.writeBooleanValue("requires_paid_plan", this.getRequiresPaidPlan());
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
     * Sets the capacity property value. The capacity property
     * @param value Value to set for the capacity property.
     */
    public void setCapacity(@jakarta.annotation.Nullable final Integer value) {
        this.capacity = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the gateway_available property value. The gateway_available property
     * @param value Value to set for the gateway_available property.
     */
    public void setGatewayAvailable(@jakarta.annotation.Nullable final Boolean value) {
        this.gatewayAvailable = value;
    }
    /**
     * Sets the geo_region property value. The geo_region property
     * @param value Value to set for the geo_region property.
     */
    public void setGeoRegion(@jakarta.annotation.Nullable final String value) {
        this.geoRegion = value;
    }
    /**
     * Sets the latitude property value. The latitude property
     * @param value Value to set for the latitude property.
     */
    public void setLatitude(@jakarta.annotation.Nullable final Double value) {
        this.latitude = value;
    }
    /**
     * Sets the longitude property value. The longitude property
     * @param value Value to set for the longitude property.
     */
    public void setLongitude(@jakarta.annotation.Nullable final Double value) {
        this.longitude = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the requires_paid_plan property value. The requires_paid_plan property
     * @param value Value to set for the requires_paid_plan property.
     */
    public void setRequiresPaidPlan(@jakarta.annotation.Nullable final Boolean value) {
        this.requiresPaidPlan = value;
    }
}
