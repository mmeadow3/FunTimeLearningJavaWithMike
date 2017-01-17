//////constructors have to share the same name as the class 
public class Class2 {
	private String newName;
	/////matching name for Costructor 
	public Class2(String name){
		newName = name;
	}
	public String getName(){
		return newName;
	}
	
	public void sayName(){
		System.out.printf("My Name is %s", getName());
	}
}
