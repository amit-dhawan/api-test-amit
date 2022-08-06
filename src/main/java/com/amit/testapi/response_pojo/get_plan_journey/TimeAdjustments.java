
package com.amit.testapi.response_pojo.get_plan_journey;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "earliest",
    "earlier",
    "later",
    "latest"
})
@Generated("jsonschema2pojo")
public class TimeAdjustments {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("earliest")
    private Earliest earliest;
    @JsonProperty("earlier")
    private Earlier earlier;
    @JsonProperty("later")
    private Later later;
    @JsonProperty("latest")
    private Latest latest;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("earliest")
    public Earliest getEarliest() {
        return earliest;
    }

    @JsonProperty("earliest")
    public void setEarliest(Earliest earliest) {
        this.earliest = earliest;
    }

    @JsonProperty("earlier")
    public Earlier getEarlier() {
        return earlier;
    }

    @JsonProperty("earlier")
    public void setEarlier(Earlier earlier) {
        this.earlier = earlier;
    }

    @JsonProperty("later")
    public Later getLater() {
        return later;
    }

    @JsonProperty("later")
    public void setLater(Later later) {
        this.later = later;
    }

    @JsonProperty("latest")
    public Latest getLatest() {
        return latest;
    }

    @JsonProperty("latest")
    public void setLatest(Latest latest) {
        this.latest = latest;
    }

}
