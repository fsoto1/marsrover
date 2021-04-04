package fsoto1.marsrover.validations;

/**
 * Interface that has the input validation method
 * @author fsoto1
 *
 */
public interface InputValidation {

	/**
	 * Method that validate the input
	 * @param input
	 * @return true if is valid input, otherwise false
	 */
	public boolean validate(String input);
}
