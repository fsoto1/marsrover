package fsoto1.marsrover.movements;

import fsoto1.marsrover.models.RoverModel;

/**
 * Class that implements the RoverMovement methods and has the responsibility
 * for move the rover in his current orientation
 * @author fsoto1
 */
public class NormalRoverMovement implements RoverMovement{

	@Override
	public void move(RoverModel rover) {
		Movement movement = new NormalMovement();
		switch (rover.getDirection()){
		case NORTH:
			movement.goNorth(rover);
			break;
		case SOUTH:
			movement.goSouth(rover);
			break;
		case EAST:
			movement.goEast(rover);
			break;
		case WEST:
			movement.goWest(rover);
			break;
		default:
			throw new IllegalArgumentException("Invalid cardinal direction");
		}
	}
}
