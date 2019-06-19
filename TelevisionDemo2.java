import java.util.Scanner;

public class TelevisionDemo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the brand of your tv?");
		String brand = keyboard.nextLine();
		
		Television myTV = new Television(brand);
		int option;
		
		do {
			System.out.println("Press 0 to turn the tv off");
			System.out.println("Press 1 to turn the tv on");
			System.out.println("Press 2 to check the power status of the tv");
			System.out.println("Press 3 to the end the program");
			option = keyboard.nextInt();
			
			if(option == 0) {
				myTV.setPower(0);
			}
			else if(option == 1) {
				myTV.setPower(1);
			}
			else if(option == 2) {
				int power = myTV.getPower();
				if(power == 0) 
					System.out.println("The TV is off");
				else
					System.out.println("The TV is on");
			}
			else if(option == 3) {
				System.out.println("Goodbye!");
			}
			else {
				System.out.println("Error! Invalid option! Try again!");
			}
			
		}while(option != 3);
		
		
	}

}
