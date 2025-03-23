package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TempDirVolume implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The size limit of the temp dir, only applicable when using disk backed storage.
     */
    private Integer sizeMb;
    /**
     * The type of storage used to back the temp dir. Either disk or memory.
     */
    private String storageType;
    /**
     * Instantiates a new {@link TempDirVolume} and sets the default values.
     */
    public TempDirVolume() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TempDirVolume}
     */
    @jakarta.annotation.Nonnull
    public static TempDirVolume createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TempDirVolume();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("size_mb", (n) -> { this.setSizeMb(n.getIntegerValue()); });
        deserializerMap.put("storage_type", (n) -> { this.setStorageType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the size_mb property value. The size limit of the temp dir, only applicable when using disk backed storage.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSizeMb() {
        return this.sizeMb;
    }
    /**
     * Gets the storage_type property value. The type of storage used to back the temp dir. Either disk or memory.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStorageType() {
        return this.storageType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("size_mb", this.getSizeMb());
        writer.writeStringValue("storage_type", this.getStorageType());
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
     * Sets the size_mb property value. The size limit of the temp dir, only applicable when using disk backed storage.
     * @param value Value to set for the size_mb property.
     */
    public void setSizeMb(@jakarta.annotation.Nullable final Integer value) {
        this.sizeMb = value;
    }
    /**
     * Sets the storage_type property value. The type of storage used to back the temp dir. Either disk or memory.
     * @param value Value to set for the storage_type property.
     */
    public void setStorageType(@jakarta.annotation.Nullable final String value) {
        this.storageType = value;
    }
}
