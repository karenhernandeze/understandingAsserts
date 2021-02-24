package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OtherClassTest {

	//STEP #7 OF THE CHALLENGE
	@Test
	public void testMultiply() {
		OtherClass oc = new OtherClass();
		
	    try {
	    	oc.multiply(10,10);
	    } catch (IllegalArgumentException e) {
	    	fail("X should be less than 1000");
	    }
	}

	//STEP #8 OF THE CHALLENGE
	@Test
	public void testMultiply_ExceptionIsThrown() {
		OtherClass oc = new OtherClass();
		
	    try {
	    	oc.multiply(1000,10);
	    } catch (IllegalArgumentException e) {
	    	assertEquals("X should be less than 1000", e.getMessage());
	    }
	}


}