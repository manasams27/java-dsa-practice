import java.util.*;
public class VowelsConsonents{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int Vowels = 0;
        int Consonent = 0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                Vowels++;
            }
            else{
                Consonent++;
            }
        }
        System.out.println(Vowels);
        System.out.println(Consonent);
    }
}