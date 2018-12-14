
public class Goal extends Locations {

	private boolean found;
	private int currentNorthSouth;
	private int currentEastWest;
	
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

	public Goal() {
		super();
		this.found=found;
	}

	public boolean isFound() {
		return found;
	}

	public void setFound(boolean found) {
		this.found = found;
	}
	
	
}
