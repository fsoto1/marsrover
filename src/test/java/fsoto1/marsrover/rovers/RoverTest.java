package fsoto1.marsrover.rovers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.RoverModel;
import fsoto1.marsrover.movements.NormalRoverMovement;
import fsoto1.marsrover.rotations.NormalRotation;

/**
 * @author fsoto1
 *
 */
public class RoverTest {

	private LimitModel limit;
	
	@Before
	public void setUp() throws Exception {
		limit = new LimitModel(5,5);
	}
	
	@Test
	public void testRoverMovements1() {
		RoverModel roverModel = new RoverModel(1,2,CardinalDirection.North);
		Rover rover = new Rover(roverModel, limit, new NormalRotation(), new NormalRoverMovement());
		rover.leftRotation();
        rover.move(1);
        rover.leftRotation();
        rover.move(1);
        rover.leftRotation();
        rover.move(1);
        rover.leftRotation();
        rover.move(1);
        rover.move(1);
        assertEquals("Position [x]", 1, rover.getRoverModel().getxPosition());
        assertEquals("Position [y]", 3, rover.getRoverModel().getyPosition());
        assertEquals("Direction", CardinalDirection.North, rover.getRoverModel().getDirection());
	}

	@Test
	public void testRoverMovements2() {
		RoverModel roverModel = new RoverModel(3,3,CardinalDirection.East);
		Rover rover = new Rover(roverModel, limit, new NormalRotation(), new NormalRoverMovement());
		rover.move(1);
        rover.move(1);
        rover.rightRotation();
        rover.move(1);
        rover.move(1);
        rover.rightRotation();
        rover.move(1);
        rover.rightRotation();
        rover.rightRotation();
        rover.move(1);
        assertEquals("Position [x]", 5, rover.getRoverModel().getxPosition());
        assertEquals("Position [y]", 1, rover.getRoverModel().getyPosition());
        assertEquals("Direction", CardinalDirection.East, rover.getRoverModel().getDirection());
	}
	
	@Test
	public void testRoverMovements3() {
		RoverModel roverModel = new RoverModel(3,3,CardinalDirection.East);
		Rover rover = new Rover(roverModel, limit, new NormalRotation(), new NormalRoverMovement());
		rover.move(1);
        rover.move(1);
        rover.move(1);
        rover.move(1);
        rover.rightRotation();
        rover.move(1);
        rover.move(1);
        rover.rightRotation();
        rover.move(1);
        rover.rightRotation();
        rover.rightRotation();
        rover.move(1);
        assertEquals("Position [x]", 5, rover.getRoverModel().getxPosition());
        assertEquals("Position [y]", 1, rover.getRoverModel().getyPosition());
        assertEquals("Direction", CardinalDirection.East, rover.getRoverModel().getDirection());
	}
}
