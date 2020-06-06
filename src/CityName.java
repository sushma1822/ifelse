import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         char ch;
        System.out.print("Enter any Alphabet: ");
        ch = scanner.next().charAt(0);
        // with if else statement

        if ( ch =='a') {
            System.out.println(" Alston ");
        } else if ( ch == 'b') {
            System.out.println(" Birmingham ");
        } else if (ch == 'c') {
            System.out.println(" Coventry ");
        } else if (ch == 'd') {
            System.out.println(" Dundee ");
        } else if ( ch == 'e') {
            System.out.println(" Edinburgh ");
        } else if ( ch == 'f'){
            System.out.println(" Fair view ");
        }


    }


        }
