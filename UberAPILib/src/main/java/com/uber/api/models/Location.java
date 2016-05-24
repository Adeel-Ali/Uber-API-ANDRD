/*
 * UberAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 05/24/2016
 */
package com.uber.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Location 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5582629916718657000L;
    private String address;
    private double latitude;
    private double longitude;
    /** GETTER
     * The address in user readable form
     */
    @JsonGetter("address")
    public String getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * The address in user readable form
     */
    @JsonSetter("address")
    public void setAddress (String value) { 
        this.address = value;
        notifyObservers(this.address);
    }
 
    /** GETTER
     * Latitude component of location.
     */
    @JsonGetter("latitude")
    public double getLatitude ( ) { 
        return this.latitude;
    }
    
    /** SETTER
     * Latitude component of location.
     */
    @JsonSetter("latitude")
    public void setLatitude (double value) { 
        this.latitude = value;
        notifyObservers(this.latitude);
    }
 
    /** GETTER
     * Longitude component of location.
     */
    @JsonGetter("longitude")
    public double getLongitude ( ) { 
        return this.longitude;
    }
    
    /** SETTER
     * Longitude component of location.
     */
    @JsonSetter("longitude")
    public void setLongitude (double value) { 
        this.longitude = value;
        notifyObservers(this.longitude);
    }
 
}
 