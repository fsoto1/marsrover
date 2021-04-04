package fsoto1.marsrover.rovers;

import java.util.ArrayList;
import java.util.List;
import fsoto1.marsrover.enums.RoverInputMovement;
import fsoto1.marsrover.models.InputModel;
import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.MovementModel;
import fsoto1.marsrover.models.RoverModel;
import fsoto1.marsrover.movements.NormalRoverMovement;
import fsoto1.marsrover.rotations.NormalRotation;
import fsoto1.marsrover.service.ExtractInputService;
import fsoto1.marsrover.ui.RoverFileReader;
import fsoto1.marsrover.validations.LimitInputValidation;
import fsoto1.marsrover.validations.RoverMovInputValidation;
import fsoto1.marsrover.validations.RoverPosInputValidation;

/**
 * Method that handle the rovers exploration
 * @author fsoto1
 */
public class RoverHandler {
	
	private static final int DEFAULT_ROVER_MOVEMENT_QUANTITY = 1;
	private InputModel input;
	private LimitModel limit;
	private List<RoverModel> roverModels;
	private List<MovementModel> roverMovements;
	
	/**
	 * Method that call the console information for load the rovers and then run it
	 * @throws Exception 
	 */
	public void handle() throws Exception {
		//create an object and inject the dependencies for the validations
		RoverFileReader roverFileReader = new RoverFileReader(new LimitInputValidation(), new RoverPosInputValidation(), new RoverMovInputValidation());
		//read the input from the file, validate the data and then asign to the input object
		input = roverFileReader.readUserInput();
		//extract the input into objects
		extractInput();
		//run the rovers
		runRovers();
	}
	
	/**
	 * Method that run each of the rover and print his final positions
	 */
	public void runRovers() {
		List<Rover> rovers = new ArrayList<>();
		//iterate the rovers
		for (int i = 0; i < roverModels.size(); i++) {
			//create the new rover with the normal rotation and movement
			//also the limits of the plateau is passed
			Rover rover = new Rover(roverModels.get(i), limit, new NormalRotation(), new NormalRoverMovement());
			//iterate the movements for the given rover
			for(RoverInputMovement mov: roverMovements.get(i).getMovements()) {
				switch (mov) {
					case Move:
						rover.move(DEFAULT_ROVER_MOVEMENT_QUANTITY);
						break;
					case Right:
						rover.rightRotation();
						break;
					case Left:
						rover.leftRotation();
						break;
					default:
						throw new IllegalArgumentException();
				}
			}
			//add the rover to the list
			rovers.add(rover);
		}
		//print the final positions of the rovers
		rovers.forEach((rover) ->{
			System.out.println(rover.getRoverModel());
		});
	}
	
	/**
	 * Method that extract the input information into objects
	 * @throws Exception 
	 */
	public void extractInput() throws Exception {
		limit = ExtractInputService.extractLimitsIntoLimitModel(input.getLimit());
		roverModels = ExtractInputService.extractRoverPositionsIntoRoverModel(input.getRoverPositions());
		roverMovements = ExtractInputService.extractRoverMovements(input.getRoverMovements());
	}
}
