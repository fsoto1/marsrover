package fsoto1.marsrover.rotations;

import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.models.RoverModel;

/**
 * Class that implements the Rotation methods of the rover
 * @author fsoto1
 */
public class NormalRotation implements Rotation{

	@Override
	public void leftRotation(RoverModel rover) {
		switch (rover.getDirection()) {
			case North:
				rover.setDirection(CardinalDirection.West);
				break;
			case South:
				rover.setDirection(CardinalDirection.East);
				break;
			case East:
				rover.setDirection(CardinalDirection.North);
				break;
			case West:
				rover.setDirection(CardinalDirection.South);
				break;
		}
	}
	
	@Override
	public void rightRotation(RoverModel rover) {
		switch (rover.getDirection()) {
			case North:
				rover.setDirection(CardinalDirection.East);
				break;
			case South:
				rover.setDirection(CardinalDirection.West);
				break;
			case East:
				rover.setDirection(CardinalDirection.South);
				break;
			case West:
				rover.setDirection(CardinalDirection.North);
				break;
		}
	}
}
