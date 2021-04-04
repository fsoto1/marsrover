package fsoto1.marsrover.service;

import java.util.ArrayList;
import java.util.List;

import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.enums.RoverInputMovement;
import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.MovementModel;
import fsoto1.marsrover.models.RoverModel;

/**
 * Service class that extract the data from the input,
 * the input must be correctly spelled before using this class
 * @author fsoto1
 *
 */
public class ExtractInputService {
	
	private ExtractInputService() {}

	/**
	 * Method that extract the limit input data into the LimitModel object,
	 * the input must be validated before using this method.
	 * @param limit input data
	 * @return the LimitModel object
	 * @throws Exception
	 */
	public static LimitModel extractLimitsIntoLimitModel(String limit) throws Exception{
		String[] arrayPos = limit.split(" ");
		return new LimitModel(Integer.parseInt(arrayPos[0]), Integer.parseInt(arrayPos[1]));
	}
	
	/**
	 * Method that extract the list of the rover positions data into a list of RoverModel,
	 * the input must be validated before using this method.
	 * @param roverPositions list of rover positions input
	 * @return the list of RoverModel
	 * @throws Exception
	 */
	public static List<RoverModel> extractRoverPositionsIntoRoverModel(List<String> roverPositions) throws Exception{
		List<RoverModel> roverModels = new ArrayList<>();
		roverPositions.forEach((position) -> {
			String[] arrayPos = position.split(" ");
			RoverModel rover = new RoverModel(Integer.parseInt(arrayPos[0]), Integer.parseInt(arrayPos[1]), CardinalDirection.getDirectionByString(arrayPos[2]));
			roverModels.add(rover);
		});
		return roverModels;
	}
	
	/**
	 * Method that extract the list of the rover movements data into a list of MovementModel,
	 * the input must be validated before using this method.
	 * @param roverMovements list of rover movements input
	 * @return the list of MovementModel
	 * @throws Exception
	 */
	public static List<MovementModel> extractRoverMovements(List<String> roverMovements) throws Exception{
		List<MovementModel> movementModels = new ArrayList<>();
		//List<RoverInputMovement> movements;
		roverMovements.forEach((movement) -> {
			List<RoverInputMovement> inputMovements = new ArrayList<>();
			String[] values = movement.split("");
			for (String value : values) {
				inputMovements.add(RoverInputMovement.getRoverInputByString(value));
			}
			movementModels.add(new MovementModel(inputMovements));
		});
		return movementModels;
	}
}
