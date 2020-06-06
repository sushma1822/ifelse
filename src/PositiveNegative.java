import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] arg){
        int number;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the number :");
        number = scanner.nextInt();
        scanner.close();
        if(number > 0)
        {
            System.out.println(number+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}
