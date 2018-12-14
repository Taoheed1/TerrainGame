import java.lang.reflect.Array;

public abstract class Locations {

	
	private int northSouth; 
	private int eastWest;
	
	public Locations() {
		this.northSouth=northSouth;
		this.eastWest=eastWest;
	}

	public int getNorthSouth() {
		return northSouth;
	}

	public void setNorthSouth(int northSouth) {
		this.northSouth = northSouth;
	}

	public int getEastWest() {
		return eastWest;
	}

	public void setEastWest(int eastWest) {
		this.eastWest = eastWest;
	}
	
	
}
