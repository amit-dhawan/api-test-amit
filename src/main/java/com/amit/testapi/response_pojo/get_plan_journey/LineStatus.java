
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
    "statusSeverity",
    "statusSeverityDescription",
    "created",
    "validityPeriods"
})
@Generated("jsonschema2pojo")
public class LineStatus {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("id")
    private int id;
    @JsonProperty("statusSeverity")
    private int statusSeverity;
    @JsonProperty("statusSeverityDescription")
    private String statusSeverityDescription;
    @JsonProperty("created")
    private String created;
    @JsonProperty("validityPeriods")
    private List<Object> validityPeriods = null;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("statusSeverity")
    public int getStatusSeverity() {
        return statusSeverity;
    }

    @JsonProperty("statusSeverity")
    public void setStatusSeverity(int statusSeverity) {
        this.statusSeverity = statusSeverity;
    }

    @JsonProperty("statusSeverityDescription")
    public String getStatusSeverityDescription() {
        return statusSeverityDescription;
    }

    @JsonProperty("statusSeverityDescription")
    public void setStatusSeverityDescription(String statusSeverityDescription) {
        this.statusSeverityDescription = statusSeverityDescription;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("validityPeriods")
    public List<Object> getValidityPeriods() {
        return validityPeriods;
    }

    @JsonProperty("validityPeriods")
    public void setValidityPeriods(List<Object> validityPeriods) {
        this.validityPeriods = validityPeriods;
    }

}
