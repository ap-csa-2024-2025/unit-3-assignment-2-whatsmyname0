import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int rand1 = (int) (Math.random() * 51);
    int rand2 = (int) (Math.random() * 51) + 50;
    System.out.println(rand1 + " + " + rand2 + " = ?");
    Scanner sc = new Scanner(System.in);
    int ans1 = sc.nextInt();
    if (ans1 == (rand1 + rand2))
    {
      System.out.println("Correct");
    }
    else
    {
      System.out.println("Wrong");
    }
  }
}