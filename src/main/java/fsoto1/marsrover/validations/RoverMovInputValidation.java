package fsoto1.marsrover.validations;

import fsoto1.marsrover.enums.RoverInputMovement;

/**
 * Class for the rover movements input validation
 * @author fsoto1
 */
public class RoverMovInputValidation implements InputValidation {

	@Override
	public boolean validate(String input) {
		if(input == null)
			return false;
		String[] values = input.trim().split("");
		if(values.length == 0)
			return false;
		for (String value : values) {
			if(RoverInputMovement.getRoverInputByString(value) == null)
				return false;
		}
		return true;
	}

}
