package fsoto1.marsrover;

import fsoto1.marsrover.rovers.RoverHandler;

/**
 * Principal class for the program
 * @author fsoto1
 */
public class App {
    public static void main( String[] args ){
    	RoverHandler roverHandler = new RoverHandler();
    	try {
			roverHandler.handle();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
