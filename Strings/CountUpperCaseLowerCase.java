import java.util.*;
public class CountUpperCaseLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int upper = 0;
        int lower = 0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                upper++;
            }else if(ch >= 'a' && ch <= 'z'){
                lower++;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
    }
}
