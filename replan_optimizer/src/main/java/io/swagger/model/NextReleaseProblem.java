package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * NextReleaseProblem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-01-14T06:15:31.650Z")

public class NextReleaseProblem   {
  @JsonProperty("nbWeeks")
  private Integer nbWeeks = null;

  @JsonProperty("hoursPerWeek")
  private Double hoursPerWeek = null;

  @JsonProperty("features")
  private List<Feature> features = new ArrayList<Feature>();

  @JsonProperty("resources")
  private List<Resource> resources = new ArrayList<Resource>();

  @JsonProperty("actual_time")
  private Double actual_time = null;

  public NextReleaseProblem nbWeeks(Integer nbWeeks) {
    this.nbWeeks = nbWeeks;
    return this;
  }

   /**
   * Get nbWeeks
   * @return nbWeeks
  **/
  @ApiModelProperty(value = "")
  public Integer getNbWeeks() {
    return nbWeeks;
  }

  public void setNbWeeks(Integer nbWeeks) {
    this.nbWeeks = nbWeeks;
  }

  public NextReleaseProblem hoursPerWeek(Double hoursPerWeek) {
    this.hoursPerWeek = hoursPerWeek;
    return this;
  }

   /**
   * Get hoursPerWeek
   * @return hoursPerWeek
  **/
  @ApiModelProperty(value = "")
  public Double getHoursPerWeek() {
    return hoursPerWeek;
  }

  public void setHoursPerWeek(Double hoursPerWeek) {
    this.hoursPerWeek = hoursPerWeek;
  }

  public NextReleaseProblem features(List<Feature> features) {
    this.features = features;
    return this;
  }

  public NextReleaseProblem addFeaturesItem(Feature featuresItem) {
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public List<Feature> getFeatures() {
    return features;
  }

  public void setFeatures(List<Feature> features) {
    this.features = features;
  }

  public NextReleaseProblem resources(List<Resource> resources) {
    this.resources = resources;
    return this;
  }

  public NextReleaseProblem addResourcesItem(Resource resourcesItem) {
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(value = "")
  public List<Resource> getResources() {
    return resources;
  }

  public void setResources(List<Resource> resources) {
    this.resources = resources;
  }

  public NextReleaseProblem actualTime(Double actualTime) {
    this.actual_time = actualTime;
    return this;
  }

   /**
   * Get actual_time
   * @return actual_time
  **/
  @ApiModelProperty(value = "")
  public Double getActual_time() {
    return actual_time;
  }

  public void setActual_time(Double actual_time) {
    this.actual_time = actual_time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextReleaseProblem nextReleaseProblem = (NextReleaseProblem) o;
    return Objects.equals(this.nbWeeks, nextReleaseProblem.nbWeeks) &&
        Objects.equals(this.hoursPerWeek, nextReleaseProblem.hoursPerWeek) &&
        Objects.equals(this.features, nextReleaseProblem.features) &&
        Objects.equals(this.resources, nextReleaseProblem.resources) &&
        Objects.equals(this.actual_time, nextReleaseProblem.actual_time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nbWeeks, hoursPerWeek, features, resources, actual_time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextReleaseProblem {\n");
    
    sb.append("    nbWeeks: ").append(toIndentedString(nbWeeks)).append("\n");
    sb.append("    hoursPerWeek: ").append(toIndentedString(hoursPerWeek)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    actual_time: ").append(toIndentedString(actual_time)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

