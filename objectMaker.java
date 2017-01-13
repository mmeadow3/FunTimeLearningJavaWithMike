
////////define the Object///////

class Dog {
  int size;
  String breed;
  String name;
////method, duh//////
  void bark(){
    System.out.println("Speak NOW!!!!");
    }
}

///////This will make the Object do its actions/////
class DogTest{
  public static void main(String[] args){
/////////instantiate the new Dog Object
    Dog d = new Dog();
    d.size = 12;
    d.bark();
  }
}
