package fsoto1.marsrover.rovers;

import java.util.List;
import fsoto1.marsrover.enums.RoverInputMovement;
import fsoto1.marsrover.models.RoverModel;
import fsoto1.marsrover.movements.RoverMovement;
import fsoto1.marsrover.movements.RoverMovementFactory;

/**
 * Class that has the rover information and the movements methods
 * @author fsoto1
 */
public class NormalRover implements Rover{
	
	private RoverModel roverModel;
	private List<RoverInputMovement> movements;
	
	public NormalRover(RoverModel roverModel, List<RoverInputMovement> movements) {
		this.roverModel = roverModel;
		this.movements = movements;
	}
	
	@Override
	public RoverModel getRoverModel() {
		return roverModel;
	}
	
	@Override
	public void run() {
		movements.forEach(this::moveRover);
	}
	
	/**
	 * Method for the movements of the rover
	 * @param mov
	 */
	private void moveRover(RoverInputMovement mov) {
		RoverMovement movement = RoverMovementFactory.create(mov);
		movement.move(roverModel);		
	}
}
