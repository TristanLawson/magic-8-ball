import java.util.Random;
import java.util.Scanner;

public class magic_8_ball {
	
	public static final Scanner screen = new Scanner(System.in);
	
	public static int randomInt(int upper){
		Random random = new Random();
		return random.nextInt(upper);
	}
	
	public static void printTooShort() {
		System.out.println("speak up a bit, will you?");
	}
	
	public static void printTooLong() {
		int num = randomInt(4);
		switch(num) {
		case(0):
			System.out.println("I lost track of that halfway through");
			break;
		case(1):
			System.out.println("you are quite longwinded");
			break;
		case(2):
			System.out.println("try to keep me awake this time");
			break;
		case(4):
			System.out.println("fuckin' hell, I haven't got all day! shorten that up for me");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("welcome...");
		boolean cont = true;
		while(cont) {
			System.out.println("enter a question...");
			String userString = screen.nextLine();
			if(userString.contentEquals("exit")) cont = false;
			else if(userString.length() < 4) printTooShort();
			else if(userString.length() > 50) printTooLong();

		}
		
		screen.close();
	}

}
