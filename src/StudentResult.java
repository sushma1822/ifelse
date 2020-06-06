import java.util.Scanner;

public class StudentResult {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Name: ");
        String name = scanner.nextLine();

        System.out.println("roll no:");
        int  rollnumber = scanner.nextInt();
        System.out.println("Please enter your Maths mark: ");
        int Maths = scanner.nextInt();
        System.out.println("Please enter your Science mark:");
        int science = scanner.nextInt();
        System.out.println("Please enter your English mark:");
        int English = scanner.nextInt();
        int total = Maths + English + science;
        double percentage = total / 3;
        System.out.println("Total marks = total");
        System.out.println("percentage = " +percentage);
        if (percentage >= 80){
            System.out.println("A+");
        }
        else if (percentage < 80 && percentage >= 60){
            System.out.println("A grade");
        }
        else if (percentage < 60 && percentage >= 50){
            System.out.println("B grade");

        }
        else if (percentage < 50 && percentage >= 35){
            System.out.println("fail");
        }
    }
}












