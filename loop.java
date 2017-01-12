public class loop {
  public static void main(String[] args){
    int x = 1;
    System.out.println("This is firing before the loop");

    ////////while loop////////

    // while(x < 5) {
    //     System.out.println("This is the number " + x);
    //   x = x + 1;
    // }

    ////// if else statment/////////
    // if (x == 2) {
    //   System.out.println("this wont work");
    // } else {
    //   System.out.println("the number must be 2");
    // }

    /////getting lengths from array and such
    String[] names = {"Mike", "me", "duh"};
    int namesLength = names.length;

    //////notice decaling the integer twice here and the paratheses//////
    int randromInt = (int) (Math.random() * 100);
    System.out.println(namesLength);
    System.out.println(randromInt);
  }
}
////println will print a new line each time
