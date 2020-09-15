
public class Treasure {

	private int treasureXCord=3;
	private int treasureYCord=2;
	private boolean lookingForTreasure=true;
	

	Swamp swamp = new Swamp();
		
	public int getxCord() {
		return treasureXCord;
	}

	public void setxCord(int xCord) {
		this.treasureXCord = xCord;
	}

	public int getyCord() {
		return treasureXCord;
	}

	public void setyCord(int yCord) {
		this.treasureXCord = yCord;
	}
	
	
	public boolean notifyPlayer(Swamp swamp) {
		
		if ((treasureXCord==swamp.getPlayerXCord()) && (treasureYCord==swamp.getPlayerYCord())) {
			System.out.println("You've found the treasure");
			return lookingForTreasure=false;
		}
		return lookingForTreasure;	
	}
	
	
	public boolean lookingForTreasure() {
		return lookingForTreasure;
		
	}
}
