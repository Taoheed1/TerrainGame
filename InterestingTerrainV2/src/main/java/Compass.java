
public class Compass {

	Swamp swamp = new Swamp();
	Treasure treasure = new Treasure();

	public void treasureDistance(Swamp swamp, Treasure treasure) {

		int square = 2;
//		String xDirection = "";
//		if (swamp.getPlayerXCord() < treasure.getxCord()) {
//			xDirection = "east of the treasure";
//		}
//		else if (swamp.getPlayerXCord() > treasure.getxCord()) {
//			xDirection = "west of the treasure";
//		}
//		else {
//			xDirection = "look up or down I guess";
//		}
//		System.out.print("You are " + Math.abs(swamp.getPlayerXCord() - treasure.getxCord()) + xDirection);
//		
		int xPythagoras =(treasure.getxCord()- swamp.getPlayerXCord());
		int yPythagoras =(treasure.getyCord() - swamp.getPlayerYCord());
//		double xPythagorasSquared = Math.pow(xPythagoras, square);
//		double yPythagorasSquared = Math.pow(yPythagoras, square);
		double xPythagorasSquared = xPythagoras * xPythagoras;
		double yPythagorasSquared = yPythagoras  * yPythagoras;
		double sum = xPythagorasSquared+yPythagorasSquared;
		double distance = Math.sqrt(sum);
		System.out.println("Your distance from the treasure is : " +  (int)distance + "m");
	}
}
