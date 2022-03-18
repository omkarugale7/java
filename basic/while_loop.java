import java.util.Scanner;

public class while_loop {
   public static void main(String[] args) {
      Scanner a = new Scanner(System.in);
      int omkat = a.nextInt();
      while (omkat>0) {
         System.out.println(omkat--);
         
      }
   }
}
