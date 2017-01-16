package entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a feature of the Next Release Problem
 * @author Vavou
 *
 */
public class Feature {

	/* --- Atributes --- */
	
	/**
	 * The name of the feature
	 */
	private String name;
	
	/**
	 * The priority of the feature
	 */
	private PriorityLevel priority;
	
	/**
	 * The duration of the feature in hours
	 */
	private Double duration;
	
	/**
	 * The features which needed to be executed before
	 */
	private List<Feature> previousFeatures;
	
	/**
	 * The skills required to do the feature
	 */
	private List<Skill> requiredSkills;


	private Double iniTime = null;

	private String assignedEmployee;

	private Boolean canReplan;


/* --- Getters and setters --- */


	/**
	 * @return when the feature finish
	 */
	public Double getIniTime() {
		return iniTime;
	}

	/**
	 * @return the employee who is assigned to this feature
	 */
	public String getAssignedEmployee() {
		return assignedEmployee;
	}

	/**
	 * @return the name of the feature
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the priority of the feature
	 */
	public PriorityLevel getPriority() {
		return priority;
	}

	/**
	 * @return the duration of the feature
	 */
	public Double getDuration() {
		return duration;
	}

	/**
	 * @return the previous features needed to be finished
	 */
	public List<Feature> getPreviousFeatures() {
		return previousFeatures;
	}
	
	/**
	 * @return the requiredSkills
	 */
	public List<Skill> getRequiredSkills() {
		return requiredSkills;
	}


	public void setCanReplan(Boolean canReplan) {
		this.canReplan = canReplan;
	}

	public Boolean getCanReplan() {

		return canReplan;
	}
	
	/* --- Constructors --- */
	
	/**
	 * Construct a feature
	 * @param name the name of the feature
	 * @param priority the priority of the feature
	 * @param duration the duration of the feature
	 * @param previousFeatures the list of the previous features or null
	 * @param requiredSkills the required skills to do this feature
	 * @param iniTime if feature is already assigned when will finish
	 * @param assignedEmployee the employee who is assigned in this feature
	 */
	public Feature(String name, PriorityLevel priority, Double duration, List<Feature> previousFeatures,
				   List<Skill> requiredSkills, Double iniTime, String assignedEmployee,Boolean canReplan) {
		this.name = name;
		this.priority = priority;
		this.duration = duration;
		this.previousFeatures = previousFeatures == null ? new ArrayList<Feature>() : previousFeatures;
		this.requiredSkills = requiredSkills == null ? new ArrayList<Skill>() : requiredSkills;
		this.iniTime = iniTime;
		this.assignedEmployee = assignedEmployee;
		this.canReplan = canReplan;
	}
	
	/**
	 * Constructor with only one Skill
	 * @param name name of the feature
	 * @param priority priority of the feature
	 * @param duration duration of the feature
	 * @param previousFeatures the list of the previous features or null
	 * @param requiredSkill the required skill to do the feature
	 * @param iniTime if feature is already assigned when will finish
	 * @param assignedEmployee the employee who is assigned in this feature
	 */
	public Feature(String name, PriorityLevel priority, Double duration, List<Feature> previousFeatures,
				   Skill requiredSkill, Double iniTime, String assignedEmployee,Boolean canReplan) {
		this.name = name;
		this.priority = priority;
		this.duration = duration;
		this.previousFeatures = previousFeatures == null ? new ArrayList<Feature>() : previousFeatures;
		this.requiredSkills = new ArrayList<>();
		requiredSkills.add(requiredSkill);
		this.iniTime = iniTime;
		this.assignedEmployee = assignedEmployee;
		this.canReplan = canReplan;
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (getClass() != obj.getClass())
			return false;

		Feature other = (Feature) obj;

		return other.getName().equals(this.getName());
	}

	@Override
	public int hashCode() {
		return getName().length();
	}

	public void setAssignedEmployee(String assignedEmployee) {
		this.assignedEmployee = assignedEmployee;
	}

    public void setIniTime(Double iniTime) {
        this.iniTime = iniTime;
    }

	public double getEndTime() {
		if(this.iniTime != null) return this.iniTime+this.duration;
		return (-1.0);
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public void setPriority(PriorityLevel p) {
		this.priority = p;
	}
}
