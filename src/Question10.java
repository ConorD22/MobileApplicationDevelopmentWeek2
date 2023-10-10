import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the hexidecimal number you wish to convert: ");
        String hex = scan.nextLine();
        char[] hexArray = hex.toCharArray();
        reverse(hexArray);




    }

    static void reverse(char[] a){
        char[]reversed = new char[a.length];

        for(int i = 0; i < reversed.length; i++){
            reversed[a.length -1 -i] = a[i];
        }
        converter(reversed);

    }

    static void converter(char[] a){

        int num = 0;
        int position = 1;
        for (char c : a) {
            String current = "";
            current += c;
            int digitValue = Integer.parseInt(current, 16);
            num += digitValue * position;
            position *= 16;
        }
        System.out.print("Converted to decimal: " + num);

    }
}