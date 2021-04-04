package fsoto1.marsrover.rotations;

import fsoto1.marsrover.models.RoverModel;

/**
 * Interface that has the methods for the rotation of the rover
 * @author fsoto1
 *
 */
public interface Rotation {

	/**
	 * Method that rotate the current rover direction, 90 degree to the left
	 * @param rover
	 */
	public void leftRotation(RoverModel rover);
	
	/**
	 * Method that rotate the current rover direction, 90 degree to the right
	 * @param rover
	 */
	public void rightRotation(RoverModel rover);
	
}
