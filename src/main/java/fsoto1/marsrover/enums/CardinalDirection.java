package fsoto1.marsrover.enums;

/**
 * Enum for the cardinal directions
 * @author fsoto1
 */
public enum CardinalDirection {
	North("N"),
	South("S"),
	East("E"),
	West("W");
	
	public final String label;

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
}
