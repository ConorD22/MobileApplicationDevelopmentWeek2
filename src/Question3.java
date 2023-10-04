import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers would you like in the array? ");
        int arraySize = scan.nextInt();

        int[] array = new int[arraySize];


        for(int i = 0; i < array.length; i++){
            if(i == 0){
                System.out.println("Please enter the 1st number in the array: ");
                array[i] = scan.nextInt();
            }else if(i == 1){
                System.out.println("Please enter the 2nd number in the array: ");
                array[i] = scan.nextInt();
            }else if(i == 2){
                System.out.println("Please enter the 3rd number in the array: ");
                array[i] = scan.nextInt();
            }else{
                System.out.println("Please enter the " + (i + 1) + "th number in the array");
                array[i] = scan.nextInt();
            }
        }

        int min = array[0];
        int max = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }else if(array[i] < min){
                min = array[i];
            }

        }

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}
