import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = scan.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++ ){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.print("Sum: " + sum);
    }
}
