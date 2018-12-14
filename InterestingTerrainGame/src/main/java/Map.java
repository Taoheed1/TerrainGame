import java.awt.List;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Map {

	
	public Map() {

	
		
//		Array[] eastWest= new Array[7];
//		Array[] northSouth = new Array[7];
		
		//eastWest.add(Locations);
		
		//ArrayList<Locations>eastWest = new ArrayList<Locations>();
		public void placeThings() {
			
			int xPosition = Math.random(1:10);

		}
		
		//could also do this by finding the array element that they are currently at and finding the abs between the two
		
		
		//need to iterate through the map to find the distance between the player and the next point of interest
		//run through all array elements, find player type object and save 
		for (Array player :eastWest) {
		}
		for (int i=0; i<eastWest.length; i++) {
			if ( (eastWest[i]).stream().isEmpty) {
				continue;
			}
			else if (eastWest(i) instanceof )
		}
		

	}

	
	//this method will be called to place the player and points of interest
	public void findItems() {
		for(Array player :eastwest)
			
	}
		
	

	public void story() {
		String background = "You're lost in a swamp.......";
	}
	
	public void userInput() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select whether to go north, south, east or west");
		String input =sc.next();
		
		while (!Goal.getFound()) {
			if (input == "north") {
				
			}
			else if (input == "south") {
				
			}
			else if(input== "east") {
				
			}
			System.out.println(input);
		}
	
		
	}
	

}
