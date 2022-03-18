import java.util.Scanner;

public class functions{

   public static int mult(int a ,int b)
   {
      return a*b;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(mult(a, b));

   }
}