package fsoto1.marsrover.rovers;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.enums.RoverInputMovement;
import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.RoverModel;

public class NormalRoverTest {

	@Test
	public void testRunRoverCase1() {
		RoverModel roverModel = new RoverModel(1, 2, CardinalDirection.NORTH, new LimitModel(5,5));
		List<RoverInputMovement> movements = 
				Arrays.asList(RoverInputMovement.LEFT,
						RoverInputMovement.MOVE,
						RoverInputMovement.LEFT,
						RoverInputMovement.MOVE,
						RoverInputMovement.LEFT,
						RoverInputMovement.MOVE,
						RoverInputMovement.LEFT,
						RoverInputMovement.MOVE,
						RoverInputMovement.MOVE);
		
		Rover rover = new NormalRover(roverModel, movements);
		rover.run();
		assertEquals("Rover X", 1, rover.getRoverModel().getxPosition());
		assertEquals("Rover Y", 3, rover.getRoverModel().getyPosition());
		assertEquals("Rover D",  CardinalDirection.NORTH, rover.getRoverModel().getDirection());
	}

	@Test
	public void testRunRoverCase2() {
		RoverModel roverModel = new RoverModel(3, 3, CardinalDirection.EAST, new LimitModel(5,5));
		List<RoverInputMovement> movements = 
				Arrays.asList(RoverInputMovement.MOVE,
						RoverInputMovement.MOVE,
						RoverInputMovement.RIGHT,
						RoverInputMovement.MOVE,
						RoverInputMovement.MOVE,
						RoverInputMovement.RIGHT,
						RoverInputMovement.MOVE,
						RoverInputMovement.RIGHT,
						RoverInputMovement.RIGHT,
						RoverInputMovement.MOVE);
		
		Rover rover = new NormalRover(roverModel, movements);
		rover.run();
		assertEquals("Rover X", 5, rover.getRoverModel().getxPosition());
		assertEquals("Rover Y", 1, rover.getRoverModel().getyPosition());
		assertEquals("Rover D",  CardinalDirection.EAST, rover.getRoverModel().getDirection());
	}
}
