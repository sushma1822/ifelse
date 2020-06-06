import java.util.Scanner;

public class InterchangeValue {
    public static void main(String[] arg){
        int a , b ,t;     // a and b are to swap
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("before swapping numbers: "+ a +" " + b);
        //swapping
           t = a;
           a = b;
           b = t;
           System.out.println("After swapping: "+ a +" "+b);

}
 }