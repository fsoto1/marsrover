package fsoto1.marsrover.models;

import java.util.List;

import fsoto1.marsrover.enums.RoverInputMovement;

public class MovementModel {

	private List<RoverInputMovement> movements;

	public MovementModel() {
		super();
	}

	public MovementModel(List<RoverInputMovement> movements) {
		super();
		this.movements = movements;
	}

	public List<RoverInputMovement> getMovements() {
		return movements;
	}

	public void setMovements(List<RoverInputMovement> movements) {
		this.movements = movements;
	}

	@Override
	public String toString() {
		return "MovementModel [movements=" + movements + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movements == null) ? 0 : movements.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovementModel other = (MovementModel) obj;
		if (movements == null) {
			if (other.movements != null)
				return false;
		} else if (!movements.equals(other.movements))
			return false;
		return true;
	}
}
