package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContainerDependencyCondition implements ValuedEnum {
    Exited_successfully("exited_successfully"),
    Healthy("healthy"),
    Started("started");
    public final String value;
    ContainerDependencyCondition(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContainerDependencyCondition forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "exited_successfully": return Exited_successfully;
            case "healthy": return Healthy;
            case "started": return Started;
            default: return null;
        }
    }
}
