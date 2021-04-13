package fsoto1.marsrover.rovers;

import fsoto1.marsrover.models.RoverModel;

/**
 * Inteface for the rover
 * @author fsoto1
 */
public interface Rover {

	/**
	 * Method that run the rover
	 */
	public void run();
	
	/**
	 * Method that return the rover model
	 * @return rover model
	 */
	public RoverModel getRoverModel();
}
