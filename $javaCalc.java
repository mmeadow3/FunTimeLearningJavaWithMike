import java.util.Scanner;
/////importing this allows to gather user input
public class $javaCalc {
	public static void main(String[] args){
		///make variabe to hold user input
		////System in is System input
		Scanner userInput = new Scanner(System.in);
		double num1, num2, answer;
		System.out.println("Enter a number");
		//////nextDouble is a provided method. could be nextString()
		num1 = userInput.nextDouble();
		System.out.println("Enter another number");
		num2 = userInput.nextDouble();
		System.out.println("The sum of your numbers is " + (num1 + num2));
	}
}

//output
//Enter a number
//7.7
//Enter another number
//8.8
//The sum of your numbers is 16.5