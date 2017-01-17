public class Class2 {
	////Private varibale is only scoped to this method///////
	private String firstName;
	public void setName(String name){
		firstName = name;
	}
	////String is the return type/////
	public String getName(){
		return firstName;
	}
	public void saying(){
		//%s is telling that the value following will be a String
		 System.out.printf("Your Name is %s", getName() );
	}
}
