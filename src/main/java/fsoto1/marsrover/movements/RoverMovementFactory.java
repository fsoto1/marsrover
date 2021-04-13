package fsoto1.marsrover.movements;

import fsoto1.marsrover.enums.RoverInputMovement;

/**
 * Factory class that create the instances for the rover movement
 * @author fsoto1
 *
 */
public class RoverMovementFactory{
	
	private RoverMovementFactory() {}

	/**
	 * Create an instance of RoverMovement for the given movement
	 * @param mov
	 * @return the RoverMovement instance
	 */
	public static RoverMovement create(RoverInputMovement mov) {
		switch (mov) {
			case MOVE:
				return new NormalRoverMovement();
			case RIGHT:
				return new RightRotation();
			case LEFT:				
				return new LeftRotation();
			default:
				throw new IllegalArgumentException();
		}		
	}
	
}
