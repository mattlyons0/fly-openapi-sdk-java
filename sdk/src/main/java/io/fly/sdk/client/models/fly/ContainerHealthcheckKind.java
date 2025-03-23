package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContainerHealthcheckKind implements ValuedEnum {
    Readiness("readiness"),
    Liveness("liveness");
    public final String value;
    ContainerHealthcheckKind(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContainerHealthcheckKind forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "readiness": return Readiness;
            case "liveness": return Liveness;
            default: return null;
        }
    }
}
