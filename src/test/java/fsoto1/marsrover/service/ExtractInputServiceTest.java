package fsoto1.marsrover.service;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import fsoto1.marsrover.enums.CardinalDirection;
import fsoto1.marsrover.enums.RoverInputMovement;
import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.MovementModel;
import fsoto1.marsrover.models.RoverModel;

public class ExtractInputServiceTest {

	@Test
	public void testExtractLimitsIntoLimitModel() throws Exception {
		String limit = "5 6";
		LimitModel limitModel = ExtractInputService.extractLimitsIntoLimitModel(limit);
		assertEquals("Limit X = 5", 5, limitModel.getxLimit());
		assertEquals("Limit Y = 6", 6, limitModel.getyLimit());
	}

	@Test
	public void testExtractRoverPositionsIntoRoverModel() throws Exception {
		List<String> roverPositions = new ArrayList<>();
		roverPositions.add("1 3 E");
		List<RoverModel> roverModelsExtracted = ExtractInputService.extractRoverPositionsIntoRoverModel(roverPositions);
		List<RoverModel> roverModelsExpected = new ArrayList<>();
		roverModelsExpected.add(new RoverModel(1, 3, CardinalDirection.East));		
		assertEquals("Rover model list", roverModelsExpected, roverModelsExtracted);
	}

	@Test
	public void testExtractRoverMovements() throws Exception {
		List<String> roverMovements = new ArrayList<>();
		roverMovements.add("LRM");
		List<MovementModel> movementModelExtracted = ExtractInputService.extractRoverMovements(roverMovements);
		List<MovementModel> movementModelExpected = new ArrayList<>();
		List<RoverInputMovement> roverInputMovements = new ArrayList<>();
		roverInputMovements.add(RoverInputMovement.Left);
		roverInputMovements.add(RoverInputMovement.Right);
		roverInputMovements.add(RoverInputMovement.Move);
		movementModelExpected.add(new MovementModel(roverInputMovements));
		assertEquals("Movement model list", movementModelExtracted, movementModelExpected);		
	}

}
