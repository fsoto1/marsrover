package fsoto1.marsrover.movements;

import fsoto1.marsrover.models.RoverModel;

/**
 * Class that implements the Movement interface
 * Is resposible for the methods that move the rover
 * @author fsoto1
 *
 */
public class NormalMovement implements Movement {
	
	public static final int DEFAULT_ROVER_MOVEMENT = 1;

	@Override
	public void goNorth(RoverModel rover) {
		if(rover.getLimit().getyLimit() >= rover.getyPosition() + DEFAULT_ROVER_MOVEMENT)
			rover.setyPosition(rover.getyPosition() + DEFAULT_ROVER_MOVEMENT);
	}

	@Override
	public void goSouth(RoverModel rover) {
		if(0 <= rover.getyPosition() - DEFAULT_ROVER_MOVEMENT)
			rover.setyPosition(rover.getyPosition() - DEFAULT_ROVER_MOVEMENT);
	}

	@Override
	public void goEast(RoverModel rover) {
		if(rover.getLimit().getxLimit() >= rover.getxPosition() + DEFAULT_ROVER_MOVEMENT)
			rover.setxPosition(rover.getxPosition() + DEFAULT_ROVER_MOVEMENT);
	}

	@Override
	public void goWest(RoverModel rover) {
		if(0 <= rover.getxPosition() - DEFAULT_ROVER_MOVEMENT)
			rover.setxPosition(rover.getxPosition() - DEFAULT_ROVER_MOVEMENT);
	}

}
