import java.util.*;
public class StringIsPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        boolean isPalindrome = true;
        for(int i=0; i<word.length()/2; i++){
            char first = word.charAt(i);
            char last = word.charAt(word.length() - 1 - i);
            if(first != last){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}