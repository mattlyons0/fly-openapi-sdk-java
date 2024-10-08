package io.fly.sdk.client;

import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import io.fly.sdk.client.apps.AppsRequestBuilder;
import io.fly.sdk.client.tokens.TokensRequestBuilder;
import io.kiota.serialization.json.JsonParseNodeFactory;
import io.kiota.serialization.json.JsonSerializationWriterFactory;

import java.util.HashMap;

/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FlySdkClient extends BaseRequestBuilder {
    /**
     * The apps property
     * @return a {@link AppsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppsRequestBuilder apps() {
        return new AppsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tokens property
     * @return a {@link TokensRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TokensRequestBuilder tokens() {
        return new TokensRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link FlySdkClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FlySdkClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.machines.dev/v1");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
