package fsoto1.marsrover.validations;

import fsoto1.marsrover.enums.CardinalDirection;

/**
 * Class for the rover position input validation
 * @author fsoto1
 */
public class RoverPosInputValidation implements InputValidation {

	@Override
	public boolean validate(String input) {
		if(input == null)
			return false;
		String[] value = input.split(" ");
		if(value.length != 3) 
			return false;
		try {
			Integer.parseInt(value[0]);
			Integer.parseInt(value[1]);
		} catch (NumberFormatException e) {
			return false;
		}
		CardinalDirection direction = CardinalDirection.getDirectionByString(value[2]);
		if (null==direction)
			return false;
		return true;
	}
	
}
