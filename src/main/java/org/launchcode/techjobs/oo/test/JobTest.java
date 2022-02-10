package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
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
        testJob1 = new Job();
        testJob2 = new Job();
        assertEquals(testJob2.getId(), testJob1.getId() + 1);
//        System.out.println(testJob2.getId());
//        System.out.println(testJob1.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob1 instanceof Job);
        assertTrue(testJob1.getEmployer() instanceof Employer);
        assertTrue(testJob1.getLocation() instanceof Location);
        assertTrue(testJob1.getPositionType() instanceof PositionType);
        assertTrue(testJob1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", testJob1.getName());
        assertEquals("ACME", testJob1.getEmployer().toString());
        assertEquals("Desert", testJob1.getLocation().toString());
        assertEquals("Quality control", testJob1.getPositionType().toString());
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
    public void testToStringStartsAndEndsWithNewLine(){
        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char firstChar = testJob1.toString().charAt(0);
        char lastChar = testJob1.toString().charAt(testJob1.toString().length()-1);
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');
//        assertEquals('\n','\n');
        testJob1.toString();
    }


    @Test
    public void testToStringMethod(){

        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals('\n' + "ID: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + testJob1.getEmployer() + "\nLocation: " + testJob1.getLocation() + "\nPosition Type: " + testJob1.getPositionType() + "\nCore Competency: " + testJob1.getCoreCompetency() + '\n', testJob1.toString());

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob1.toString();
        if(testJob1.getName().equals("") && testJob1.getEmployer().toString().equals("") && testJob1.getLocation().toString().equals("") && testJob1.getPositionType().toString().equals("") && testJob1.getCoreCompetency().toString().equals("")){
            assertEquals("OOPS! This job does not seem to exist.", testJob1.toString());
        }
        if(testJob1.getName().equals("")){
            testJob1.setName("Data not available");
            assertEquals('\n' + "ID: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + testJob1.getEmployer() + "\nLocation: " + testJob1.getLocation() + "\nPosition Type: " + testJob1.getPositionType() + "\nCore Competency: " + testJob1.getCoreCompetency().toString() + '\n', testJob1.toString());
        }
        if(testJob1.getEmployer().toString().equals("")){
            testJob1.setEmployer(new Employer("Data not available"));
            assertEquals('\n' + "ID: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + testJob1.getEmployer() + "\nLocation: " + testJob1.getLocation() + "\nPosition Type: " + testJob1.getPositionType() + "\nCore Competency: " + testJob1.getCoreCompetency() + '\n', testJob1.toString());
        }
        if(testJob1.getLocation().toString().equals("")){
            testJob1.setLocation(new Location("Data not available"));
            assertEquals('\n' + "ID: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + testJob1.getEmployer() + "\nLocation: " + testJob1.getLocation() + "\nPosition Type: " + testJob1.getPositionType() + "\nCore Competency: " + testJob1.getCoreCompetency() + '\n', testJob1.toString());
        }
        if(testJob1.getPositionType().toString().equals("")){
            testJob1.setPositionType(new PositionType("Data not available"));
            assertEquals('\n' + "ID: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + testJob1.getEmployer() + "\nLocation: " + testJob1.getLocation() + "\nPosition Type: " + testJob1.getPositionType() + "\nCore Competency: " + testJob1.getCoreCompetency() + '\n', testJob1.toString());
        }
        if(testJob1.getCoreCompetency().toString().equals("")){
            testJob1.setCoreCompetency(new CoreCompetency("Data not available"));
            assertEquals('\n' + "ID: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + testJob1.getEmployer() + "\nLocation: " + testJob1.getLocation() + "\nPosition Type: " + testJob1.getPositionType() + "\nCore Competency: " + testJob1.getCoreCompetency() + '\n', testJob1.toString());
        }else{
            assertEquals('\n' + "ID: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + testJob1.getEmployer() + "\nLocation: " + testJob1.getLocation() + "\nPosition Type: " + testJob1.getPositionType() + "\nCore Competency: " + testJob1.getCoreCompetency() + '\n', testJob1.toString());
        }
        System.out.println(testJob1.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String jobString = Job.getJobString(testJob1);
        assertEquals(jobString, testJob1.toString());
//       assertEquals('\n' + "ID: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + testJob1.getEmployer() + "\nLocation: " + testJob1.getLocation() + "\nPosition Type: " + testJob1.getPositionType() + "\nCore Competency: " + testJob1.getCoreCompetency() + '\n', testJob1.toString());
    }
}
