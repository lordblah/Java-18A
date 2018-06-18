import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    int end = inp.nextInt();
    //write your code below
    if(end > 0)
      {
        int doubleEnd = end * 2;
        for(int x = 0; x < doubleEnd; x++)
        {
          System.out.print(x + " ");
        }
      }
    
  }
}
