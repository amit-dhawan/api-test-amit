
package com.amit.testapi.response_pojo.get_plan_journey;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "naptanId",
    "platformName",
    "icsCode",
    "individualStopId",
    "commonName",
    "placeType",
    "additionalProperties",
    "lat",
    "lon"
})
@Generated("jsonschema2pojo")
public class ArrivalPoint {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("naptanId")
    private String naptanId;
    @JsonProperty("platformName")
    private String platformName;
    @JsonProperty("icsCode")
    private String icsCode;
    @JsonProperty("individualStopId")
    private String individualStopId;
    @JsonProperty("commonName")
    private String commonName;
    @JsonProperty("placeType")
    private String placeType;
    @JsonProperty("additionalProperties")
    private List<Object> additionalProperties = null;
    @JsonProperty("lat")
    private double lat;
    @JsonProperty("lon")
    private double lon;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("naptanId")
    public String getNaptanId() {
        return naptanId;
    }

    @JsonProperty("naptanId")
    public void setNaptanId(String naptanId) {
        this.naptanId = naptanId;
    }

    @JsonProperty("platformName")
    public String getPlatformName() {
        return platformName;
    }

    @JsonProperty("platformName")
    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    @JsonProperty("icsCode")
    public String getIcsCode() {
        return icsCode;
    }

    @JsonProperty("icsCode")
    public void setIcsCode(String icsCode) {
        this.icsCode = icsCode;
    }

    @JsonProperty("individualStopId")
    public String getIndividualStopId() {
        return individualStopId;
    }

    @JsonProperty("individualStopId")
    public void setIndividualStopId(String individualStopId) {
        this.individualStopId = individualStopId;
    }

    @JsonProperty("commonName")
    public String getCommonName() {
        return commonName;
    }

    @JsonProperty("commonName")
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    @JsonProperty("placeType")
    public String getPlaceType() {
        return placeType;
    }

    @JsonProperty("placeType")
    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    @JsonProperty("additionalProperties")
    public List<Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonProperty("additionalProperties")
    public void setAdditionalProperties(List<Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("lat")
    public double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(double lat) {
        this.lat = lat;
    }

    @JsonProperty("lon")
    public double getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(double lon) {
        this.lon = lon;
    }

}
