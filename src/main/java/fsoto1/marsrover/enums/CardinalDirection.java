package fsoto1.marsrover.enums;

/**
 * Enum for the cardinal directions
 * @author fsoto1
 */
public enum CardinalDirection {
	NORTH("N"),
	SOUTH("S"),
	EAST("E"),
	WEST("W");
	
	public final String label;
	private CardinalDirection left;
	private CardinalDirection right;
	
	static {
		NORTH.left = WEST;
		NORTH.right = EAST;
		SOUTH.left = EAST;
		SOUTH.right = WEST;
		EAST.left = NORTH;
		EAST.right = SOUTH;
		WEST.left = SOUTH;
		WEST.right = NORTH;		
	}

    private CardinalDirection(String label) {
        this.label = label;
    }
    
    /**
     * Find the cardinal direction from a String ignoring the case,
     * If is not present null is returned
     * @param code
     * @return the cardinal direction
     */
    public static CardinalDirection getDirectionByString(String code){
        for(CardinalDirection e : CardinalDirection.values()){
            if(e.label.equalsIgnoreCase(code)) return e;
        }
        return null;
    }
    
    /**
     * Turn the direction 90 degree left
     * @param direction
     * @return new direction
     */
    public static CardinalDirection turnLeft(CardinalDirection direction) {
    	return direction.left;
    }
    
    /**
     * Turn the direction 90 degree right
     * @param direction
     * @return new direction
     */
    public static CardinalDirection turnRight(CardinalDirection direction) {
    	return direction.right;
    }
}
