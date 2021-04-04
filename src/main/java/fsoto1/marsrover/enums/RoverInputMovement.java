package fsoto1.marsrover.enums;

/**
 * Enum for the rover input movements
 * @author fsoto1
 */
public enum RoverInputMovement {
	Left("L"),
	Right("R"),
	Move("M");
	
	public final  String label;
	
	private RoverInputMovement(String label) {
        this.label = label;
    }
	
	/**
     * Find the movement from a String ignoring the case,
     * If is not present null is returned
     * @param code
     * @return the rover input movement
     */
    public static RoverInputMovement getRoverInputByString(String code){
        for(RoverInputMovement e : RoverInputMovement.values()){
            if(e.label.equalsIgnoreCase(code)) return e;
        }
        return null;
    }
}
