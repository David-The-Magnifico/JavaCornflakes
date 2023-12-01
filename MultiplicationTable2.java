import java.util.Scanner;

public class MultiplicationTable2 { 

	public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
    	System.out.print("Please enter a number: ");
   	 int number = input.nextInt();

    	if (number < 1 || number > 12) {
        System.out.println("Try Again!!!. Please enter a number between 1 and 12.");
        System.out.print("Please enter a number: ");
        number = input.nextInt();
    	}

   	for (int i = 1; i <= 12; i++) {
        System.out.println(number + " x " + i + " = " + (number * i));
    		}
	}
}