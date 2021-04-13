package fsoto1.marsrover.movements;

import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.models.RoverModel;

/**
 * Class that implements the left rotation movement for the rover
 * @author fsoto1
 */
public class LeftRotation implements RoverMovement{	

	@Override
	public void move(RoverModel rover) {
		rover.setDirection(CardinalDirection.turnLeft(rover.getDirection()));
	}
	
}
