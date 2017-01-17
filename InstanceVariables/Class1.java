import java.util.Scanner;

public class Class1 {
	public static void main(String[] args){
		Scanner nameInput = new Scanner(System.in);
		Class2 Class2Object = new Class2();
		
		System.out.println("Enter your name for a good time");
		
		String temp = nameInput.nextLine();
		
		Class2Object.setName(temp);
		Class2Object.saying();
	}
}
