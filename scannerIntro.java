import java.util.Scanner;
/////importing this allows to gather user input
public class scannerIntro {
	public static void main(String[] args){
		///make variabe to hold user input
		////System in is System input
		Scanner userInput = new Scanner(System.in);
		/// this line will print out after the user has input data
		System.out.println(userInput.nextLine());
	}
}
