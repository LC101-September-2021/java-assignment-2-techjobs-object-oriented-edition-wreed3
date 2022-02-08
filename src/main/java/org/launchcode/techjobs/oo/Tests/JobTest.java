package org.launchcode.techjobs.oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import java.util.Objects;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob1;
    Job testJob2;
    @Before
    public void createTwoJobObjects(){
        testJob1 = new Job();
        testJob2 = new Job();
    }

    @Test
    public void testSettingJobId(){
        assertEquals(true, Objects.equals(testJob2.getId(), testJob1.getId() + 1));
        System.out.println(testJob2.getId());
        System.out.println(testJob1.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob1 instanceof Job);
        assertEquals("Product tester", testJob1.getName());
        assertTrue(testJob1.getEmployer() instanceof Employer);
        assertEquals("ACME", testJob1.getEmployer().toString());
        assertTrue(testJob1.getLocation() instanceof Location);
        assertEquals("Desert", testJob1.getLocation().toString());
        assertTrue(testJob1.getPositionType() instanceof PositionType);
        assertEquals("Quality control", testJob1.getPositionType().toString());
        assertTrue(testJob1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", testJob1.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality(){
        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(testJob1.getId());
        System.out.println(testJob2.getId());
        assertFalse(testJob1.equals(testJob2));
    }
    @Test
    public void testToStringMethod(){

        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\n" + "Id: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + testJob1.getEmployer() + "\nLocation: " + testJob1.getLocation() + "\nPosition Type: " + testJob1.getPositionType() + "\nCore Competency: " + testJob1.getCoreCompetency() + "\n", testJob1.toString());
        assertFalse("OOPS! This job does not seem to exist.",(testJob1.getName() == "" && testJob1.getEmployer() == null && testJob1.getLocation() == null && testJob1.getPositionType() == null && testJob1.getCoreCompetency() == null));
        assertFalse("\n" + "Id: " + testJob1.getId() + "\nName: " + "Data not available" + "\nEmployer: " + testJob1.getEmployer() + "\nLocation: " + testJob1.getLocation() + "\nPosition Type: " + testJob1.getPositionType() + "\nCore Competency: " + testJob1.getCoreCompetency() + "\n", testJob1.getName()=="");
        assertFalse("\n" + "Id: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + "Data not available" + "\nLocation: " + testJob1.getLocation() + "\nPosition Type: " + testJob1.getPositionType() + "\nCore Competency: " + testJob1.getCoreCompetency() + "\n", testJob1.getEmployer()== null);
        assertFalse("\n" + "Id: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + testJob1.getEmployer() + "\nLocation: " + "Data not available" + "\nPosition Type: " + testJob1.getPositionType() + "\nCore Competency: " + testJob1.getCoreCompetency() + "\n", testJob1.getLocation()== null);
        assertFalse("\n" + "Id: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + testJob1.getEmployer() + "\nLocation: " + testJob1.getLocation() + "\nPosition Type: " + "Data not available" + "\nCore Competency: " + testJob1.getCoreCompetency() + "\n", testJob1.getPositionType()== null);
        assertFalse("\n" + "Id: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + testJob1.getEmployer() + "\nLocation: " + testJob1.getLocation() + "\nPosition Type: " + testJob1.getPositionType() + "\nCore Competency: " + "Data not available" + "\n", testJob1.getCoreCompetency()== null);

    }


}
