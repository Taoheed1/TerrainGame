
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Player player = new Player();
		Swamp swamp = new Swamp();
		Treasure treasure = new Treasure();
		Compass compass = new Compass();
		
		
		while (treasure.lookingForTreasure()) {
			
			player.input();
			player.direction();
			swamp.playerLocation(player);
			treasure.notifyPlayer(swamp);
			compass.treasureDistance(swamp, treasure);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
