import java.text.DecimalFormat;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius;
        double height;
        double volume;

        DecimalFormat df = new DecimalFormat("0.00");

        while(true){
            System.out.println("Please select an option: ");
            System.out.println("1. Volume of a sphere");
            System.out.println("2. Volume of a cylinder");
            System.out.println("0. Exit");

            int userInput = scan.nextInt();

            switch (userInput){

                case 1:
                    System.out.print("Enter the radius of the sphere: ");
                    radius = scan.nextDouble();

                    volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

                    System.out.println("Volume: " + df.format(volume));
                    break;

                case 2:
                    System.out.print("Enter the radius of the cylinder: ");
                    radius = scan.nextDouble();

                    System.out.print("Enter the height of the cylinder: ");
                    height = scan.nextDouble();

                    volume = Math.PI * Math.pow(radius, 2) * height;
                    System.out.println("Volume: " + df.format(volume));
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option, please try again!");
            }
        }
    }

}
