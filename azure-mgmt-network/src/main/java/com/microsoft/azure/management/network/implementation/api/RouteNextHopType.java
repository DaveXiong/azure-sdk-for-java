/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.implementation.api;

/**
 * Defines values for RouteNextHopType.
 */
public final class RouteNextHopType {
    /** Static value VirtualNetworkGateway for RouteNextHopType. */
    public static final String VIRTUAL_NETWORK_GATEWAY = "VirtualNetworkGateway";

    /** Static value VnetLocal for RouteNextHopType. */
    public static final String VNET_LOCAL = "VnetLocal";

    /** Static value Internet for RouteNextHopType. */
    public static final String INTERNET = "Internet";

    /** Static value VirtualAppliance for RouteNextHopType. */
    public static final String VIRTUAL_APPLIANCE = "VirtualAppliance";

    /** Static value None for RouteNextHopType. */
    public static final String NONE = "None";

    private RouteNextHopType() {
    }
}