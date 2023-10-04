import java.text.DecimalFormat;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsius;
        double fahrenheit;



        while(true){
            System.out.println("Please select an option");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0. Exit");
            int userInput = scan.nextInt();
            DecimalFormat df = new DecimalFormat("0.00");

            switch(userInput){
                case 1:
                    System.out.println("Please enter the temperature in Celsius: ");
                    celsius = scan.nextInt();
                    fahrenheit = (celsius * 9/5) + 32;
                    System.out.println(celsius + " celsius is equal to " + df.format(fahrenheit) + " fahrenheit\n");
                    break;

                case 2:
                    System.out.println("Please enter the temperature in Fahrenheit: ");
                    fahrenheit = scan.nextInt();
                    celsius = 5.0 / 9.0 * (fahrenheit - 32);
                    System.out.println(fahrenheit + " fahrenheit is equal to " + df.format(celsius) + " celsius\n");
                    break;

                case 0:
                    System.out.println("Goodbye");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid option try again\n");
                    break;
            }
        }
    }
}
