package fsoto1.marsrover.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fsoto1.marsrover.models.InputModel;
import fsoto1.marsrover.validations.InputValidation;

/**
 * Class that is responsible for get the data of the text file
 * @author fsoto1
 */
public class RoverFileReader {
	private static final String FILE_TEXT_NAME = "rovers.txt";
	private InputValidation limitIV;
	private InputValidation roverPosIV;
	private InputValidation roverMovIV;

	public RoverFileReader(InputValidation limitIV, InputValidation roverPosIV, InputValidation roverMovIV) {
		this.limitIV = limitIV;
		this.roverPosIV = roverPosIV;
		this.roverMovIV = roverMovIV;
	}

	/**
	 * Method that get the data of the text file
	 * @param roverInputQuantity the quantity of rovers that is going to input
	 * @return The input data
	 */
	public InputModel readUserInput() {
		//open the file
		File file = new File(FILE_TEXT_NAME);
		InputModel inputModel = null;
		List<String> roverPositions = new ArrayList<>();
		List<String> roverMovements = new ArrayList<>();
		String limit;
		//begin to read the content of the file, line by line
		try(BufferedReader br = new BufferedReader(new FileReader(file));){
			// read the rover limit, with the first br.readline (first line)
			limit = readLimitInput(br);
			String input;
			while ((input = br.readLine()) != null) {
				// read the rover positions
				readRoverPositionInput(input);
				roverPositions.add(input);
				// read the rover movements with a new br.readline
				input = readRoverMovementInput(br);
				roverMovements.add(input);
			}
			//add all the inputs
			inputModel = new InputModel(limit, roverPositions, roverMovements);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inputModel;
	}

	/**
	 * Method that read and validate the coordinate limits from the file
	 * @param br
	 * @return the coordinate limits
	 * @throws IOException
	 */
	private String readLimitInput(BufferedReader br) throws IOException {
		String input = null;
		boolean isValid = false;
		input = br.readLine();
		if(input == null)
			throw new IOException("The file doesn't have the upper-right coordinates");
		input = input.trim();
		isValid = limitIV.validate(input);
		if (!isValid)
			throw new IOException("The input for the upper-right coordinates is invalid");
		return input;
	}

	/**
	 * Method that read and validate the rover coordinates and orientation from the file
	 * @param br
	 * @return the rover position
	 * @throws IOException
	 */
	private String readRoverPositionInput(String input) throws IOException {
		input = input.trim();
		boolean isValid = false;
		isValid = roverPosIV.validate(input);
		if (!isValid) 
			throw new IOException("The input for the rover position is invalid");
		return input.trim();
	}

	/**
	 * Method that read and validate the rover movements from the file
	 * @param br
	 * @return the rover movements
	 * @throws IOException
	 */
	private String  readRoverMovementInput(BufferedReader br) throws IOException {
		String input = null;
		boolean isValid = false;
		input = br.readLine();
		if(input == null)
			throw new IOException("The file doesn't have the rover movements to complete the rover");
		input = input.trim();
		isValid = roverMovIV.validate(input);
		if (!isValid) 
			throw new IOException("The input for the rover movements is invalid");
		return input;
	}
}
