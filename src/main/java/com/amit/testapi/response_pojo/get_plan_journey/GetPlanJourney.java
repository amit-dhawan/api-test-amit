
package com.amit.testapi.response_pojo.get_plan_journey;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "journeys",
    "lines",
    "stopMessages",
    "recommendedMaxAgeMinutes",
    "searchCriteria",
    "journeyVector"
})
@Generated("jsonschema2pojo")
public class GetPlanJourney {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("journeys")
    private List<Journey> journeys = null;
    @JsonProperty("lines")
    private List<Line> lines = null;
    @JsonProperty("stopMessages")
    private List<String> stopMessages = null;
    @JsonProperty("recommendedMaxAgeMinutes")
    private int recommendedMaxAgeMinutes;
    @JsonProperty("searchCriteria")
    private SearchCriteria searchCriteria;
    @JsonProperty("journeyVector")
    private JourneyVector journeyVector;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("journeys")
    public List<Journey> getJourneys() {
        return journeys;
    }

    @JsonProperty("journeys")
    public void setJourneys(List<Journey> journeys) {
        this.journeys = journeys;
    }

    @JsonProperty("lines")
    public List<Line> getLines() {
        return lines;
    }

    @JsonProperty("lines")
    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    @JsonProperty("stopMessages")
    public List<String> getStopMessages() {
        return stopMessages;
    }

    @JsonProperty("stopMessages")
    public void setStopMessages(List<String> stopMessages) {
        this.stopMessages = stopMessages;
    }

    @JsonProperty("recommendedMaxAgeMinutes")
    public int getRecommendedMaxAgeMinutes() {
        return recommendedMaxAgeMinutes;
    }

    @JsonProperty("recommendedMaxAgeMinutes")
    public void setRecommendedMaxAgeMinutes(int recommendedMaxAgeMinutes) {
        this.recommendedMaxAgeMinutes = recommendedMaxAgeMinutes;
    }

    @JsonProperty("searchCriteria")
    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    @JsonProperty("searchCriteria")
    public void setSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    @JsonProperty("journeyVector")
    public JourneyVector getJourneyVector() {
        return journeyVector;
    }

    @JsonProperty("journeyVector")
    public void setJourneyVector(JourneyVector journeyVector) {
        this.journeyVector = journeyVector;
    }

}
