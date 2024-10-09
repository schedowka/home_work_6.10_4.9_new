import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int km = scanner.nextInt();
       int metre = scanner.nextInt();
       double metre2 = km/3.6;
        System.out.println("км/час = " + metre2 + " м/с");

      if (metre2>metre) {
          System.out.println("километры в час больше " +km);
      }
       else{
           System.out.println("Метры в сек больше " + metre);
      }


    }
}
