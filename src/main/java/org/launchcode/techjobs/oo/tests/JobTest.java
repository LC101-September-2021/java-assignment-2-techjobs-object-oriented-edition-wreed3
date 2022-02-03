package org.launchcode.techjobs.oo.tests;

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
        assertTrue(new Job() instanceof Job);
        assertTrue(new Employer() instanceof Employer);
        assertTrue(new Location() instanceof Location);
        assertTrue(new PositionType() instanceof PositionType);
        assertTrue(new CoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality(){
        testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(testJob1.getId());
        System.out.println(testJob2.getId());
        assertFalse(testJob1.equals(testJob2));
    }
}
