package fsoto1.marsrover;

import java.util.List;
import fsoto1.marsrover.readers.FileRoverReader;
import fsoto1.marsrover.readers.RoverReader;
import fsoto1.marsrover.rovers.Rover;

/**
 * Principal class for the program
 * @author fsoto1
 */
public class App {
    public static void main( String[] args ){
    	RoverReader reader = new FileRoverReader("rovers.txt");
    	List<Rover> rovers = reader.read();
    	rovers.forEach(rover -> rover.run());
    	rovers.stream().map(rover -> rover.getRoverModel()).forEach(System.out::println);
    }
}
