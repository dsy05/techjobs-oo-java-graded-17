package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField{

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public CoreCompetency() {
//        id = nextId;
//        nextId++;
//    }

    public CoreCompetency(String value) {
        super(value);
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.

//    public int getId() {
//        return id;
//    }
//
//    public static int getNextId() {
//        return nextId;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }


    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }



}
