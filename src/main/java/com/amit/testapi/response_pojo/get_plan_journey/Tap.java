
package com.amit.testapi.response_pojo.get_plan_journey;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "atcoCode",
    "tapDetails"
})
@Generated("jsonschema2pojo")
public class Tap {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("atcoCode")
    private String atcoCode;
    @JsonProperty("tapDetails")
    private TapDetails tapDetails;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("atcoCode")
    public String getAtcoCode() {
        return atcoCode;
    }

    @JsonProperty("atcoCode")
    public void setAtcoCode(String atcoCode) {
        this.atcoCode = atcoCode;
    }

    @JsonProperty("tapDetails")
    public TapDetails getTapDetails() {
        return tapDetails;
    }

    @JsonProperty("tapDetails")
    public void setTapDetails(TapDetails tapDetails) {
        this.tapDetails = tapDetails;
    }

}
