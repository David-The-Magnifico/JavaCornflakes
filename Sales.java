import java.util.Scanner;

public class Sales{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter an Item: ");
	String item = input.next();

	System.out.print("Enter the Price of the Item: ");
	int price = input.nextInt();

	double discount = 0.10;
	double total = price - (price * 0.10);

	System.out.printf("Item: %s%n",item);
	System.out.printf("Price: $%d",price);
	System.out.printf("%n      __________");
	System.out.printf("%nTotal: $%.2f", total);
	System.out.printf("%n      __________");
	System.out.printf("%nNon-refundable!!");
	}
}
