/**
 * Phone Number Project
 * @author Rohit
 *
 */
import java.util.Scanner;
public class Digits 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.next();
		in.nextLine();
		System.out.print("Type in the 10 digits of your phone number: ");
		String number = in.next();
		in.nextLine();
		String firstThree = number.substring(0, 3);
		String middleThree = number.substring(3,6);
		String lastFour = number.substring(6,10);
		String newNumber = "(" + firstThree + ")" + middleThree + "-" + lastFour;
		System.out.printf("%-20s %s",  name, newNumber);
		

	}

}
