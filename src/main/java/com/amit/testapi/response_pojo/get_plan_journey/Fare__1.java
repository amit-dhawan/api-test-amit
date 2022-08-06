
package com.amit.testapi.response_pojo.get_plan_journey;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "lowZone",
    "highZone",
    "cost",
    "chargeProfileName",
    "isHopperFare",
    "chargeLevel",
    "peak",
    "offPeak",
    "taps"
})
@Generated("jsonschema2pojo")
public class Fare__1 {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("lowZone")
    private int lowZone;
    @JsonProperty("highZone")
    private int highZone;
    @JsonProperty("cost")
    private int cost;
    @JsonProperty("chargeProfileName")
    private String chargeProfileName;
    @JsonProperty("isHopperFare")
    private boolean isHopperFare;
    @JsonProperty("chargeLevel")
    private String chargeLevel;
    @JsonProperty("peak")
    private int peak;
    @JsonProperty("offPeak")
    private int offPeak;
    @JsonProperty("taps")
    private List<Tap> taps = null;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("lowZone")
    public int getLowZone() {
        return lowZone;
    }

    @JsonProperty("lowZone")
    public void setLowZone(int lowZone) {
        this.lowZone = lowZone;
    }

    @JsonProperty("highZone")
    public int getHighZone() {
        return highZone;
    }

    @JsonProperty("highZone")
    public void setHighZone(int highZone) {
        this.highZone = highZone;
    }

    @JsonProperty("cost")
    public int getCost() {
        return cost;
    }

    @JsonProperty("cost")
    public void setCost(int cost) {
        this.cost = cost;
    }

    @JsonProperty("chargeProfileName")
    public String getChargeProfileName() {
        return chargeProfileName;
    }

    @JsonProperty("chargeProfileName")
    public void setChargeProfileName(String chargeProfileName) {
        this.chargeProfileName = chargeProfileName;
    }

    @JsonProperty("isHopperFare")
    public boolean isIsHopperFare() {
        return isHopperFare;
    }

    @JsonProperty("isHopperFare")
    public void setIsHopperFare(boolean isHopperFare) {
        this.isHopperFare = isHopperFare;
    }

    @JsonProperty("chargeLevel")
    public String getChargeLevel() {
        return chargeLevel;
    }

    @JsonProperty("chargeLevel")
    public void setChargeLevel(String chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    @JsonProperty("peak")
    public int getPeak() {
        return peak;
    }

    @JsonProperty("peak")
    public void setPeak(int peak) {
        this.peak = peak;
    }

    @JsonProperty("offPeak")
    public int getOffPeak() {
        return offPeak;
    }

    @JsonProperty("offPeak")
    public void setOffPeak(int offPeak) {
        this.offPeak = offPeak;
    }

    @JsonProperty("taps")
    public List<Tap> getTaps() {
        return taps;
    }

    @JsonProperty("taps")
    public void setTaps(List<Tap> taps) {
        this.taps = taps;
    }

}
