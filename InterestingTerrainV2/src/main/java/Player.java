import java.util.Scanner;

public class Player {

	//private String playerName;
	
	
	private String inputDirection;
	
	public String getInputDirection() {
		return inputDirection;
	}

	public void setInputDirection(String inputDirection) {
	}


	//Scanner asking for user choice	
	public void input() {
		System.out.println("please insert direction : ");			

		Scanner sc = new Scanner(System.in);
		inputDirection = sc.nextLine();
		System.out.println(inputDirection);
		}
    	
    	

	
	public void direction() {
		
		
		if (inputDirection.equals("n")) {
		}
		else if (inputDirection.equals("e")) {
			
		}
		else if (inputDirection.equals("s")) {
			
		}
		else if (inputDirection.equals("w")) {
			
		}
		else {
			System.out.println("That's not a direction, try again");			
		}
	}
	
}