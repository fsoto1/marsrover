package fsoto1.marsrover.movements;

import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.models.RoverModel;

/**
 * Class that implements the right rotation movement for the rover
 * @author fsoto1
 */
public class RightRotation implements RoverMovement {

	@Override
	public void move(RoverModel rover) {
		rover.setDirection(CardinalDirection.turnRight(rover.getDirection()));
	}

}
