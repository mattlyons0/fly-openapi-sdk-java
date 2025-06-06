package io.fly.sdk.client.models.main;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import io.fly.sdk.client.models.fly.MachineGuest;
import io.fly.sdk.client.models.placement.Weights;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetPlacementsRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Resource requirements for the Machine to simulate. Defaults to a performance-1x machine
     */
    private MachineGuest compute;
    /**
     * Number of machines to simulate placement.Defaults to 0, which returns the org-specific limit for each region.
     */
    private Integer count;
    /**
     * The org_slug property
     */
    private String orgSlug;
    /**
     * Region expression for placement as a comma-delimited set of regions or aliases.Defaults to &quot;[region],any&quot;, to prefer the API endpoint&apos;s local region with any other region as fallback.
     */
    private String region;
    /**
     * The volume_name property
     */
    private String volumeName;
    /**
     * The volume_size_bytes property
     */
    private Integer volumeSizeBytes;
    /**
     * Optional weights to override default placement preferences.
     */
    private Weights weights;
    /**
     * Instantiates a new {@link GetPlacementsRequest} and sets the default values.
     */
    public GetPlacementsRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetPlacementsRequest}
     */
    @jakarta.annotation.Nonnull
    public static GetPlacementsRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetPlacementsRequest();
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
     * Gets the compute property value. Resource requirements for the Machine to simulate. Defaults to a performance-1x machine
     * @return a {@link MachineGuest}
     */
    @jakarta.annotation.Nullable
    public MachineGuest getCompute() {
        return this.compute;
    }
    /**
     * Gets the count property value. Number of machines to simulate placement.Defaults to 0, which returns the org-specific limit for each region.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCount() {
        return this.count;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("compute", (n) -> { this.setCompute(n.getObjectValue(MachineGuest::createFromDiscriminatorValue)); });
        deserializerMap.put("count", (n) -> { this.setCount(n.getIntegerValue()); });
        deserializerMap.put("org_slug", (n) -> { this.setOrgSlug(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        deserializerMap.put("volume_name", (n) -> { this.setVolumeName(n.getStringValue()); });
        deserializerMap.put("volume_size_bytes", (n) -> { this.setVolumeSizeBytes(n.getIntegerValue()); });
        deserializerMap.put("weights", (n) -> { this.setWeights(n.getObjectValue(Weights::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the org_slug property value. The org_slug property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrgSlug() {
        return this.orgSlug;
    }
    /**
     * Gets the region property value. Region expression for placement as a comma-delimited set of regions or aliases.Defaults to &quot;[region],any&quot;, to prefer the API endpoint&apos;s local region with any other region as fallback.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Gets the volume_name property value. The volume_name property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVolumeName() {
        return this.volumeName;
    }
    /**
     * Gets the volume_size_bytes property value. The volume_size_bytes property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVolumeSizeBytes() {
        return this.volumeSizeBytes;
    }
    /**
     * Gets the weights property value. Optional weights to override default placement preferences.
     * @return a {@link Weights}
     */
    @jakarta.annotation.Nullable
    public Weights getWeights() {
        return this.weights;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("compute", this.getCompute());
        writer.writeIntegerValue("count", this.getCount());
        writer.writeStringValue("org_slug", this.getOrgSlug());
        writer.writeStringValue("region", this.getRegion());
        writer.writeStringValue("volume_name", this.getVolumeName());
        writer.writeIntegerValue("volume_size_bytes", this.getVolumeSizeBytes());
        writer.writeObjectValue("weights", this.getWeights());
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
     * Sets the compute property value. Resource requirements for the Machine to simulate. Defaults to a performance-1x machine
     * @param value Value to set for the compute property.
     */
    public void setCompute(@jakarta.annotation.Nullable final MachineGuest value) {
        this.compute = value;
    }
    /**
     * Sets the count property value. Number of machines to simulate placement.Defaults to 0, which returns the org-specific limit for each region.
     * @param value Value to set for the count property.
     */
    public void setCount(@jakarta.annotation.Nullable final Integer value) {
        this.count = value;
    }
    /**
     * Sets the org_slug property value. The org_slug property
     * @param value Value to set for the org_slug property.
     */
    public void setOrgSlug(@jakarta.annotation.Nullable final String value) {
        this.orgSlug = value;
    }
    /**
     * Sets the region property value. Region expression for placement as a comma-delimited set of regions or aliases.Defaults to &quot;[region],any&quot;, to prefer the API endpoint&apos;s local region with any other region as fallback.
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.region = value;
    }
    /**
     * Sets the volume_name property value. The volume_name property
     * @param value Value to set for the volume_name property.
     */
    public void setVolumeName(@jakarta.annotation.Nullable final String value) {
        this.volumeName = value;
    }
    /**
     * Sets the volume_size_bytes property value. The volume_size_bytes property
     * @param value Value to set for the volume_size_bytes property.
     */
    public void setVolumeSizeBytes(@jakarta.annotation.Nullable final Integer value) {
        this.volumeSizeBytes = value;
    }
    /**
     * Sets the weights property value. Optional weights to override default placement preferences.
     * @param value Value to set for the weights property.
     */
    public void setWeights(@jakarta.annotation.Nullable final Weights value) {
        this.weights = value;
    }
}
