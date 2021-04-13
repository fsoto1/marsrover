package fsoto1.marsrover.movements;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.RoverModel;

public class NormalRoverMovementTest {

	@Test
	public void testNormalRoverMovementToNorth() {
		RoverModel rover = new RoverModel(0,0,CardinalDirection.NORTH,new LimitModel(5,5));
		RoverMovement normalRoverMovement = new NormalRoverMovement();
		normalRoverMovement.move(rover);
		assertEquals("Move to the NORTH X", rover.getxPosition(), 0);
		assertEquals("Move to the NORTH Y", rover.getyPosition(), 1);
		assertEquals("Move to the NORTH D", rover.getDirection(), CardinalDirection.NORTH);
	}

}
