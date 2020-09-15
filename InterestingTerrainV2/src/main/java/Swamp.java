
public class Swamp {

	private int playerXCord=0;
	private int playerYCord=0;

	
	Player player = new Player();
	
	
	public int getPlayerXCord() {
		return playerXCord;
	}

	public void setPlayerXCord(int playerXCord) {
		this.playerXCord = playerXCord;
	}

	public int getPlayerYCord() {
		return playerYCord;
	}

	public void setPlayerYCord(int playerYCord) {
		this.playerYCord = playerYCord;
	}


	public void playerLocation(Player player) {
		
		if (player.getInputDirection().equals("n")) {
			playerYCord += 1; 
		}
		else if (player.getInputDirection().equals("s")) {
			playerYCord -= 1; 

		}
		else if (player.getInputDirection().equals("e")) {
			playerXCord += 1; 

		}
		else if (player.getInputDirection().equals("w")) {
			playerXCord -= 1; 

		}System.out.println("Your position is: " +playerXCord+" "+playerYCord);
	}
	
}
