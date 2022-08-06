
package com.amit.testapi.response_pojo.get_plan_journey;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "totalCost",
    "fares",
    "caveats"
})
@Generated("jsonschema2pojo")
public class Fare {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("totalCost")
    private int totalCost;
    @JsonProperty("fares")
    private List<Fare__1> fares = null;
    @JsonProperty("caveats")
    private List<Caveat> caveats = null;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("totalCost")
    public int getTotalCost() {
        return totalCost;
    }

    @JsonProperty("totalCost")
    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    @JsonProperty("fares")
    public List<Fare__1> getFares() {
        return fares;
    }

    @JsonProperty("fares")
    public void setFares(List<Fare__1> fares) {
        this.fares = fares;
    }

    @JsonProperty("caveats")
    public List<Caveat> getCaveats() {
        return caveats;
    }

    @JsonProperty("caveats")
    public void setCaveats(List<Caveat> caveats) {
        this.caveats = caveats;
    }

}
