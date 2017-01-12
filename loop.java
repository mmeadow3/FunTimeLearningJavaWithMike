public class loop {
  public static void main(String[] args){
    int x = 1;
    System.out.println("This is firing before the loop");
    while(x < 5) {
      System.out.println("This is the number " + x);
      x = x + 1;
    }
  }
}
