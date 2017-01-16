package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PlannedFeature;
import java.util.ArrayList;
import java.util.List;

/**
 * PlanningSolution
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-01-14T06:15:31.650Z")

public class PlanningSolution   {
  @JsonProperty("jobs")
  private List<PlannedFeature> jobs = new ArrayList<PlannedFeature>();

  public PlanningSolution jobs(List<PlannedFeature> jobs) {
    this.jobs = jobs;
    return this;
  }

  public PlanningSolution addJobsItem(PlannedFeature jobsItem) {
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/
  @ApiModelProperty(value = "")
  public List<PlannedFeature> getJobs() {
    return jobs;
  }

  public void setJobs(List<PlannedFeature> jobs) {
    this.jobs = jobs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanningSolution planningSolution = (PlanningSolution) o;
    return Objects.equals(this.jobs, planningSolution.jobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanningSolution {\n");
    
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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

