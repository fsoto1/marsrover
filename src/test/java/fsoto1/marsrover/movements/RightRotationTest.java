package fsoto1.marsrover.movements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.Test;
import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.models.RoverModel;

public class RightRotationTest {

	private RoverMovement rightRotation;
	
	@Before
	public void setUp() throws Exception {
		rightRotation = new RightRotation();
	}
	
	@Test
	public void testMoveRightFromNorth() {
		RoverModel rover = new RoverModel();
		rover.setDirection(CardinalDirection.NORTH);
		rightRotation.move(rover);
		assertEquals("Right rotation from NORTH", rover.getDirection(), CardinalDirection.EAST);
	}
	
	@Test
	public void testMoveRightFromNorthFail() {
		RoverModel rover = new RoverModel();
		rover.setDirection(CardinalDirection.NORTH);
		rightRotation.move(rover);
		assertNotEquals("Right rotation from NORTH not equals", rover.getDirection(), CardinalDirection.WEST);
		assertNotEquals("Right rotation from NORTH not equals", rover.getDirection(), CardinalDirection.SOUTH);
		assertNotEquals("Right rotation from NORTH not equals", rover.getDirection(), CardinalDirection.NORTH);
	}

}
