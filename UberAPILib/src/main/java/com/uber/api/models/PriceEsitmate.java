/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/09/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PriceEsitmate 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4726470314074888226L;
    private String currencyCode;
    private String displayName;
    private double distance;
    private int duration;
    private String estimate;
    private int highEstimate;
    private int lowEstimate;
    private String productId;
    private double surgeMultiplier;
    /** GETTER
     * ISO 4217 currency code.
     */
    @JsonGetter("currency_code")
    public String getCurrencyCode ( ) { 
        return this.currencyCode;
    }
    
    /** SETTER
     * ISO 4217 currency code.
     */
    @JsonSetter("currency_code")
    public void setCurrencyCode (String value) { 
        this.currencyCode = value;
        notifyObservers(this.currencyCode);
    }
 
    /** GETTER
     * Display name of product.
     */
    @JsonGetter("display_name")
    public String getDisplayName ( ) { 
        return this.displayName;
    }
    
    /** SETTER
     * Display name of product.
     */
    @JsonSetter("display_name")
    public void setDisplayName (String value) { 
        this.displayName = value;
        notifyObservers(this.displayName);
    }
 
    /** GETTER
     * Expected activity distance (in miles).
     */
    @JsonGetter("distance")
    public double getDistance ( ) { 
        return this.distance;
    }
    
    /** SETTER
     * Expected activity distance (in miles).
     */
    @JsonSetter("distance")
    public void setDistance (double value) { 
        this.distance = value;
        notifyObservers(this.distance);
    }
 
    /** GETTER
     * Expected activity duration (in seconds). Always show duration in minutes.
     */
    @JsonGetter("duration")
    public int getDuration ( ) { 
        return this.duration;
    }
    
    /** SETTER
     * Expected activity duration (in seconds). Always show duration in minutes.
     */
    @JsonSetter("duration")
    public void setDuration (int value) { 
        this.duration = value;
        notifyObservers(this.duration);
    }
 
    /** GETTER
     * Formatted string of estimate in local currency of the start location. Estimate could be a range, a single number (flat rate) or "Metered" for TAXI.
     */
    @JsonGetter("estimate")
    public String getEstimate ( ) { 
        return this.estimate;
    }
    
    /** SETTER
     * Formatted string of estimate in local currency of the start location. Estimate could be a range, a single number (flat rate) or "Metered" for TAXI.
     */
    @JsonSetter("estimate")
    public void setEstimate (String value) { 
        this.estimate = value;
        notifyObservers(this.estimate);
    }
 
    /** GETTER
     * Upper bound of the estimated price.
     */
    @JsonGetter("high_estimate")
    public int getHighEstimate ( ) { 
        return this.highEstimate;
    }
    
    /** SETTER
     * Upper bound of the estimated price.
     */
    @JsonSetter("high_estimate")
    public void setHighEstimate (int value) { 
        this.highEstimate = value;
        notifyObservers(this.highEstimate);
    }
 
    /** GETTER
     * Lower bound of the estimated price.
     */
    @JsonGetter("low_estimate")
    public int getLowEstimate ( ) { 
        return this.lowEstimate;
    }
    
    /** SETTER
     * Lower bound of the estimated price.
     */
    @JsonSetter("low_estimate")
    public void setLowEstimate (int value) { 
        this.lowEstimate = value;
        notifyObservers(this.lowEstimate);
    }
 
    /** GETTER
     * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     */
    @JsonGetter("product_id")
    public String getProductId ( ) { 
        return this.productId;
    }
    
    /** SETTER
     * Unique identifier representing a specific product for a given latitude & longitude. For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     */
    @JsonSetter("product_id")
    public void setProductId (String value) { 
        this.productId = value;
        notifyObservers(this.productId);
    }
 
    /** GETTER
     * Expected surge multiplier. Surge is active if surge_multiplier is greater than 1. Price estimate already factors in the surge multiplier.
     */
    @JsonGetter("surge_multiplier")
    public double getSurgeMultiplier ( ) { 
        return this.surgeMultiplier;
    }
    
    /** SETTER
     * Expected surge multiplier. Surge is active if surge_multiplier is greater than 1. Price estimate already factors in the surge multiplier.
     */
    @JsonSetter("surge_multiplier")
    public void setSurgeMultiplier (double value) { 
        this.surgeMultiplier = value;
        notifyObservers(this.surgeMultiplier);
    }
 
}
 