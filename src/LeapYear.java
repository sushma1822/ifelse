import java.util.Scanner;

public class LeapYear {
    public static void main(String[] arg){
        int year;
        System.out.println("Enter an year:");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        // use logical operator
        if (((year % 4 == 0) && ( year % 100!= 0))|| (year % 400 == 0)){
            System.out.println("is leap year");

        }
        else {
            System.out.println("is not leap year");
        }


    }
}
