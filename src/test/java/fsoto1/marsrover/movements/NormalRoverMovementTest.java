package fsoto1.marsrover.movements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.RoverModel;

public class NormalRoverMovementTest {

	private LimitModel limitModel;
	private RoverMovement roverMovement;
	
	@Before
	public void setUp() throws Exception {
		limitModel = new LimitModel(5, 5);
		roverMovement = new NormalRoverMovement();
	}

	@Test
	public void testMove() {
		RoverModel roverModel = new RoverModel(1, 2, CardinalDirection.North);
		roverMovement.move(roverModel, limitModel, 1);
		assertEquals("Rover X", 1, roverModel.getxPosition());
		assertEquals("Rover Y", 3, roverModel.getyPosition());
		assertEquals("Rover Direction", CardinalDirection.North, roverModel.getDirection());
	}

}
