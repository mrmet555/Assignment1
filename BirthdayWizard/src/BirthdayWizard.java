import java.util.Scanner;

public class BirthdayWizard {
	

	private static Scanner keyboard;
	
	public static void main(String[] args) {
		int YoB = 0;
		keyboard = new Scanner(System.in);
		System.out.println("Enter your year of birth:");
		YoB = keyboard.nextInt();
		int drinkingage = YoB+21;
		if (drinkingage <= 2015) {
			System.out.println("Your 21st birthday occurred in the year " + drinkingage);
		}
		else {
			System.out.println("Your 21st birthday will occur in the year " + drinkingage);
		}
	}

}
