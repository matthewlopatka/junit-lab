package edu.worcester.cs.kwurst.cs401;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	
	private Student student1;
	
	@Before
	public void setUp(){
	student1 = new Student("Jane", "Smith");
	}
	
	@Test
	public void testGetCurrentEarnedCr() {
		int credits = 45;
		student1.setCurrentEarnedCr(credits);
		assertEquals(credits, student1.getCurrentEarnedCr());
	}

	@Test
	public void testReadyToGraduate1()
	{
		student1.setCurrentEarnedCr(120);
		student1.setGpa(2.0);
		student1.setMajorComplete(true);
		student1.setLascComplete(true);
		assertTrue(student1.readyToGraduate());
	}
	
	@Test
	public void testGetAnticipatedAdditionalCr(){
		int credits = 45;
		int anticipatedAdditional=120-credits;
		student1.setAnticipatedAdditionalCr(anticipatedAdditional);
		assertEquals(anticipatedAdditional, student1.getAnticipatedAdditionalCr());
	}

	@Test
	public void testReadyToGraduate(){
	}
	
}	
