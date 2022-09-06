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

    //creation of primary key
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType,
               CoreCompetency coreCompetency) {
        this(); //uses the default constructor, which I don't want to do. but need to implement the other constructor
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    //what if I stored the key value pairs in a HashMap? Then, run into issue of different value types(int)
    @Override
    public String toString() {


        if (Objects.equals(name, "")) {
            setName("Data not available");
        }
        if (Job.this.employer.getValue().equals("")) {
            this.employer.setValue("Data not available");
        }
        if(Job.this.location.getValue().equals("")) {
            this.location.setValue("Data not available");
        }
        if(Job.this.positionType.getValue().equals("")) {
            this.positionType.setValue("Data not available");
        }
        if(Job.this.coreCompetency.getValue().equals("")) {
            this.coreCompetency.setValue("Data not available");
        }


        return  "\n" +
                "ID: " + id +
                "\nName: " + name +
                "\nEmployer: " + employer +
                "\nLocation: " + location +
                "\nPosition Type: " + positionType +
                "\nCore Competency: " + coreCompetency +
                "\n";
    }







//
//        if (name == "" && Job.this.employer.getValue().equals("") &&
//    Job.this.location.getValue().equals("") && Job.this.positionType.getValue().equals("")
//        && Job.this.coreCompetency.getValue().equals("")) {
//        return "OOPS! This job does not seem to exist.";
//    }
//


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
