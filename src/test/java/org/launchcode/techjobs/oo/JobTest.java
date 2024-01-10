package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertTrue;


public class JobTest {
    //TODO: Create your unit tests here

    Job job1 = new Job();
    Job job2 = new Job();
    @Test
    public void testSettingJobId() {
        String msg = "When creating two Job objects using empty constructor, both should have unique ID's";
        assertNotEquals(msg, true, job1.getId() == job2.getId());
    }

    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    @Test
    public void testJobConstructorSetsAllFields() {
        String msg = "When creating Job object using full constructor sets six " +
                "fields: id, name, employer, location, positionType, and coreCompetency" +
                "each field data type respectively: int, String, Employer, LLocation, PositionType, and CoreCompetency.";
        assertTrue(msg, testJob.getName() instanceof String);
        assertTrue(msg, testJob.getEmployer() instanceof Employer);
        assertTrue(msg, testJob.getLocation() instanceof Location);
        assertTrue(msg, testJob.getPositionType() instanceof PositionType);
        assertTrue(msg, testJob.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(msg, "Product tester", testJob.getName());
        assertEquals(msg, "ACME", testJob.getEmployer().getValue());
        assertEquals(msg, "Desert", testJob.getLocation().getValue());
        assertEquals(msg, "Quality control", testJob.getPositionType().getValue());
        assertEquals(msg, "Persistence", testJob.getCoreCompetency().getValue());
    }

    Job equalityJob1 = new Job("Lab Tech", new Employer("Lab Corp"), new Location("Saint Louis"), new PositionType("Quality Control"), new CoreCompetency("Punctual"));
    Job equalityJob2 = new Job("Lab Tech", new Employer("Lab Corp"), new Location("Saint Louis"), new PositionType("Quality Control"), new CoreCompetency("Punctual"));

    @Test
    public void testJobsForEquality() {
        String msg = "Test two Job objects using full constructor that have identical fields except for ID return false for equals";
        assertNotEquals(msg,true, equalityJob1.equals(equalityJob2));

    }

    Job testJobToString = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String msg = "ToString begins and ends with newline";
        String firstChar = testJobToString.toString().substring(0,2);
        String lastChar = testJobToString.toString().substring(testJobToString.toString().length()-2);
        assertEquals(msg, firstChar, lineSeparator());
        assertEquals(msg, lastChar, lineSeparator());

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String msg = "ToString contains correct labels and data";
        String newLine = System.lineSeparator();
        assertEquals(msg, newLine+
                        "ID: " + testJobToString.getId() + newLine +
                        "Name: " + testJobToString.getName() + newLine +
                        "Employer: " + testJobToString.getEmployer() + newLine +
                        "Location: " + testJobToString.getLocation() + newLine +
                        "Position Type: " + testJobToString.getPositionType() + newLine +
                        "Core Competency: "+ testJobToString.getCoreCompetency() + newLine, testJobToString.toString());
    }

    Job testJobToStringFieldMissing = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));

    @Test
    public void testToStringHandlesEmptyField() {
        String msg = "If field is empty toString contains message 'Data not available'";
        String newLine = System.lineSeparator();
        assertEquals(msg, newLine+
                "ID: " + testJobToStringFieldMissing.getId() + newLine +
                "Name: " + testJobToStringFieldMissing.getName() + newLine +
                "Employer: Data not available" + newLine +
                "Location: " + testJobToStringFieldMissing.getLocation() + newLine +
                "Position Type: Data not available" + newLine +
                "Core Competency: "+ testJobToStringFieldMissing.getCoreCompetency() + newLine, testJobToStringFieldMissing.toString());

    }


}
