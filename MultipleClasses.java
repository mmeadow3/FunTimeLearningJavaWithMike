import java.util.Scanner;

public class MultipleClasses {
	public static void main(String [] args){
		//////this is the one that contains main()
		Scanner input = new Scanner(System.in);
		
		MultipleClasses1 MutlitpleClassObject = new MultipleClasses1();
		
		
		System.out.println("Please enter your name");
		/////make a variable to hold name data
		String name =  input.nextLine();
		//////this time pass the parameter
		MutlitpleClassObject.print(name);
	}
}
