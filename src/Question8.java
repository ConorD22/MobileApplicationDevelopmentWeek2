import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String answer = "";

        System.out.print("Please enter a number to convert it intro roman numerals: ");

        int num = scan.nextInt();

        if(num / 1000 != 0){
            int check = num / 1000;
            answer += thousands[check];
            num = num - (check * 1000);
        }

        if(num / 100 != 0){
            int check = num / 100;
            answer += hundreds[check];
            num = num - (check * 100);
        }

        if(num / 10 != 0){
            int check = num / 10;
            answer += tens[check];
            num = num - (check * 10);
        }

        answer += ones[num];


        System.out.print(answer);

    }
}
