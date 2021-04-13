package fsoto1.marsrover.rovers;

import java.util.List;

import fsoto1.marsrover.enums.RoverInputMovement;
import fsoto1.marsrover.models.RoverModel;

/**
 * Factory class that create the rover objects
 * @author fsoto1
 */
public class RoverFactory {
	
	/**
	 * Method that create the rover object
	 * @param roverModel
	 * @param roverMovements
	 * @return
	 */
	public static Rover create(RoverModel roverModel, List<RoverInputMovement> roverMovements) {
		return new NormalRover(roverModel, roverMovements);
	}

}
