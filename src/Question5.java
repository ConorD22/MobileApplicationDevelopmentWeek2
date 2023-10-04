import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word to check if it is a palindrome: ");
        String check = scan.nextLine();
        String reverse = "";
        char ch;


        for(int i = 0; i < check.length(); i++){
            ch = check.charAt(i);
            reverse = ch + reverse;
        }

        char[] normal = check.toCharArray();
        char[] backwards = reverse.toCharArray();



        if(Arrays.equals(normal, backwards)){
            System.out.println(check + " is a palindrome!");
        }else{
            System.out.println(check + " is not a palindrome!");
        }

    }
}
