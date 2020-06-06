import java.util.Scanner;

public class WeekDays {
    public static void main(String[] arg){
        int week;
        Scanner scanner = new Scanner(System.in);
        // Input week number from user
        System.out.println("Enter week number (1-7): ");
        week    = scanner.nextInt();


        if( week== 1)
        {
            System.out.println("Monday");
        }
        else if(week == 2)
        {
            System.out.println("Tuesday");
        }
        else if(week == 3)
        {
            System.out.println("Wednesday");
        }
        else if(week == 4)
        {
            System.out.println("Thursday");
        }
        else if(week == 5)
        {
            System.out.println("Friday");
        }
        else if(week == 6)
        {
            System.out.println("Saturday");
        }
        else if(week == 7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid Input! Please enter week number between 1-7.");
        }


    }
}
