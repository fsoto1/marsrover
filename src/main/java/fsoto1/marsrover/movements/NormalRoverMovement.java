package fsoto1.marsrover.movements;

import java.security.InvalidParameterException;

import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.RoverModel;

/**
 * Class that implements the RoverMovement methods and has the responsibility
 * for move the rover in his current orientation
 * @author fsoto1
 */
public class NormalRoverMovement implements RoverMovement{

	@Override
	public void move(RoverModel rover, LimitModel limit, int movements) {
		Movement movement = new NormalMovement();
		switch (rover.getDirection()){
		case North:
			movement.goNorth(rover, limit, movements);
			break;
		case South:
			movement.goSouth(rover, movements);
			break;
		case East:
			movement.goEast(rover, limit, movements);
			break;
		case West:
			movement.goWest(rover, movements);
			break;
		default:
			throw new InvalidParameterException("Invalid cardinal direction");
		}
	}
}
