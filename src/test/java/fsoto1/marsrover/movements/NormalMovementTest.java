package fsoto1.marsrover.movements;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.RoverModel;

public class NormalMovementTest {

	private Movement roverMovement;
	private LimitModel limitModel;
	
	@Before
	public void setUp() throws Exception {
		roverMovement = new NormalMovement();
		limitModel = new LimitModel(5, 5);
	}

	@Test
	public void testGoNorth() {
		RoverModel roverModel = new RoverModel(1, 2, CardinalDirection.North);
		roverMovement.goNorth(roverModel, limitModel, 1);
		assertEquals("Go North in X=1", 1, roverModel.getxPosition());
		assertEquals("Go North in Y=2", 3, roverModel.getyPosition());
	}

	@Test
	public void testGoSouth() {
		RoverModel roverModel = new RoverModel(1, 2, CardinalDirection.South);
		roverMovement.goSouth(roverModel, 1);
		assertEquals("Go South in X=1", 1, roverModel.getxPosition());
		assertEquals("Go South in Y=2", 1, roverModel.getyPosition());
	}

	@Test
	public void testGoEast() {
		RoverModel roverModel = new RoverModel(1, 2, CardinalDirection.East);
		roverMovement.goEast(roverModel, limitModel, 1);
		assertEquals("Go East in X=1", 2, roverModel.getxPosition());
		assertEquals("Go East in Y=2", 2, roverModel.getyPosition());
	}

	@Test
	public void testGoWest() {
		RoverModel roverModel = new RoverModel(1, 2, CardinalDirection.West);
		roverMovement.goWest(roverModel, 1);
		assertEquals("Go West in X=1", 0, roverModel.getxPosition());
		assertEquals("Go West in Y=2", 2, roverModel.getyPosition());
	}

}
