package fsoto1.marsrover.models;

public class LimitModel {

	private int xLimit;
	private int yLimit;
	
	public LimitModel() {
		super();
	}
	public LimitModel(int xLimit, int yLimit) {
		super();
		this.xLimit = xLimit;
		this.yLimit = yLimit;
	}
	public int getxLimit() {
		return xLimit;
	}
	public void setxLimit(int xLimit) {
		this.xLimit = xLimit;
	}
	public int getyLimit() {
		return yLimit;
	}
	public void setyLimit(int yLimit) {
		this.yLimit = yLimit;
	}
	@Override
	public String toString() {
		return "LimitModel [xLimit=" + xLimit + ", yLimit=" + yLimit + "]";
	}
	
}
