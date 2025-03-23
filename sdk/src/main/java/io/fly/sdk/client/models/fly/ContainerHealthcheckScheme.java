package io.fly.sdk.client.models.fly;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContainerHealthcheckScheme implements ValuedEnum {
    Http("http"),
    Https("https");
    public final String value;
    ContainerHealthcheckScheme(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContainerHealthcheckScheme forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "http": return Http;
            case "https": return Https;
            default: return null;
        }
    }
}
