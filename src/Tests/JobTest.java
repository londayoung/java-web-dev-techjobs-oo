package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JobTest {
    Job test_job1;
    Job test_job2;
    @Before
    public void createJobObject(){
        test_job1 = new Job();
        test_job2 = new Job();
    }

// Test # 1
    @Test
    public void testSettingJobID() {
        assertFalse(test_job1.equals(test_job2));
        assertEquals(1, test_job1.getId(), .001);
        assertEquals(2, test_job2.getId(), .001);
    }

//     Test #2
    @Test
    public void testJobConstructorSetsAllFields() {
        Job fullJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", fullJob.getName());
        assertEquals("ACME", fullJob.getEmployer().toString());
        assertEquals("Desert",  fullJob.getLocation().toString());
        assertEquals("Quality Control", fullJob.getPositionType().toString());
        assertEquals("Persistence",  fullJob.getCoreCompetency().toString());

    }

    @Test
    public void testJobForEquality() {
        Job fullJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        Job fullJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertFalse(fullJob1.equals(fullJob2));


    }




}

