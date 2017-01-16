
public class Increments {
	public static void main(String [] args){
		int x = 5;
		int y = 10;
		System.out.println(x);  ////obviously will be 5
		System.out.println(x++); ///this outputs 5 bc of post-incrementing
		System.out.println(x); /// this is now 6 since the value has been incremented
		System.out.println(++y);  ////This outputs 11 bc of pre-incrementing
		System.out.println(y); // this is 11 bc of the previous line
		
		///basic operators that are the same as JS
		
		x += 10;
		System.out.println(x); /// 16 bc increment (+1) + 5 + 10
	}
}
