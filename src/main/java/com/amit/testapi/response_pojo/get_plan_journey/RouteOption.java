
package com.amit.testapi.response_pojo.get_plan_journey;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "name",
    "directions",
    "lineIdentifier",
    "direction"
})
@Generated("jsonschema2pojo")
public class RouteOption {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("directions")
    private List<String> directions = null;
    @JsonProperty("lineIdentifier")
    private LineIdentifier lineIdentifier;
    @JsonProperty("direction")
    private String direction;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("directions")
    public List<String> getDirections() {
        return directions;
    }

    @JsonProperty("directions")
    public void setDirections(List<String> directions) {
        this.directions = directions;
    }

    @JsonProperty("lineIdentifier")
    public LineIdentifier getLineIdentifier() {
        return lineIdentifier;
    }

    @JsonProperty("lineIdentifier")
    public void setLineIdentifier(LineIdentifier lineIdentifier) {
        this.lineIdentifier = lineIdentifier;
    }

    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

}
