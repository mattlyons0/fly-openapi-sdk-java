package io.fly.sdk.client.apps.item.secrets.item.type;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import io.fly.sdk.client.apps.item.secrets.item.type.item.WithSecretTypeItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /apps/{app_name}/secrets/{secret_label}/type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TypeRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.fly.sdk.client.apps.item.secrets.item.type.item collection
     * @param secret_type App Secret Type
     * @return a {@link WithSecretTypeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSecretTypeItemRequestBuilder bySecret_type(@jakarta.annotation.Nonnull final String secret_type) {
        Objects.requireNonNull(secret_type);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("secret_type", secret_type);
        return new WithSecretTypeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link TypeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TypeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/secrets/{secret_label}/type", pathParameters);
    }
    /**
     * Instantiates a new {@link TypeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TypeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/secrets/{secret_label}/type", rawUrl);
    }
}
