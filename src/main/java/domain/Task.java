package domain;

import enums.EmergencyDegree;
import enums.TaskStatus;
import enums.TaskType;

public class Task {

    private String name;

    private String description;

    private TaskType type;

    private EmergencyDegree emergencyDegree;

    private GreenSpace greenSpace;

    private TaskStatus status;

    public Task(String name, String description, TaskType type, EmergencyDegree emergencyDegree, GreenSpace greenSpace, TaskStatus status) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.emergencyDegree = emergencyDegree;
        this.greenSpace = greenSpace;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public TaskType getType() {
        return type;
    }

    public EmergencyDegree getEmergencyDegree() {
        return emergencyDegree;
    }

    public GreenSpace getGreenSpace() {
        return greenSpace;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public void setEmergencyDegree(EmergencyDegree emergencyDegree) {
        this.emergencyDegree = emergencyDegree;
    }

    public void setGreenSpace(GreenSpace greenSpace) {
        this.greenSpace = greenSpace;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

}
