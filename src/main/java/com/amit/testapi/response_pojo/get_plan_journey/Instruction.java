
package com.amit.testapi.response_pojo.get_plan_journey;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "summary",
    "detailed",
    "steps"
})
@Generated("jsonschema2pojo")
public class Instruction {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("detailed")
    private String detailed;
    @JsonProperty("steps")
    private List<Object> steps = null;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("detailed")
    public String getDetailed() {
        return detailed;
    }

    @JsonProperty("detailed")
    public void setDetailed(String detailed) {
        this.detailed = detailed;
    }

    @JsonProperty("steps")
    public List<Object> getSteps() {
        return steps;
    }

    @JsonProperty("steps")
    public void setSteps(List<Object> steps) {
        this.steps = steps;
    }

}
