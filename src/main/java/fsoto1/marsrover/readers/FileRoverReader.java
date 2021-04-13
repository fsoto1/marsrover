package fsoto1.marsrover.readers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.enums.RoverInputMovement;
import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.RoverModel;
import fsoto1.marsrover.rovers.Rover;
import fsoto1.marsrover.rovers.RoverFactory;

/**
 * Class that is responsible for get the data from the text file
 * @author fsoto1
 */
public class FileRoverReader implements RoverReader{
	private String fileName;
	
	public FileRoverReader(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public List<Rover> read() {
		File file = new File(fileName);
		List<Rover> rovers  = new ArrayList<>();				
		try(BufferedReader br = new BufferedReader(new FileReader(file));){
			getRoversFromFile(rovers, br);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rovers;
	}
	
	/**
	 * Method that get all the rovers from the file input
	 * @param rovers
	 * @param br
	 * @throws IOException
	 */
	private void getRoversFromFile(List<Rover> rovers, BufferedReader br) throws IOException {		
		List<RoverInputMovement> roverMovements = null;
		LimitModel limit = null;
		RoverModel roverModel = null;		
		Rover rover = null;
		if (br.ready())
			limit = extractLimitsIntoLimitModel(br.readLine());
		while (br.ready()) {
			roverModel = extractRoverModelFromInput(br.readLine(), limit);
			roverMovements = extractRoverInputMovementFromInput(br.readLine());	
			rover = RoverFactory.create(roverModel, roverMovements);
			rovers.add(rover);
		}
	}
	
	/**
	 * Method that extract the limit input data into the LimitModel object
	 * @param input limit data
	 * @return the LimitModel object
	 * @throws Exception
	 */
	private LimitModel extractLimitsIntoLimitModel(String input) throws IOException{		
		String[] arrayPos = input.split(" ");
		return new LimitModel(Integer.parseInt(arrayPos[0]), Integer.parseInt(arrayPos[1]));
	}
	
	/**
	 * Method that extract the roverModel from the input
	 * @param roverPositions list of rover positions input
	 * @return the RoverModel
	 * @throws Exception
	 */
	private RoverModel extractRoverModelFromInput(String input, LimitModel limit) throws IOException{	
		String[] arrayPos = input.split(" ");
		RoverModel rover = new RoverModel(Integer.parseInt(arrayPos[0]), Integer.parseInt(arrayPos[1]), CardinalDirection.getDirectionByString(arrayPos[2]), limit);
		return rover;
	}
	
	/**
	 * Method that extract the list of the rover movements data into a list of RoverInputMovement
	 * @param input of the rover movements
	 * @return the list of RoverInputMovement
	 * @throws Exception
	 */
	private List<RoverInputMovement> extractRoverInputMovementFromInput(String input) throws IOException{		
		List<RoverInputMovement> inputMovements = new ArrayList<>();
		String[] values = input.split("");
		for (String value : values) {
			inputMovements.add(RoverInputMovement.getRoverInputByString(value));
		}
		return inputMovements;		
	}

}
