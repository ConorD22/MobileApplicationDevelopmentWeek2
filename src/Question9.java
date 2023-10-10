import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a scentence you want converted to pig latin: ");
        String enter = scan.nextLine();
        String[] array = enter.split("\\s+");

        for(String word: array){
            check(word);
        }

    }

    public static void check(String a){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String lowerCase = a.toLowerCase();
        boolean result = true;
        char first = lowerCase.charAt(0);



        for(int i = 0; i < vowels.length; i++){
            if(lowerCase.charAt(0) == vowels[i]){
                result = true;
                break;
            }else{
                result = false;
            }
        }

        if(result){
            System.out.print(a + "ay ");
        }else{
            String removed = a.replace(a.charAt(0), ' ');
            System.out.print(removed +  lowerCase.charAt(0) + "ay ");
        }







    }
}
