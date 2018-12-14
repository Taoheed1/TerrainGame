import java.lang.reflect.Array;

public class Player extends Locations {

	
	private int currentNorthSouth;
	private int currentEastWest;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
		this.currentNorthSouth=currentNorthSouth;
		this.currentEastWest=currentEastWest;
	}

	public int getCurrentNorthSouth() {
		return currentNorthSouth;
	}

	public void setCurrentNorthSouth(int currentNorthSouth) {
		this.currentNorthSouth = currentNorthSouth;
	}

	public int getCurrentEastWest() {
		return currentEastWest;
	}

	public void setCurrentEastWest(int currentEastWest) {
		this.currentEastWest = currentEastWest;
	}

}
