/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Profiles.
 */
public final class ProfilesInner {
    /** The Retrofit service to perform REST calls. */
    private ProfilesService service;
    /** The service client containing this operation class. */
    private TrafficManagerManagementClientImpl client;

    /**
     * Initializes an instance of ProfilesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ProfilesInner(Retrofit retrofit, TrafficManagerManagementClientImpl client) {
        this.service = retrofit.create(ProfilesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Profiles to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProfilesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.trafficmanager.Profiles checkTrafficManagerRelativeDnsNameAvailability" })
        @POST("providers/Microsoft.Network/checkTrafficManagerNameAvailability")
        Observable<Response<ResponseBody>> checkTrafficManagerRelativeDnsNameAvailability(@Path("subscriptionId") String subscriptionId, @Body CheckTrafficManagerRelativeDnsNameAvailabilityParametersInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.trafficmanager.Profiles listAllInResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficmanagerprofiles")
        Observable<Response<ResponseBody>> listAllInResourceGroup(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.trafficmanager.Profiles listAll" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/trafficmanagerprofiles")
        Observable<Response<ResponseBody>> listAll(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.trafficmanager.Profiles get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficmanagerprofiles/{profileName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("profileName") String profileName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.trafficmanager.Profiles createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficmanagerprofiles/{profileName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("profileName") String profileName, @Path("subscriptionId") String subscriptionId, @Body ProfileInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.trafficmanager.Profiles delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficmanagerprofiles/{profileName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("profileName") String profileName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.trafficmanager.Profiles update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficmanagerprofiles/{profileName}")
        Observable<Response<ResponseBody>> update(@Path("resourceGroupName") String resourceGroupName, @Path("profileName") String profileName, @Path("subscriptionId") String subscriptionId, @Body ProfileInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Checks the availability of a Traffic Manager Relative DNS name.
     *
     * @param parameters The Traffic Manager name parameters supplied to the CheckTrafficManagerNameAvailability operation.
     * @return the TrafficManagerNameAvailabilityInner object if successful.
     */
    public TrafficManagerNameAvailabilityInner checkTrafficManagerRelativeDnsNameAvailability(CheckTrafficManagerRelativeDnsNameAvailabilityParametersInner parameters) {
        return checkTrafficManagerRelativeDnsNameAvailabilityWithServiceResponseAsync(parameters).toBlocking().single().body();
    }

