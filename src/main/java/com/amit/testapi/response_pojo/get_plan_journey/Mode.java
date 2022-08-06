
package com.amit.testapi.response_pojo.get_plan_journey;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "id",
    "name",
    "type",
    "routeType",
    "status",
    "motType",
    "network"
})
@Generated("jsonschema2pojo")
public class Mode {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("routeType")
    private String routeType;
    @JsonProperty("status")
    private String status;
    @JsonProperty("motType")
    private String motType;
    @JsonProperty("network")
    private String network;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("routeType")
    public String getRouteType() {
        return routeType;
    }

    @JsonProperty("routeType")
    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("motType")
    public String getMotType() {
        return motType;
    }

    @JsonProperty("motType")
    public void setMotType(String motType) {
        this.motType = motType;
    }

    @JsonProperty("network")
    public String getNetwork() {
        return network;
    }

    @JsonProperty("network")
    public void setNetwork(String network) {
        this.network = network;
    }

}
