package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Feature
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-01-14T06:15:31.650Z")

public class Feature   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("duration")
  private Double duration = null;

  @JsonProperty("priority")
  private Priority priority = null;

  @JsonProperty("required_skills")
  private List<Skill> required_skills = new ArrayList<Skill>();

  @JsonProperty("depends_on")
  private List<Feature> depends_on = new ArrayList<Feature>();

  @JsonProperty("can_replan")
  private Boolean can_replan = null;

  @JsonProperty("ini_time")
  private Double ini_time = null;

  @JsonProperty("assigned_resource")
  private String assigned_resource = null;

  public Feature name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Feature duration(Double duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")
  public Double getDuration() {
    return duration;
  }

  public void setDuration(Double duration) {
    this.duration = duration;
  }

  public Feature priority(Priority priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public Priority getPriority() {
    return priority;
  }

  public void setPriority(Priority priority) {
    this.priority = priority;
  }

  public Feature requiredSkills(List<Skill> requiredSkills) {
    this.required_skills = requiredSkills;
    return this;
  }

  public Feature addRequiredSkillsItem(Skill requiredSkillsItem) {
    this.required_skills.add(requiredSkillsItem);
    return this;
  }

   /**
   * Get required_skills
   * @return required_skills
  **/
  @ApiModelProperty(value = "")
  public List<Skill> getRequired_skills() {
    return required_skills;
  }

  public void setRequired_skills(List<Skill> required_skills) {
    this.required_skills = required_skills;
  }

  public Feature dependsOn(List<Feature> dependsOn) {
    this.depends_on = dependsOn;
    return this;
  }

  public Feature addDependsOnItem(Feature dependsOnItem) {
    this.depends_on.add(dependsOnItem);
    return this;
  }

   /**
   * array of features
   * @return depends_on
  **/
  @ApiModelProperty(value = "array of features")
  public List<Feature> getDepends_on() {
    return depends_on;
  }

  public void setDepends_on(List<Feature> depends_on) {
    this.depends_on = depends_on;
  }

  public Feature canReplan(Boolean canReplan) {
    this.can_replan = canReplan;
    return this;
  }

   /**
   * Get can_replan
   * @return can_replan
  **/
  @ApiModelProperty(value = "")
  public Boolean getCan_replan() {
    return can_replan;
  }

  public void setCan_replan(Boolean can_replan) {
    this.can_replan = can_replan;
  }

  public Feature iniTime(Double iniTime) {
    this.ini_time = iniTime;
    return this;
  }

   /**
   * Get ini_time
   * @return ini_time
  **/
  @ApiModelProperty(value = "")
  public Double getIni_time() {
    return ini_time;
  }

  public void setIni_time(Double ini_time) {
    this.ini_time = ini_time;
  }

  public Feature assignedResource(String assignedResource) {
    this.assigned_resource = assignedResource;
    return this;
  }

   /**
   * Get assigned_resource
   * @return assigned_resource
  **/
  @ApiModelProperty(value = "")
  public String getAssigned_resource() {
    return assigned_resource;
  }

  public void setAssigned_resource(String assigned_resource) {
    this.assigned_resource = assigned_resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feature feature = (Feature) o;
    return Objects.equals(this.name, feature.name) &&
        Objects.equals(this.duration, feature.duration) &&
        Objects.equals(this.priority, feature.priority) &&
        Objects.equals(this.required_skills, feature.required_skills) &&
        Objects.equals(this.depends_on, feature.depends_on) &&
        Objects.equals(this.can_replan, feature.can_replan) &&
        Objects.equals(this.ini_time, feature.ini_time) &&
        Objects.equals(this.assigned_resource, feature.assigned_resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, duration, priority, required_skills, depends_on, can_replan, ini_time, assigned_resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    required_skills: ").append(toIndentedString(required_skills)).append("\n");
    sb.append("    depends_on: ").append(toIndentedString(depends_on)).append("\n");
    sb.append("    can_replan: ").append(toIndentedString(can_replan)).append("\n");
    sb.append("    ini_time: ").append(toIndentedString(ini_time)).append("\n");
    sb.append("    assigned_resource: ").append(toIndentedString(assigned_resource)).append("\n");
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

