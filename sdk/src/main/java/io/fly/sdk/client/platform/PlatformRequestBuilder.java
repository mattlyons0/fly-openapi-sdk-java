package io.fly.sdk.client.platform;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import io.fly.sdk.client.platform.placements.PlacementsRequestBuilder;
import io.fly.sdk.client.platform.regions.RegionsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /platform
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlatformRequestBuilder extends BaseRequestBuilder {
    /**
     * The placements property
     * @return a {@link PlacementsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PlacementsRequestBuilder placements() {
        return new PlacementsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The regions property
     * @return a {@link RegionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RegionsRequestBuilder regions() {
        return new RegionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link PlatformRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PlatformRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform", pathParameters);
    }
    /**
     * Instantiates a new {@link PlatformRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PlatformRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/platform", rawUrl);
    }
}
