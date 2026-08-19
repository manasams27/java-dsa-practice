import java.util.*;
public class CountSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
