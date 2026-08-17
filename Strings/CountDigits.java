import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int count=0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= '0' && ch <= '9'){
                count++;
            }
        }
        System.out.println(count);
    }
}
