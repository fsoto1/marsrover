package fsoto1.marsrover.validations;

/**
 * Class for the limit input validation
 * @author fsoto1
 */
public class LimitInputValidation implements InputValidation {

	@Override
	public boolean validate(String input) {
		if(input == null)
			return false;
		String[] value = input.trim().split(" ");
		if(value.length != 2)		
			return false;
		try {
			Integer.parseInt(value[0]);
			Integer.parseInt(value[1]);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

}
