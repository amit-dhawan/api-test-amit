
package com.amit.testapi.response_pojo.get_plan_journey;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "dateTime",
    "dateTimeType",
    "timeAdjustments"
})
@Generated("jsonschema2pojo")
public class SearchCriteria {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("dateTime")
    private String dateTime;
    @JsonProperty("dateTimeType")
    private String dateTimeType;
    @JsonProperty("timeAdjustments")
    private TimeAdjustments timeAdjustments;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("dateTime")
    public String getDateTime() {
        return dateTime;
    }

    @JsonProperty("dateTime")
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @JsonProperty("dateTimeType")
    public String getDateTimeType() {
        return dateTimeType;
    }

    @JsonProperty("dateTimeType")
    public void setDateTimeType(String dateTimeType) {
        this.dateTimeType = dateTimeType;
    }

    @JsonProperty("timeAdjustments")
    public TimeAdjustments getTimeAdjustments() {
        return timeAdjustments;
    }

    @JsonProperty("timeAdjustments")
    public void setTimeAdjustments(TimeAdjustments timeAdjustments) {
        this.timeAdjustments = timeAdjustments;
    }

}
