/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network.model;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.apigeneration.Method;
import com.microsoft.azure.management.network.PublicIpAddress;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;

/**
 * An interface representing a model's ability to reference a public IP address.
 */
@Fluent
public interface HasPublicIpAddress  {
    /**
     * @return the resource ID of the associated public IP address
     */
    String publicIpAddressId();

    /**
     * @return the associated public IP address
     */
    PublicIpAddress getPublicIpAddress();

    /**
     * Grouping of definition stages involving specifying the public IP address.
     */
    interface DefinitionStages {
        /**
         * The stage of the definition allowing to associate the resource with an existing public IP address.
         *
         * @param <ReturnT> the next stage of the definition
         */
        interface WithExistingPublicIpAddress<ReturnT> {
            /**
             * Associates an existing public IP address with the resource.
             *
             * @param publicIpAddress an existing public IP address
             * @return the next stage of the definition
             */
            ReturnT withExistingPublicIpAddress(PublicIpAddress publicIpAddress);

            /**
             * Associates an existing public IP address with the resource.
             *
             * @param resourceId the resource ID of an existing public IP address
             * @return the next stage of the definition
             */
            ReturnT withExistingPublicIpAddress(String resourceId);
        }

        /**
         * The stage of the definition allowing to associate the resource with a new public IP address.
         *
         * @param <ReturnT> the next stage of the definition
         */
        interface WithNewPublicIpAddressNoDnsLabel<ReturnT> {
            /**
             * Creates a new public IP address to associate with the resource.
             *
             * @param creatable a creatable definition for a new public IP
             * @return the next stage of the definition
             */
            ReturnT withNewPublicIpAddress(Creatable<PublicIpAddress> creatable);

            /**
             * Creates a new public IP address in the same region and group as the resource and associates it with the resource.
             * <p>
             * The internal name and DNS label for the public IP address will be derived from the resource's name.
             *
             * @return the next stage of the definition
             */
            ReturnT withNewPublicIpAddress();
        }

        /**
         * The stage of the definition allowing to associate the resource with a new public IP address.
         *
         * @param <ReturnT> the next stage of the definition
         */
        interface WithNewPublicIpAddress<ReturnT> extends WithNewPublicIpAddressNoDnsLabel<ReturnT> {
            /**
             * Creates a new public IP address in the same region and group as the resource, with the specified DNS label
             * and associates it with the resource.
             * <p>
             * The internal name for the public IP address will be derived from the DNS label.
             *
             * @param leafDnsLabel the leaf domain label
             * @return the next stage of the definition
             */
            ReturnT withNewPublicIpAddress(String leafDnsLabel);
        }

        /**
         * The stage of the definition allowing to associate the resource with a public IP address,
         * but not allowing to create one with a DNS leaf label.
         *
         * @param <ReturnT> the next stage of the definition
         */
        interface WithPublicIpAddressNoDnsLabel<ReturnT> extends
            WithExistingPublicIpAddress<ReturnT>,
            WithNewPublicIpAddressNoDnsLabel<ReturnT> {
        }

        /**
         * The stage of the definition allowing to associate the resource with a public IP address.
         *
         * @param <ReturnT> the next stage of the definition
         */
        interface WithPublicIpAddress<ReturnT> extends
            WithExistingPublicIpAddress<ReturnT>,
            WithNewPublicIpAddress<ReturnT> {
        }
    }

    /**
     * Grouping of update stages involving modifying an existing reference to a public IP address.
     */
    interface UpdateStages {
        /**
         * The stage of the update allowing to associate the resource with an existing public IP address.
         *
         * @param <ReturnT> the next stage of the update
         */
        interface WithExistingPublicIpAddress<ReturnT> {
            /**
             * Associates an existing public IP address with the resource.
             *
             * @param publicIpAddress an existing public IP address
             * @return the next stage of the update
             */
            ReturnT withExistingPublicIpAddress(PublicIpAddress publicIpAddress);

            /**
             * Associates an existing public IP address with the resource.
             *
             * @param resourceId the resource ID of an existing public IP address
             * @return the next stage of the definition
             */
            ReturnT withExistingPublicIpAddress(String resourceId);

            /**
             * Removes the existing reference to a public IP address.
             *
             * @return the next stage of the update.
             */
            @Method
            ReturnT withoutPublicIpAddress();
        }

        /**
         * The stage of the update allowing to associate the resource with a new public IP address.
         *
         * @param <ReturnT> the next stage of the definition
         */
        interface WithNewPublicIpAddressNoDnsLabel<ReturnT> {
            /**
             * Creates a new public IP address to associate with the resource.
             *
             * @param creatable a creatable definition for a new public IP
             * @return the next stage of the definition
             */
            ReturnT withNewPublicIpAddress(Creatable<PublicIpAddress> creatable);

