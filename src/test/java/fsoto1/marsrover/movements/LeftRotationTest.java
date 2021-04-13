package fsoto1.marsrover.movements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.models.RoverModel;

public class LeftRotationTest {

	private RoverMovement leftRotation;
	
	@Before
	public void setUp() throws Exception {
		leftRotation = new LeftRotation();
	}
	
	@Test
	public void testMoveLeftFromNorth() {
		RoverModel rover = new RoverModel();
		rover.setDirection(CardinalDirection.NORTH);		
		leftRotation.move(rover);
		assertEquals("Left rotation from NORTH", rover.getDirection(), CardinalDirection.WEST);
	}
	
	@Test
	public void testMoveLeftFromNorthFail() {
		RoverModel rover = new RoverModel();
		rover.setDirection(CardinalDirection.NORTH);
		leftRotation.move(rover);
		assertNotEquals("Left rotation from NORTH not equals", rover.getDirection(), CardinalDirection.EAST);
		assertNotEquals("Left rotation from NORTH not equals", rover.getDirection(), CardinalDirection.SOUTH);
		assertNotEquals("Left rotation from NORTH not equals", rover.getDirection(), CardinalDirection.NORTH);
	}

}
