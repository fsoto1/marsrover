package fsoto1.marsrover.validations;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoverPosInputValidationTest {

	InputValidation inputValidation;
	
	@Before
	public void setUp() throws Exception {
		inputValidation = new RoverPosInputValidation();
	}

	@Test
	public void testValidateCorrect() {
		String input = "1 3 E";
		boolean result = inputValidation.validate(input);
		assertEquals(input, true, result);
	}
	
	@Test
	public void testValidateCorrect2() {
		String input = "10 13 W";
		boolean result = inputValidation.validate(input);
		assertEquals(input, true, result);
	}
	
	@Test
	public void testValidateError() {
		String input = "1 2 E E";
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}
	
	@Test
	public void testValidateError2() {
		String input = "1 E";
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}
	
	@Test
	public void testValidateError3() {
		String input = "E 1 2";
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}
	
	@Test
	public void testValidateError4() {
		String input = "E 1 2";
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}
	
	@Test
	public void testValidateError5() {
		String input = "1 2 Q";
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}
	
	@Test
	public void testValidateError6() {
		String input = null;
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}

}
