package fsoto1.marsrover.movements;

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
	 * @param movements numbers of time to move
	 */
	public void goNorth(RoverModel rover);
	
	/**
	 * This method move the rover N times to the south
	 * without passing the Y boundary
	 * @param rover the roverModel
	 * @param movements numbers of time to move
	 */
	public void goSouth(RoverModel rover);
	
	/**
	 * This method move the rover N times to the east
	 * without passing the X boundary
	 * @param rover the roverModel
	 * @param movements numbers of time to move
	 */
	public void goEast(RoverModel rover);
	
	/**
	 * This method move the rover N times to the west
	 * without passing the X boundary
	 * @param rover the roverModel
	 * @param movements numbers of time to move
	 */
	public void goWest(RoverModel rover);
}
