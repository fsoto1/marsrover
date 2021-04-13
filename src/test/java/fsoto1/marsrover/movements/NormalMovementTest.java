package fsoto1.marsrover.movements;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.RoverModel;

public class NormalMovementTest {

	private Movement normalMovement;
	private RoverModel rover;
	
	@Before
	public void setUp() throws Exception {
		normalMovement = new NormalMovement();
		rover = new RoverModel(2,2,CardinalDirection.NORTH,new LimitModel(5,5));
	}

	@Test
	public void testGoNorth() {
		RoverModel roverTest = rover;
		normalMovement.goNorth(roverTest);
		assertEquals("Move to the NORTH X", rover.getxPosition(), 2);
		assertEquals("Move to the NORTH Y", rover.getyPosition(), 3);
	}

	@Test
	public void testGoSouth() {
		RoverModel roverTest = rover;
		normalMovement.goSouth(roverTest);
		assertEquals("Move to the SOUTH X", rover.getxPosition(), 2);
		assertEquals("Move to the SOUTH Y", rover.getyPosition(), 1);
	}

	@Test
	public void testGoEast() {
		RoverModel roverTest = rover;
		normalMovement.goEast(roverTest);
		assertEquals("Move to the EAST X", rover.getxPosition(), 3);
		assertEquals("Move to the EAST Y", rover.getyPosition(), 2);
	}

	@Test
	public void testGoWest() {
		RoverModel roverTest = rover;
		normalMovement.goWest(roverTest);
		assertEquals("Move to the WEST X", rover.getxPosition(), 1);
		assertEquals("Move to the WEST Y", rover.getyPosition(), 2);
	}

}
