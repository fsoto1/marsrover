package fsoto1.marsrover.models;

import fsoto1.marsrover.enums.CardinalDirection;

public class RoverModel {
	
	private int xPosition;
	private int yPosition;
	private CardinalDirection direction;
	
	public RoverModel() {
		super();
	}
	public RoverModel(int xPosition, int yPosition, CardinalDirection direction) {
		super();
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.direction = direction;
	}
	public int getxPosition() {
		return xPosition;
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public int getyPosition() {
		return yPosition;
	}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	public CardinalDirection getDirection() {
		return direction;
	}
	public void setDirection(CardinalDirection direction) {
		this.direction = direction;
	}
	@Override
	public String toString() {
		return xPosition + " " + yPosition + " " + direction.label;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direction == null) ? 0 : direction.hashCode());
		result = prime * result + xPosition;
		result = prime * result + yPosition;
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
		RoverModel other = (RoverModel) obj;
		if (direction != other.direction)
			return false;
		if (xPosition != other.xPosition)
			return false;
		if (yPosition != other.yPosition)
			return false;
		return true;
	}
}
