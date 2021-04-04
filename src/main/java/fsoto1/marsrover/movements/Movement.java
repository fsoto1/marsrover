package fsoto1.marsrover.movements;

import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.RoverModel;

/**
 * Interface that has the cardinal movement methods
 * @author fsoto1
 */
public interface Movement {
	
	/**
	 * This method move the rover N times to the north
	 * without passing the Y boundary
	 * @param rover the roverModel
	 * @param limit boundary of the plateau
	 * @param movements numbers of time to move
	 */
	public void goNorth(RoverModel rover, LimitModel limit, int movements);
	
	/**
	 * This method move the rover N times to the south
	 * without passing the Y boundary
	 * @param rover the roverModel
	 * @param movements numbers of time to move
	 */
	public void goSouth(RoverModel rover, int movements);
	
	/**
	 * This method move the rover N times to the east
	 * without passing the X boundary
	 * @param rover the roverModel
	 * @param limit boundary of the plateau
	 * @param movements numbers of time to move
	 */
	public void goEast(RoverModel rover, LimitModel limit, int movements);
	
	/**
	 * This method move the rover N times to the west
	 * without passing the X boundary
	 * @param rover the roverModel
	 * @param movements numbers of time to move
	 */
	public void goWest(RoverModel rover, int movements);
}