            /**
             * Creates a new public IP address in the same region and group as the resource and associates it with the resource.
             * <p>
             * The internal name and DNS label for the public IP address will be derived from the resource's name.
             *
             * @return the next stage of the definition
             */
            ReturnT withNewPublicIpAddress();
        }

        /**
         * The stage of the update allowing to associate the resource with a new public IP address.
         *
         * @param <ReturnT> the next stage of the definition
         */
        interface WithNewPublicIpAddress<ReturnT> extends WithNewPublicIpAddressNoDnsLabel<ReturnT> {
            /**
             * Creates a new public IP address in the same region and group as the resource, with the specified DNS label
             * and associates it with the resource.
             * <p>
             * The internal name for the public IP address will be derived from the DNS label.
             *
             * @param leafDnsLabel the leaf domain label
             * @return the next stage of the definition
             */
            ReturnT withNewPublicIpAddress(String leafDnsLabel);
        }

        /**
         * The stage of the update allowing to associate the resource with a public IP address,
         * but not allowing to create one with a DNS leaf label.
         *
         * @param <ReturnT> the next stage of the definition
         */
        interface WithPublicIpAddressNoDnsLabel<ReturnT> extends
            WithExistingPublicIpAddress<ReturnT>,
            WithNewPublicIpAddressNoDnsLabel<ReturnT> {
        }

        /**
         * The stage definition allowing to associate the resource with a public IP address.
         *
         * @param <ReturnT> the next stage of the update
         */
        interface WithPublicIpAddress<ReturnT> extends
            WithExistingPublicIpAddress<ReturnT>,
            WithNewPublicIpAddress<ReturnT> {
        }
    }

    /**
     * Grouping of definition stages applicable as part of a parent resource update, involving specifying a public IP address.
     */
    interface UpdateDefinitionStages {
        /**
         * The stage of the definition allowing to associate the resource with an existing public IP address.
         *
         * @param <ReturnT> the next stage of the definition
         */
        interface WithExistingPublicIpAddress<ReturnT> {
            /**
             * Associates an existing public IP address with the resource.
             *
             * @param publicIpAddress an existing public IP address
             * @return the next stage of the definition
             */
            ReturnT withExistingPublicIpAddress(PublicIpAddress publicIpAddress);

            /**
             * Associates an existing public IP address with the resource.
             *
             * @param resourceId the resource ID of an existing public IP address
             * @return the next stage of the definition
             */
            ReturnT withExistingPublicIpAddress(String resourceId);
        }

        /**
         * The stage of the definition allowing to associate the resource with a new public IP address.
         *
         * @param <ReturnT> the next stage of the definition
         */
        interface WithNewPublicIpAddressNoDnsLabel<ReturnT> {
            /**
             * Creates a new public IP address to associate with the resource.
             *
             * @param creatable a creatable definition for a new public IP
             * @return the next stage of the definition
             */
            ReturnT withNewPublicIpAddress(Creatable<PublicIpAddress> creatable);

            /**
             * Creates a new public IP address in the same region and group as the resource and associates it with the resource.
             * <p>
             * The internal name and DNS label for the public IP address will be derived from the resource's name.
             *
             * @return the next stage of the definition
             */
            ReturnT withNewPublicIpAddress();
        }

        /**
         * The stage of the definition allowing to associate the resource with a public IP address,
         * but not allowing to create one with a DNS leaf label.
         *
         * @param <ReturnT> the next stage of the definition
         */
        interface WithPublicIpAddressNoDnsLabel<ReturnT> extends
            WithExistingPublicIpAddress<ReturnT>,
            WithNewPublicIpAddressNoDnsLabel<ReturnT> {
        }

        /**
         * The stage of the definition allowing to associate the resource with a new public IP address.
         *
         * @param <ReturnT> the next stage of the definition
         */
        interface WithNewPublicIpAddress<ReturnT> extends WithNewPublicIpAddressNoDnsLabel<ReturnT> {
            /**
             * Creates a new public IP address in the same region and group as the resource, with the specified DNS label
             * and associates it with the resource.
             * <p>
             * The internal name for the public IP address will be derived from the DNS label.
             *
             * @param leafDnsLabel the leaf domain label
             * @return the next stage of the definition
             */
            ReturnT withNewPublicIpAddress(String leafDnsLabel);
        }

        /**
         * The stage of the definition allowing to associate the resource with a public IP address.
         *
         * @param <ReturnT> the next stage of the definition
         */
        interface WithPublicIpAddress<ReturnT> extends
            WithExistingPublicIpAddress<ReturnT>,
            WithNewPublicIpAddress<ReturnT> {
        }
    }
}
