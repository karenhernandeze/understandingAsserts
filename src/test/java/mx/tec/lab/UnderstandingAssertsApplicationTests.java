package mx.tec.lab;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnderstandingAssertsApplicationTests {

	@Test
	public void whenAssertingEquality_thenEqual() {
		String expected = "Winter is coming";
		String actual = "Not today";
		
		//assertEquals(expected, actual);
		assertEquals(expected, actual, "failure - strings are not equal");
	}
	
	@Test
	public void whenAssertingArraysEquality_thenEqual() {
		char[] expected = {'J', 'u', 'n', 'i', 't'};
		char[] actual = "Junit".toCharArray();
		
		assertArrayEquals(expected, actual);	
	}
	
	@Test
	public void givenNullArrays_whenAssertingArraysEquality_thenEqual() {
		int[] expected = null;
		int[] actual = null;
		
		assertArrayEquals(expected, actual);	
	}
	
	@Test
	public void whenAssertingNull_thenTrue() {
		Object longclaw = null;
		
		assertNull(longclaw, "The longclaw should be null");
	}
	
	//STEP #3 OF THE CHALLENGE
	@Test
	public void whenAssertingNull_thenFalse() {
		Object longclaw = "This should be null";
		
		assertNotNull(longclaw, "The longclaw should be null");
	}
	
	@Test
	public void whenAssertingNotSameObject_thenDifferent() {
		Object oathkeeper = new Object();
		Object widowswall = new Object();
		
		assertNotSame(oathkeeper, widowswall);
	}
	
	//STEP #4 OF THE CHALLENGE
	@Test
	public void whenAssertingSameObject_thenSame() {
		Object oathkeeper = new Object();
		
		assertSame(oathkeeper, oathkeeper);
	}
	
	@Test
	public void whenAssertingConditions_thenVerified() {
		assertTrue(5 > 4, "5 is greater then 4");
	    assertFalse(5 > 6, "5 is not greater then 6");
	}

	@Test
	public void whenCheckingExceptionMessage_thenEqual() {
		AnyClass ac = new AnyClass();
		
	    try {
	    	ac.methodThatShouldThrowException();
	        fail("Exception not thrown");
	    } catch (UnsupportedOperationException e) {
	        assertEquals("Operation Not Supported", e.getMessage());
	    }
	}
	
	@Test
	public void testAssertThatHasItems() {
	    //assertThat(Arrays.asList("Harrenhal", "Dragonstone", "Winterfell")).contains("Winterfell", "Riverrun");	
		//STEP #6 OF THE CHALLENGE
		assertThat(Arrays.asList("Harrenhal", "Dragonstone", "Winterfell")).contains("Winterfell", "Harrenhal");	
	}

}

