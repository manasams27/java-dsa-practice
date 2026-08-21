import java.util.*;
public class ConvertToLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + 32);
                System.out.println(ch);
            }
        }
    }
}
