import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    int x = inp.nextInt();
    //write your code below
    int count = 0;
    while(count <  x)
    {
      System.out.print(count + " ");
      count++;
    }
    
    
  }
}
