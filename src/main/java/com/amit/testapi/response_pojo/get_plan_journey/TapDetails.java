
package com.amit.testapi.response_pojo.get_plan_journey;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "modeType",
    "validationType",
    "hostDeviceType",
    "nationalLocationCode",
    "tapTimestamp"
})
@Generated("jsonschema2pojo")
public class TapDetails {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("modeType")
    private String modeType;
    @JsonProperty("validationType")
    private String validationType;
    @JsonProperty("hostDeviceType")
    private String hostDeviceType;
    @JsonProperty("nationalLocationCode")
    private int nationalLocationCode;
    @JsonProperty("tapTimestamp")
    private String tapTimestamp;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("modeType")
    public String getModeType() {
        return modeType;
    }

    @JsonProperty("modeType")
    public void setModeType(String modeType) {
        this.modeType = modeType;
    }

    @JsonProperty("validationType")
    public String getValidationType() {
        return validationType;
    }

    @JsonProperty("validationType")
    public void setValidationType(String validationType) {
        this.validationType = validationType;
    }

    @JsonProperty("hostDeviceType")
    public String getHostDeviceType() {
        return hostDeviceType;
    }

    @JsonProperty("hostDeviceType")
    public void setHostDeviceType(String hostDeviceType) {
        this.hostDeviceType = hostDeviceType;
    }

    @JsonProperty("nationalLocationCode")
    public int getNationalLocationCode() {
        return nationalLocationCode;
    }

    @JsonProperty("nationalLocationCode")
    public void setNationalLocationCode(int nationalLocationCode) {
        this.nationalLocationCode = nationalLocationCode;
    }

    @JsonProperty("tapTimestamp")
    public String getTapTimestamp() {
        return tapTimestamp;
    }

    @JsonProperty("tapTimestamp")
    public void setTapTimestamp(String tapTimestamp) {
        this.tapTimestamp = tapTimestamp;
    }

}
