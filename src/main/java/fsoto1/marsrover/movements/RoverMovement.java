package fsoto1.marsrover.movements;

import fsoto1.marsrover.models.RoverModel;

/**
 * Interface for the rover movements
 * @author fsoto1
 */
public interface RoverMovement {

	/**
	 * Method that move the rover
	 */
	public void move(RoverModel rover);
	
}
