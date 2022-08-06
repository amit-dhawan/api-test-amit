
package com.amit.testapi.response_pojo.get_plan_journey;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "lineString",
    "stopPoints",
    "elevation"
})
@Generated("jsonschema2pojo")
public class Path {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("lineString")
    private String lineString;
    @JsonProperty("stopPoints")
    private List<StopPoint> stopPoints = null;
    @JsonProperty("elevation")
    private List<Object> elevation = null;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("lineString")
    public String getLineString() {
        return lineString;
    }

    @JsonProperty("lineString")
    public void setLineString(String lineString) {
        this.lineString = lineString;
    }

    @JsonProperty("stopPoints")
    public List<StopPoint> getStopPoints() {
        return stopPoints;
    }

    @JsonProperty("stopPoints")
    public void setStopPoints(List<StopPoint> stopPoints) {
        this.stopPoints = stopPoints;
    }

    @JsonProperty("elevation")
    public List<Object> getElevation() {
        return elevation;
    }

    @JsonProperty("elevation")
    public void setElevation(List<Object> elevation) {
        this.elevation = elevation;
    }

}
