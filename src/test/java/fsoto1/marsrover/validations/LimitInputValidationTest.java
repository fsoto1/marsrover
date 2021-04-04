package fsoto1.marsrover.validations;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LimitInputValidationTest {

	InputValidation inputValidation;
	
	@Before
	public void setUp() throws Exception {
		inputValidation = new LimitInputValidation();
	}
	
	@Test
	public void testValidateCorrect() {
		String input = "5 5";
		boolean result = inputValidation.validate(input);
		assertEquals(input, true, result);
	}
	
	@Test
	public void testValidateFail() {
		String input = "5 5 5";
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}
	
	@Test
	public void testValidateFail2() {
		String input = "5";
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}
	
	@Test
	public void testValidateFail3() {
		String input = "E W";
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}
	
	@Test
	public void testValidateFail4() {
		String input = null;
		boolean result = inputValidation.validate(input);
		assertEquals(input, false, result);
	}

}
