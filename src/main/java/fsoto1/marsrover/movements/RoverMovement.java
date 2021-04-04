package fsoto1.marsrover.movements;

import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.RoverModel;

/**
 * Interface that has the rover movement methods
 * @author fsoto1
 */
public interface RoverMovement {

	/**
	 * Method that move the rover N times in his current orientation 
	 * @param rover the roverModel
	 * @param limit the limits boundary
	 * @param movements the N times to move
	 */
	public void move(RoverModel rover, LimitModel limit, int movements);
	
}
