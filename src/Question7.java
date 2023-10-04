import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int height;
        int length;

        while(true){
            System.out.println("Please select an option");
            System.out.println("1. Square");
            System.out.println("2. Right-handed Triangle");
            System.out.println("3. Pyramid");
            System.out.println("0. Exit");

            int userInput = scan.nextInt();

            switch (userInput){
                case 1:
                    square();
                    break;

                case 2:
                    triangle();
                    break;

                case 3:
                    pyramid();
                    break;

                case 0:
                    System.out.println("GoodBye!");
                    return;

                default:
                    System.out.println("Invalid option, please try again!");
                    break;
            }

        }

    }

    public static void square(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter height of sqaure: ");
        int height = scan.nextInt();

        System.out.println("Enter length of square: ");
        int length = scan.nextInt();

        char star = '*';
        String starPrint = "";



        for(int i = 0; i < height; i++){
            for(int j = 0; j < length; j++){
                starPrint += star;

            }
            starPrint += "\n";
        }
        System.out.print(starPrint +  "\n");
    }

    public static void triangle(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter height of triangle: ");
        int height = scan.nextInt();

        System.out.println("Enter length of triangle: ");

        int length = scan.nextInt();
        char star = '*';
        String startPrint = "";

        for(int i = 0; i < height; i++){
            for(int j = 0; j <= i; j++){
                startPrint += star;
            }
            startPrint += "\n";
        }
        System.out.print(startPrint + "\n");
    }

    public static void pyramid(){
        Scanner scan = new Scanner(System.in);
        char star = '*';
        int k = 0;

        System.out.println("Enter how many rows you want the pyramid to have: ");
        int rows = scan.nextInt();

        for(int i = 1; i <= rows; i++, k = 0){
            for(int j = 1; j <= rows - i; j++){
                System.out.print("  ");
            }

            while(k != 2 * i - 1){
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }

    }


}
