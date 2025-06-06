package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DecryptSecretkeyRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The associated_data property
     */
    private java.util.List<Integer> associatedData;
    /**
     * The ciphertext property
     */
    private java.util.List<Integer> ciphertext;
    /**
     * Instantiates a new {@link DecryptSecretkeyRequest} and sets the default values.
     */
    public DecryptSecretkeyRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DecryptSecretkeyRequest}
     */
    @jakarta.annotation.Nonnull
    public static DecryptSecretkeyRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DecryptSecretkeyRequest();
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
     * Gets the associated_data property value. The associated_data property
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getAssociatedData() {
        return this.associatedData;
    }
    /**
     * Gets the ciphertext property value. The ciphertext property
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getCiphertext() {
        return this.ciphertext;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("associated_data", (n) -> { this.setAssociatedData(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("ciphertext", (n) -> { this.setCiphertext(n.getCollectionOfPrimitiveValues(Integer.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("associated_data", this.getAssociatedData());
        writer.writeCollectionOfPrimitiveValues("ciphertext", this.getCiphertext());
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
     * Sets the associated_data property value. The associated_data property
     * @param value Value to set for the associated_data property.
     */
    public void setAssociatedData(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.associatedData = value;
    }
    /**
     * Sets the ciphertext property value. The ciphertext property
     * @param value Value to set for the ciphertext property.
     */
    public void setCiphertext(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.ciphertext = value;
    }
}
