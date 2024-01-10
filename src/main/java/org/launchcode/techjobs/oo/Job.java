package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
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

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


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
        String newLine = System.lineSeparator();
        String printName = getName();
//        String printEmployer = getEmployer().getValue();
//        String printLocation = getLocation().getValue();
//        String printPositionType = getPositionType().getValue();
//        String printCoreCompetency = getCoreCompetency().getValue();
        if (getName().trim().isEmpty() || getName() == null) {
            printName = "Data not available";
        }
        if (getEmployer().getValue().trim().isEmpty() || getEmployer() == null) {
            getEmployer().setValue("Data not available");
        }
        if (getLocation().getValue().trim().isEmpty() || getLocation() == null) {
            getLocation().setValue("Data not available");
        }
        if (getPositionType().getValue().trim().isEmpty() || getPositionType() == null) {
            getPositionType().setValue("Data not available"); ;
        }
        if (getCoreCompetency().getValue().trim().isEmpty() || getCoreCompetency() == null) {
            getCoreCompetency().setValue("Data not available");
        }

        return
                newLine +
                "ID: " + getId() + newLine +
                "Name: " + printName + newLine +
                "Employer: " + getEmployer() + newLine +
                "Location: " + getLocation() + newLine +
                "Position Type: " + getPositionType() + newLine +
                "Core Competency: " + getCoreCompetency() + newLine
//                "\n" +
//                "ID: " + getId() + "\n" +
//                "Name: " + getName() + "\n" +
//                "Employer: " + getEmployer() + "\n" +
//                "Location: " + getLocation() + "\n" +
//                "Position Type: " + getPositionType() + "\n" +
//                "Core Competency: " + getCoreCompetency() + "\n"
               ;
    }



}
