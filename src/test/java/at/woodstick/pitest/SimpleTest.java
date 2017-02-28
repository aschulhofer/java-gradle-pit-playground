package at.woodstick.pitest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimpleTest {

	private Simple simpleDut;
	
	@Before
	public void setUp() {
		simpleDut = new Simple();
	}
	
	@After
	public void tearDown() {
		simpleDut = null;
	}
	
	@Test
	public void shouldReturnConstOne() {
		int expectedValue = Simple.CONST_ONE;
		int actualValue = simpleDut.getOne();
		
		assertEquals(expectedValue, actualValue);
	}

	@Test
	public void shouldIncValue() {
		int value = 2;
		int expectedValue = 3;
		
		int actualValue = simpleDut.incrementGreaterOne(value);
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void shouldNotIncValue() {
		int value = 1;
		int expectedValue = 1;
		
		int actualValue = simpleDut.incrementGreaterOne(value);
		
		assertEquals(expectedValue, actualValue);
	}
}
