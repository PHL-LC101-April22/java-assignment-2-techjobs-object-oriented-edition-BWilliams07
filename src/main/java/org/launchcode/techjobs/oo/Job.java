package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public int getId() {
        return id;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String noData = "Data not available";
        if(Objects.equals(this.name, "") || Objects.equals(this.name, "null")) {
            this.setName(noData);
        }
        if(Objects.equals(this.employer.getValue(), "") || Objects.equals(this.employer.getValue(), "null")) {
            this.employer.setValue(noData);
        }
        if(Objects.equals(this.location.getValue(), "") || Objects.equals(this.location.getValue(), "null")) {
            this.location.setValue(noData);
        }
        if(Objects.equals(this.positionType.getValue(), "") || Objects.equals(this.positionType.getValue(), "null")) {
            this.positionType.setValue(noData);
        }
        if(Objects.equals(this.coreCompetency.getValue(), "") || Objects.equals(this.coreCompetency.getValue(), "null")) {
            this.coreCompetency.setValue(noData);
        }
        return "\n" +
                "ID: " + this.id + '\n' +
                "Name: " + this.name + '\n' +
                "Employer: " + this.employer + '\n' +
                "Location: " + this.location + '\n' +
                "Position Type: " + this.positionType + '\n' +
                "Core Competency: " + this.coreCompetency +
                '\n';
    }


}