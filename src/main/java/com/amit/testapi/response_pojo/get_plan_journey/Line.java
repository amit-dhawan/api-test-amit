
package com.amit.testapi.response_pojo.get_plan_journey;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "id",
    "name",
    "modeName",
    "disruptions",
    "created",
    "modified",
    "lineStatuses",
    "routeSections",
    "serviceTypes",
    "crowding"
})
@Generated("jsonschema2pojo")
public class Line {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("modeName")
    private String modeName;
    @JsonProperty("disruptions")
    private List<Object> disruptions = null;
    @JsonProperty("created")
    private String created;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("lineStatuses")
    private List<LineStatus> lineStatuses = null;
    @JsonProperty("routeSections")
    private List<Object> routeSections = null;
    @JsonProperty("serviceTypes")
    private List<ServiceType> serviceTypes = null;
    @JsonProperty("crowding")
    private Crowding__1 crowding;

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

    @JsonProperty("modeName")
    public String getModeName() {
        return modeName;
    }

    @JsonProperty("modeName")
    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    @JsonProperty("disruptions")
    public List<Object> getDisruptions() {
        return disruptions;
    }

    @JsonProperty("disruptions")
    public void setDisruptions(List<Object> disruptions) {
        this.disruptions = disruptions;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("modified")
    public String getModified() {
        return modified;
    }

    @JsonProperty("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    @JsonProperty("lineStatuses")
    public List<LineStatus> getLineStatuses() {
        return lineStatuses;
    }

    @JsonProperty("lineStatuses")
    public void setLineStatuses(List<LineStatus> lineStatuses) {
        this.lineStatuses = lineStatuses;
    }

    @JsonProperty("routeSections")
    public List<Object> getRouteSections() {
        return routeSections;
    }

    @JsonProperty("routeSections")
    public void setRouteSections(List<Object> routeSections) {
        this.routeSections = routeSections;
    }

    @JsonProperty("serviceTypes")
    public List<ServiceType> getServiceTypes() {
        return serviceTypes;
    }

    @JsonProperty("serviceTypes")
    public void setServiceTypes(List<ServiceType> serviceTypes) {
        this.serviceTypes = serviceTypes;
    }

    @JsonProperty("crowding")
    public Crowding__1 getCrowding() {
        return crowding;
    }

    @JsonProperty("crowding")
    public void setCrowding(Crowding__1 crowding) {
        this.crowding = crowding;
    }

}
