package io.fly.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EncryptSecretkeyRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The associated_data property
     */
    private java.util.List<Integer> associatedData;
    /**
     * The plaintext property
     */
    private java.util.List<Integer> plaintext;
    /**
     * Instantiates a new {@link EncryptSecretkeyRequest} and sets the default values.
     */
    public EncryptSecretkeyRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EncryptSecretkeyRequest}
     */
    @jakarta.annotation.Nonnull
    public static EncryptSecretkeyRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EncryptSecretkeyRequest();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("associated_data", (n) -> { this.setAssociatedData(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("plaintext", (n) -> { this.setPlaintext(n.getCollectionOfPrimitiveValues(Integer.class)); });
        return deserializerMap;
    }
    /**
     * Gets the plaintext property value. The plaintext property
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getPlaintext() {
        return this.plaintext;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("associated_data", this.getAssociatedData());
        writer.writeCollectionOfPrimitiveValues("plaintext", this.getPlaintext());
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
     * Sets the plaintext property value. The plaintext property
     * @param value Value to set for the plaintext property.
     */
    public void setPlaintext(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.plaintext = value;
    }
}