    /**
     * Checks the availability of a Traffic Manager Relative DNS name.
     *
     * @param parameters The Traffic Manager name parameters supplied to the CheckTrafficManagerNameAvailability operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<TrafficManagerNameAvailabilityInner> checkTrafficManagerRelativeDnsNameAvailabilityAsync(CheckTrafficManagerRelativeDnsNameAvailabilityParametersInner parameters, final ServiceCallback<TrafficManagerNameAvailabilityInner> serviceCallback) {
        return ServiceCall.fromResponse(checkTrafficManagerRelativeDnsNameAvailabilityWithServiceResponseAsync(parameters), serviceCallback);
    }

    /**
     * Checks the availability of a Traffic Manager Relative DNS name.
     *
     * @param parameters The Traffic Manager name parameters supplied to the CheckTrafficManagerNameAvailability operation.
     * @return the observable to the TrafficManagerNameAvailabilityInner object
     */
    public Observable<TrafficManagerNameAvailabilityInner> checkTrafficManagerRelativeDnsNameAvailabilityAsync(CheckTrafficManagerRelativeDnsNameAvailabilityParametersInner parameters) {
        return checkTrafficManagerRelativeDnsNameAvailabilityWithServiceResponseAsync(parameters).map(new Func1<ServiceResponse<TrafficManagerNameAvailabilityInner>, TrafficManagerNameAvailabilityInner>() {
            @Override
            public TrafficManagerNameAvailabilityInner call(ServiceResponse<TrafficManagerNameAvailabilityInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Checks the availability of a Traffic Manager Relative DNS name.
     *
     * @param parameters The Traffic Manager name parameters supplied to the CheckTrafficManagerNameAvailability operation.
     * @return the observable to the TrafficManagerNameAvailabilityInner object
     */
    public Observable<ServiceResponse<TrafficManagerNameAvailabilityInner>> checkTrafficManagerRelativeDnsNameAvailabilityWithServiceResponseAsync(CheckTrafficManagerRelativeDnsNameAvailabilityParametersInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.checkTrafficManagerRelativeDnsNameAvailability(this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TrafficManagerNameAvailabilityInner>>>() {
                @Override
                public Observable<ServiceResponse<TrafficManagerNameAvailabilityInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TrafficManagerNameAvailabilityInner> clientResponse = checkTrafficManagerRelativeDnsNameAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TrafficManagerNameAvailabilityInner> checkTrafficManagerRelativeDnsNameAvailabilityDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TrafficManagerNameAvailabilityInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TrafficManagerNameAvailabilityInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all Traffic Manager profiles within a resource group.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profiles to be listed.
     * @return the List&lt;ProfileInner&gt; object if successful.
     */
    public List<ProfileInner> listAllInResourceGroup(String resourceGroupName) {
        return listAllInResourceGroupWithServiceResponseAsync(resourceGroupName).toBlocking().single().body();
    }

    /**
     * Lists all Traffic Manager profiles within a resource group.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profiles to be listed.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<ProfileInner>> listAllInResourceGroupAsync(String resourceGroupName, final ServiceCallback<List<ProfileInner>> serviceCallback) {
        return ServiceCall.fromResponse(listAllInResourceGroupWithServiceResponseAsync(resourceGroupName), serviceCallback);
    }

    /**
     * Lists all Traffic Manager profiles within a resource group.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profiles to be listed.
     * @return the observable to the List&lt;ProfileInner&gt; object
     */
    public Observable<List<ProfileInner>> listAllInResourceGroupAsync(String resourceGroupName) {
        return listAllInResourceGroupWithServiceResponseAsync(resourceGroupName).map(new Func1<ServiceResponse<List<ProfileInner>>, List<ProfileInner>>() {
            @Override
            public List<ProfileInner> call(ServiceResponse<List<ProfileInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all Traffic Manager profiles within a resource group.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profiles to be listed.
     * @return the observable to the List&lt;ProfileInner&gt; object
     */
    public Observable<ServiceResponse<List<ProfileInner>>> listAllInResourceGroupWithServiceResponseAsync(String resourceGroupName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listAllInResourceGroup(resourceGroupName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ProfileInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ProfileInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProfileInner>> result = listAllInResourceGroupDelegate(response);
                        ServiceResponse<List<ProfileInner>> clientResponse = new ServiceResponse<List<ProfileInner>>(result.body().items(), result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ProfileInner>> listAllInResourceGroupDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ProfileInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ProfileInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all Traffic Manager profiles within a subscription.
     *
     * @return the List&lt;ProfileInner&gt; object if successful.
     */
    public List<ProfileInner> listAll() {
        return listAllWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Lists all Traffic Manager profiles within a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<ProfileInner>> listAllAsync(final ServiceCallback<List<ProfileInner>> serviceCallback) {
        return ServiceCall.fromResponse(listAllWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Lists all Traffic Manager profiles within a subscription.
     *
     * @return the observable to the List&lt;ProfileInner&gt; object
     */
    public Observable<List<ProfileInner>> listAllAsync() {
        return listAllWithServiceResponseAsync().map(new Func1<ServiceResponse<List<ProfileInner>>, List<ProfileInner>>() {
            @Override
            public List<ProfileInner> call(ServiceResponse<List<ProfileInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all Traffic Manager profiles within a subscription.
     *
     * @return the observable to the List&lt;ProfileInner&gt; object
     */
    public Observable<ServiceResponse<List<ProfileInner>>> listAllWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listAll(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ProfileInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ProfileInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProfileInner>> result = listAllDelegate(response);
                        ServiceResponse<List<ProfileInner>> clientResponse = new ServiceResponse<List<ProfileInner>>(result.body().items(), result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ProfileInner>> listAllDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ProfileInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ProfileInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @return the ProfileInner object if successful.
     */
    public ProfileInner get(String resourceGroupName, String profileName) {
        return getWithServiceResponseAsync(resourceGroupName, profileName).toBlocking().single().body();
    }

    /**
     * Gets a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<ProfileInner> getAsync(String resourceGroupName, String profileName, final ServiceCallback<ProfileInner> serviceCallback) {
        return ServiceCall.fromResponse(getWithServiceResponseAsync(resourceGroupName, profileName), serviceCallback);
    }

    /**
     * Gets a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @return the observable to the ProfileInner object
     */
    public Observable<ProfileInner> getAsync(String resourceGroupName, String profileName) {
        return getWithServiceResponseAsync(resourceGroupName, profileName).map(new Func1<ServiceResponse<ProfileInner>, ProfileInner>() {
            @Override
            public ProfileInner call(ServiceResponse<ProfileInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @return the observable to the ProfileInner object
     */
    public Observable<ServiceResponse<ProfileInner>> getWithServiceResponseAsync(String resourceGroupName, String profileName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, profileName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ProfileInner>>>() {
                @Override
                public Observable<ServiceResponse<ProfileInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ProfileInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ProfileInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProfileInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProfileInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Create or update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the CreateOrUpdate operation.
     * @return the ProfileInner object if successful.
     */
    public ProfileInner createOrUpdate(String resourceGroupName, String profileName, ProfileInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, profileName, parameters).toBlocking().single().body();
    }

    /**
     * Create or update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the CreateOrUpdate operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<ProfileInner> createOrUpdateAsync(String resourceGroupName, String profileName, ProfileInner parameters, final ServiceCallback<ProfileInner> serviceCallback) {
        return ServiceCall.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, profileName, parameters), serviceCallback);
    }

    /**
     * Create or update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the CreateOrUpdate operation.
     * @return the observable to the ProfileInner object
     */
    public Observable<ProfileInner> createOrUpdateAsync(String resourceGroupName, String profileName, ProfileInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, profileName, parameters).map(new Func1<ServiceResponse<ProfileInner>, ProfileInner>() {
            @Override
            public ProfileInner call(ServiceResponse<ProfileInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the CreateOrUpdate operation.
     * @return the observable to the ProfileInner object
     */
    public Observable<ServiceResponse<ProfileInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String profileName, ProfileInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.createOrUpdate(resourceGroupName, profileName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ProfileInner>>>() {
                @Override
                public Observable<ServiceResponse<ProfileInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ProfileInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ProfileInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProfileInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProfileInner>() { }.getType())
                .register(201, new TypeToken<ProfileInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile to be deleted.
     * @param profileName The name of the Traffic Manager profile to be deleted.
     */
    public void delete(String resourceGroupName, String profileName) {
        deleteWithServiceResponseAsync(resourceGroupName, profileName).toBlocking().single().body();
    }

    /**
     * Deletes a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile to be deleted.
     * @param profileName The name of the Traffic Manager profile to be deleted.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> deleteAsync(String resourceGroupName, String profileName, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, profileName), serviceCallback);
    }

    /**
     * Deletes a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile to be deleted.
     * @param profileName The name of the Traffic Manager profile to be deleted.
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String profileName) {
        return deleteWithServiceResponseAsync(resourceGroupName, profileName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile to be deleted.
     * @param profileName The name of the Traffic Manager profile to be deleted.
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String profileName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceGroupName, profileName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .build(response);
    }

    /**
     * Update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the Update operation.
     * @return the ProfileInner object if successful.
     */
    public ProfileInner update(String resourceGroupName, String profileName, ProfileInner parameters) {
        return updateWithServiceResponseAsync(resourceGroupName, profileName, parameters).toBlocking().single().body();
    }

    /**
     * Update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the Update operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<ProfileInner> updateAsync(String resourceGroupName, String profileName, ProfileInner parameters, final ServiceCallback<ProfileInner> serviceCallback) {
        return ServiceCall.fromResponse(updateWithServiceResponseAsync(resourceGroupName, profileName, parameters), serviceCallback);
    }

    /**
     * Update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the Update operation.
     * @return the observable to the ProfileInner object
     */
    public Observable<ProfileInner> updateAsync(String resourceGroupName, String profileName, ProfileInner parameters) {
        return updateWithServiceResponseAsync(resourceGroupName, profileName, parameters).map(new Func1<ServiceResponse<ProfileInner>, ProfileInner>() {
            @Override
            public ProfileInner call(ServiceResponse<ProfileInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update a Traffic Manager profile.
     *
     * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
     * @param profileName The name of the Traffic Manager profile.
     * @param parameters The Traffic Manager profile parameters supplied to the Update operation.
     * @return the observable to the ProfileInner object
     */
    public Observable<ServiceResponse<ProfileInner>> updateWithServiceResponseAsync(String resourceGroupName, String profileName, ProfileInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (profileName == null) {
            throw new IllegalArgumentException("Parameter profileName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.update(resourceGroupName, profileName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ProfileInner>>>() {
                @Override
                public Observable<ServiceResponse<ProfileInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ProfileInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ProfileInner> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProfileInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProfileInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
