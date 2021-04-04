package fsoto1.marsrover.rovers;

import fsoto1.marsrover.models.LimitModel;
import fsoto1.marsrover.models.RoverModel;
import fsoto1.marsrover.movements.RoverMovement;
import fsoto1.marsrover.rotations.Rotation;

/**
 * Class that has the rover information and the movements methods
 * @author fsoto1
 */
public class Rover {
	
	private RoverModel rover;
	private LimitModel limit;
	private Rotation rotation;
	private RoverMovement movement;
	
	public Rover(RoverModel rover,  LimitModel limit, Rotation rotation, RoverMovement movement) {
		this.rover = rover;
		this.rotation = rotation;
		this.movement = movement;
		this.limit =limit;
	}
	
	public RoverModel getRoverModel(){
		return rover;
	}
	
	/**
	 * Method that call the left rotation of the rover
	 */
	public void leftRotation() {	
		rotation.leftRotation(rover);
	}
	
	/**
	 * Method that call the right rotation of the rover
	 */
	public void rightRotation() {
		rotation.rightRotation(rover);
	}
	
	/**
	 * Method that call the movement of the rover
	 * @param movements The N time to move
	 */
	public void move(int movements) {	
		movement.move(rover, limit, movements);
	}

}
