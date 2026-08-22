import java.util.*;
public class FrequencyOfEachCharacter {
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
            System.out.println(ch + " = " + count);
        }
    }
}
