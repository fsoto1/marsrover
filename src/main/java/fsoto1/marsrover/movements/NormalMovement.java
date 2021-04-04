package fsoto1.marsrover.movements;

import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.RoverModel;

/**
 * Class that implements the Movement interface
 * Is resposible for the methods that move the rover
 * @author fsoto1
 *
 */
public class NormalMovement implements Movement {

	@Override
	public void goNorth(RoverModel rover, LimitModel limit, int movements) {
		if(limit.getyLimit() >= rover.getyPosition() + movements)
			rover.setyPosition(rover.getyPosition() + movements);
	}

	@Override
	public void goSouth(RoverModel rover, int movements) {
		if(0 <= rover.getyPosition() - movements)
			rover.setyPosition(rover.getyPosition() - movements);
	}

	@Override
	public void goEast(RoverModel rover, LimitModel limit, int movements) {
		if(limit.getxLimit() >= rover.getxPosition() + movements)
			rover.setxPosition(rover.getxPosition() + movements);
	}

	@Override
	public void goWest(RoverModel rover, int movements) {
		if(0 <= rover.getxPosition() - movements)
			rover.setxPosition(rover.getxPosition() - movements);
	}

}
