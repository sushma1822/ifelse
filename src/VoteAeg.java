import java.util.Scanner;

public class VoteAeg {
    public static void main(String[] arg){
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" WHAT IS THE AGE ");
        {
            age = scanner.nextInt();
        } if (age >= 18) {
            System.out.println(" eligible for vote ");
        } else {
            System.out.println(" NOT eligible for vote ");
        }

    }
}
