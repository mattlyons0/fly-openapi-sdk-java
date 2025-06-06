package io.fly.sdk.client.apps.item.secretkeys;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.fly.sdk.client.apps.item.secretkeys.item.WithSecretNameItemRequestBuilder;
import io.fly.sdk.client.models.SecretKeys;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /apps/{app_name}/secretkeys
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecretkeysRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.fly.sdk.client.apps.item.secretkeys.item collection
     * @param secret_name Secret key name
     * @return a {@link WithSecretNameItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSecretNameItemRequestBuilder bySecret_name(@jakarta.annotation.Nonnull final String secret_name) {
        Objects.requireNonNull(secret_name);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("secret_name", secret_name);
        return new WithSecretNameItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link SecretkeysRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SecretkeysRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/secretkeys{?min_version*,types*}", pathParameters);
    }
    /**
     * Instantiates a new {@link SecretkeysRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SecretkeysRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/secretkeys{?min_version*,types*}", rawUrl);
    }
    /**
     * List secret keys belonging to an app
     * @return a {@link SecretKeys}
     */
    @jakarta.annotation.Nullable
    public SecretKeys get() {
        return get(null);
    }
    /**
     * List secret keys belonging to an app
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SecretKeys}
     */
    @jakarta.annotation.Nullable
    public SecretKeys get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SecretKeys::createFromDiscriminatorValue);
    }
    /**
     * List secret keys belonging to an app
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List secret keys belonging to an app
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link SecretkeysRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SecretkeysRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SecretkeysRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List secret keys belonging to an app
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Minimum secrets version to return. Returned when setting a new secret
         */
        @jakarta.annotation.Nullable
        public String minVersion;
        /**
         * Comma-seperated list of secret keys to list
         */
        @jakarta.annotation.Nullable
        public String types;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("min_version", minVersion);
            allQueryParams.put("types", types);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
