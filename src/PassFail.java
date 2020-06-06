import java.util.Scanner;

public class PassFail {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String studentname;
        int geography, science, history, Rollno;
        float total, percentage;
        scanner = new Scanner(System.in);
        System.out.println(" Enter student name: ");
        studentname = scanner.next();
        System.out.println(" Enter student Roll no: ");
        Rollno = scanner.nextInt();
        System.out.println(" Enter geography marks: ");
        geography = scanner.nextInt();
        System.out.println(" Enter science marks: ");
        science = scanner.nextInt();
        System.out.println(" Enter history marks: ");
        history = scanner.nextInt();
        total = geography + science + history;
        percentage = (total / 300) * 100;

        System.out.println(" Total marks = " + total);
        System.out.println(" Percentage = " + percentage);

        if ((geography >=35) && (science >=35) && (history >=35)){

            System.out.println(" STUDENT PASS ");
        } else {
            System.out.println(" STUDENT FAIL ");
        }

    }
}
