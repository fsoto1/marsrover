package fsoto1.marsrover.rotations;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.models.RoverModel;

public class NormalRotationTest {

	private Rotation rotation;
	@Before
	public void setUp() throws Exception {
		rotation = new NormalRotation();
	}

	@Test
	public void testLeftRotation() {
		RoverModel roverModel = new RoverModel(1, 2, CardinalDirection.North);
		rotation.leftRotation(roverModel);
		assertEquals("Rover Direction", CardinalDirection.West, roverModel.getDirection());
	}

	@Test
	public void testRightRotation() {
		RoverModel roverModel = new RoverModel(1, 2, CardinalDirection.North);
		rotation.rightRotation(roverModel);
		assertEquals("Rover Direction", CardinalDirection.East, roverModel.getDirection());
	}

}
