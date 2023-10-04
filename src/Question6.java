import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
        String enter = "Adam";
        check(enter);
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
                System.out.println(a + "-ay");
            }else{
                String removed = a.replace(a.charAt(0), ' ');
                System.out.println(removed + "-" + lowerCase.charAt(0) + "ay");
            }







    }
}
