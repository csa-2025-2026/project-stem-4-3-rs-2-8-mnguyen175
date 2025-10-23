import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here

    // Problem 2 
    int counter = 1; 
    for (int i = 17; i <= 73; i++)
    {
      System.out.print(i + " "); 

      if (counter == 10)
      {
        System.out.println();
        counter = 0;
      }
      counter++; 
    }
    System.out.println();

    // Problem 3 
    Scanner sc = new Scanner(System.in); 

    int count = 1; 
    System.out.println("Enter a number between 0 and 50:");
    int num = sc.nextInt();
    if (num <= 0 || num >= 50)
    {
      System.out.println("error");
    }
    else 
    {
      for (int i = num; i <= 50; i++)
      {
        System.out.print(i + " ");

        if (count == 5)
        {
          System.out.println(); 
          count = 0; 
        }
        count++;
      }
    }
  }
}
