package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Kind of the check (informational, readiness)
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MachineCheckKind implements ValuedEnum {
    Informational("informational"),
    Readiness("readiness");
    public final String value;
    MachineCheckKind(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MachineCheckKind forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "informational": return Informational;
            case "readiness": return Readiness;
            default: return null;
        }
    }
}
