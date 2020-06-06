import java.util.Scanner;

public class OddEven {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number:");
        int number = scanner.nextInt();
        System.out.print("Enter a second number:");
        int num = scanner.nextInt();
        String evenodd = (num % 2 == 0  ) ? "even number" : "odd number";
        System.out.println(num + "is" + evenodd);
        if (num % 2 == 0 ){
            System.out.println(num + " is  even number");

        }
         else {
            System.out.println(num + " is odd number");
        }
    }
}
