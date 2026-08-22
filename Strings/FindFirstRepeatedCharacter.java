import java.util.*;
public class FindFirstRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            int count = 0;
            for(int j=0; j<word.length(); j++){
                if(word.charAt(j) == ch){
                    count++;
                }
            }
            if(count > 1){
                System.out.print(ch);
                break;
            }
        }
    }
}
