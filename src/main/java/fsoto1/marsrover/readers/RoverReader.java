package fsoto1.marsrover.readers;

import java.util.List;

import fsoto1.marsrover.rovers.Rover;

/**
 * Interface that implements the method for read the roves
 * @author fsoto1
 */
public interface RoverReader {

	/**
	 * Method that read the rovers
	 * @return rover list
	 */
	public List<Rover> read();
	
}
