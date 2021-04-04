package fsoto1.marsrover.models;

import java.util.List;

public class InputModel {

	private String limit;
	private List<String> roverPositions;
	private List<String> roverMovements;
	
	public InputModel() {
		super();
	}
	public InputModel(String limit, List<String> roverPositions, List<String> roverMovements) {
		super();
		this.limit = limit;
		this.roverPositions = roverPositions;
		this.roverMovements = roverMovements;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public List<String> getRoverPositions() {
		return roverPositions;
	}
	public void setRoverPositions(List<String> roverPositions) {
		this.roverPositions = roverPositions;
	}
	public List<String> getRoverMovements() {
		return roverMovements;
	}
	public void setRoverMovements(List<String> roverMovements) {
		this.roverMovements = roverMovements;
	}
	@Override
	public String toString() {
		return "InputModel [limit=" + limit + ", roverPositions=" + roverPositions + ", roverMovements="
				+ roverMovements + "]";
	}
}
