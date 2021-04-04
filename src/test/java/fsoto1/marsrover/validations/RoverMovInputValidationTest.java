package fsoto1.marsrover.validations;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoverMovInputValidationTest {

	InputValidation inputValidation;
	
	@Before
	public void setUp() throws Exception {
		inputValidation = new RoverMovInputValidation();
	}

	@Test
	public void testValidateCorrect() {
		String input = "MLRMLR";
		boolean result = inputValidation.validate(input);
		assertEquals(input, true, result);
	}
	
	@Test
	public void testValidateError() {
		String input = "MLR123";
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}
	
	@Test
	public void testValidateError2() {
		String input = "EDFMRL";
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}
	
	@Test
	public void testValidateError3() {
		String input = "";
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}
	
	@Test
	public void testValidateError4() {
		String input = null;
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}
}
