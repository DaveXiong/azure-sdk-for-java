/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.storage;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.credentials.ApplicationTokenCredentials;
import com.microsoft.azure.management.resources.implementation.ResourceManager;
import com.microsoft.azure.management.storage.implementation.StorageManager;
import com.microsoft.rest.LogLevel;
import com.microsoft.rest.RestClient;

/**
 * The base for storage manager tests.
 */
public abstract class StorageManagementTestBase {
    protected static ResourceManager resourceManager;
    protected static StorageManager storageManager;

    protected static void createClients() {
        ApplicationTokenCredentials credentials = new ApplicationTokenCredentials(
                System.getenv("client-id"),
                System.getenv("domain"),
                System.getenv("secret"),
                AzureEnvironment.AZURE);

        RestClient restClient = new RestClient.Builder()
                .withBaseUrl(AzureEnvironment.AZURE, AzureEnvironment.Endpoint.RESOURCE_MANAGER)
                .withCredentials(credentials)
                .withLogLevel(LogLevel.BASIC)
                .build();

        resourceManager = ResourceManager
                .authenticate(restClient)
                .withSubscription(System.getenv("subscription-id"));

        storageManager = StorageManager
                .authenticate(restClient, System.getenv("subscription-id"));
    }
}
