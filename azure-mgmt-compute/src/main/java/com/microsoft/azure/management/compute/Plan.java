/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;


/**
 * Plan for the resource.
 */
public class Plan {
    /**
     * The plan ID.
     */
    private String name;

    /**
     * The publisher ID.
     */
    private String publisher;

    /**
     * The offer ID.
     */
    private String product;

    /**
     * The promotion code.
     */
    private String promotionCode;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Plan object itself.
     */
    public Plan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the publisher value.
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher value.
     *
     * @param publisher the publisher value to set
     * @return the Plan object itself.
     */
    public Plan withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the product value.
     *
     * @return the product value
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product value.
     *
     * @param product the product value to set
     * @return the Plan object itself.
     */
    public Plan withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the promotionCode value.
     *
     * @return the promotionCode value
     */
    public String promotionCode() {
        return this.promotionCode;
    }

    /**
     * Set the promotionCode value.
     *
     * @param promotionCode the promotionCode value to set
     * @return the Plan object itself.
     */
    public Plan withPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }

}
