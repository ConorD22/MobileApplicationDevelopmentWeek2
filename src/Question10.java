import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the hexidecimal number you wish to convert: ");
        String hex = scan.nextLine();
        int length = hex.length();

        int base = 1;
        int decimalValue = 0;

        for(int i = length - 1; i >= 0; i--){
            if(hex.charAt(i) >= '0' && hex. charAt(i) <= '9'){
                decimalValue += (hex.charAt(i) - 48) * base; //minus 48 to convert it to actual number rather than ascii

                base = base * 16;
            }

            else if( hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F'){
                decimalValue += (hex.charAt(i) - 55) * base; //minus 55 to convert it to actual number rather than ascii

                base = base * 16;
            }
        }

        System.out.println(decimalValue);

    }
}