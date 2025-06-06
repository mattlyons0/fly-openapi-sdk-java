package io.fly.sdk.client.apps.item.secretkeys.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.fly.sdk.client.apps.item.secretkeys.item.decrypt.DecryptRequestBuilder;
import io.fly.sdk.client.apps.item.secretkeys.item.encrypt.EncryptRequestBuilder;
import io.fly.sdk.client.apps.item.secretkeys.item.generate.GenerateRequestBuilder;
import io.fly.sdk.client.apps.item.secretkeys.item.sign.SignRequestBuilder;
import io.fly.sdk.client.apps.item.secretkeys.item.verify.VerifyRequestBuilder;
import io.fly.sdk.client.models.ErrorResponse;
import io.fly.sdk.client.models.SecretKey;
import io.fly.sdk.client.models.SetSecretkeyRequest;
import io.fly.sdk.client.models.SetSecretkeyResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /apps/{app_name}/secretkeys/{secret_name}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithSecretNameItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The decrypt property
     * @return a {@link DecryptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DecryptRequestBuilder decrypt() {
        return new DecryptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The encrypt property
     * @return a {@link EncryptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EncryptRequestBuilder encrypt() {
        return new EncryptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The generate property
     * @return a {@link GenerateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GenerateRequestBuilder generate() {
        return new GenerateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The sign property
     * @return a {@link SignRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SignRequestBuilder sign() {
        return new SignRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The verify property
     * @return a {@link VerifyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VerifyRequestBuilder verify() {
        return new VerifyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithSecretNameItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSecretNameItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/secretkeys/{secret_name}{?min_version*}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithSecretNameItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSecretNameItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/apps/{app_name}/secretkeys/{secret_name}{?min_version*}", rawUrl);
    }
    /**
     * Delete an app&apos;s secret key
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete an app&apos;s secret key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * Get an app&apos;s secret key
     * @return a {@link SecretKey}
     */
    @jakarta.annotation.Nullable
    public SecretKey get() {
        return get(null);
    }
    /**
     * Get an app&apos;s secret key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SecretKey}
     */
    @jakarta.annotation.Nullable
    public SecretKey get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SecretKey::createFromDiscriminatorValue);
    }
    /**
     * Create or update a secret key
     * @param body The request body
     * @return a {@link SetSecretkeyResponse}
     * @throws ErrorResponse When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public SetSecretkeyResponse post(@jakarta.annotation.Nonnull final SetSecretkeyRequest body) {
        return post(body, null);
    }
    /**
     * Create or update a secret key
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SetSecretkeyResponse}
     * @throws ErrorResponse When receiving a 400 status code
     */
    @jakarta.annotation.Nullable
    public SetSecretkeyResponse post(@jakarta.annotation.Nonnull final SetSecretkeyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SetSecretkeyResponse::createFromDiscriminatorValue);
    }
    /**
     * Delete an app&apos;s secret key
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete an app&apos;s secret key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Get an app&apos;s secret key
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get an app&apos;s secret key
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
     * Create or update a secret key
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SetSecretkeyRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create or update a secret key
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SetSecretkeyRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithSecretNameItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithSecretNameItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithSecretNameItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Get an app&apos;s secret key
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Minimum secrets version to return. Returned when setting a new secret
         */
        @jakarta.annotation.Nullable
        public String minVersion;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("min_version", minVersion);
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
