
package com.amit.testapi.response_pojo.get_plan_journey;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$type",
    "duration",
    "instruction",
    "obstacles",
    "departureTime",
    "arrivalTime",
    "departurePoint",
    "arrivalPoint",
    "path",
    "routeOptions",
    "mode",
    "disruptions",
    "plannedWorks",
    "isDisrupted",
    "hasFixedLocations",
    "scheduledDepartureTime",
    "scheduledArrivalTime"
})
@Generated("jsonschema2pojo")
public class Leg {

    @JsonProperty("$type")
    private String $type;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("instruction")
    private Instruction instruction;
    @JsonProperty("obstacles")
    private List<Object> obstacles = null;
    @JsonProperty("departureTime")
    private String departureTime;
    @JsonProperty("arrivalTime")
    private String arrivalTime;
    @JsonProperty("departurePoint")
    private DeparturePoint departurePoint;
    @JsonProperty("arrivalPoint")
    private ArrivalPoint arrivalPoint;
    @JsonProperty("path")
    private Path path;
    @JsonProperty("routeOptions")
    private List<RouteOption> routeOptions = null;
    @JsonProperty("mode")
    private Mode mode;
    @JsonProperty("disruptions")
    private List<Disruption> disruptions = null;
    @JsonProperty("plannedWorks")
    private List<Object> plannedWorks = null;
    @JsonProperty("isDisrupted")
    private boolean isDisrupted;
    @JsonProperty("hasFixedLocations")
    private boolean hasFixedLocations;
    @JsonProperty("scheduledDepartureTime")
    private String scheduledDepartureTime;
    @JsonProperty("scheduledArrivalTime")
    private String scheduledArrivalTime;

    @JsonProperty("$type")
    public String get$type() {
        return $type;
    }

    @JsonProperty("$type")
    public void set$type(String $type) {
        this.$type = $type;
    }

    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @JsonProperty("instruction")
    public Instruction getInstruction() {
        return instruction;
    }

    @JsonProperty("instruction")
    public void setInstruction(Instruction instruction) {
        this.instruction = instruction;
    }

    @JsonProperty("obstacles")
    public List<Object> getObstacles() {
        return obstacles;
    }

    @JsonProperty("obstacles")
    public void setObstacles(List<Object> obstacles) {
        this.obstacles = obstacles;
    }

    @JsonProperty("departureTime")
    public String getDepartureTime() {
        return departureTime;
    }

    @JsonProperty("departureTime")
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @JsonProperty("arrivalTime")
    public String getArrivalTime() {
        return arrivalTime;
    }

    @JsonProperty("arrivalTime")
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @JsonProperty("departurePoint")
    public DeparturePoint getDeparturePoint() {
        return departurePoint;
    }

    @JsonProperty("departurePoint")
    public void setDeparturePoint(DeparturePoint departurePoint) {
        this.departurePoint = departurePoint;
    }

    @JsonProperty("arrivalPoint")
    public ArrivalPoint getArrivalPoint() {
        return arrivalPoint;
    }

    @JsonProperty("arrivalPoint")
    public void setArrivalPoint(ArrivalPoint arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    @JsonProperty("path")
    public Path getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(Path path) {
        this.path = path;
    }

    @JsonProperty("routeOptions")
    public List<RouteOption> getRouteOptions() {
        return routeOptions;
    }

    @JsonProperty("routeOptions")
    public void setRouteOptions(List<RouteOption> routeOptions) {
        this.routeOptions = routeOptions;
    }

    @JsonProperty("mode")
    public Mode getMode() {
        return mode;
    }

    @JsonProperty("mode")
    public void setMode(Mode mode) {
        this.mode = mode;
    }

    @JsonProperty("disruptions")
    public List<Disruption> getDisruptions() {
        return disruptions;
    }

    @JsonProperty("disruptions")
    public void setDisruptions(List<Disruption> disruptions) {
        this.disruptions = disruptions;
    }

    @JsonProperty("plannedWorks")
    public List<Object> getPlannedWorks() {
        return plannedWorks;
    }

    @JsonProperty("plannedWorks")
    public void setPlannedWorks(List<Object> plannedWorks) {
        this.plannedWorks = plannedWorks;
    }

    @JsonProperty("isDisrupted")
    public boolean isIsDisrupted() {
        return isDisrupted;
    }

    @JsonProperty("isDisrupted")
    public void setIsDisrupted(boolean isDisrupted) {
        this.isDisrupted = isDisrupted;
    }

    @JsonProperty("hasFixedLocations")
    public boolean isHasFixedLocations() {
        return hasFixedLocations;
    }

    @JsonProperty("hasFixedLocations")
    public void setHasFixedLocations(boolean hasFixedLocations) {
        this.hasFixedLocations = hasFixedLocations;
    }

    @JsonProperty("scheduledDepartureTime")
    public String getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }

    @JsonProperty("scheduledDepartureTime")
    public void setScheduledDepartureTime(String scheduledDepartureTime) {
        this.scheduledDepartureTime = scheduledDepartureTime;
    }

    @JsonProperty("scheduledArrivalTime")
    public String getScheduledArrivalTime() {
        return scheduledArrivalTime;
    }

    @JsonProperty("scheduledArrivalTime")
    public void setScheduledArrivalTime(String scheduledArrivalTime) {
        this.scheduledArrivalTime = scheduledArrivalTime;
    }

}
