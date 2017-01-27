class Gooddog {


private int size; //declaring varibale as private but getters and setters as public


public int getSize() {
  return size;
}

public void setSize(int s) {
  size = s;
}

void bark() {
  if (size > 60){
    System.out.println("Hey im a dog");
    } else if (size > 14){
      System.out.println("Hey im a smaller dog");
    } else {
      System.out.println("Hey im the smallest dog");
    }
  }
}
class GooddogExecute {
  public static void main (String[] args){
    Gooddog one = new Gooddog();
    one.setSize(70);
    Gooddog two = new Gooddog();
    two.setSize(45);
      System.out.println("Dog one has the size " + one.getSize());
      System.out.println("Dog two has the size " + two.getSize());
      one.bark();
      two.bark();
  }
}
