import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] arg){

        String name;
        int id;
        double sales_amount, basic_salary;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Employee name:");
        name = scanner.next();
        System.out.println(" Enter id: ");
        id = scanner.nextInt();
        System.out.println(" Enter basic salary : £ ");
        basic_salary = scanner.nextDouble();
        System.out.println(" Enter the sales amount: ");
        sales_amount = scanner.nextDouble();

        if (sales_amount >=50000){
            System.out.println(" Sales_commission = " + (50000 * 30) /100);
        } else if ( sales_amount >=30000){
            System.out.println(" Sales_commission = " + (30000 *20) /100);
        } else if (sales_amount >=10000){
            System.out.println(" Sales_commission = " + ( 10000 * 10) /100);
        }
    }
}
