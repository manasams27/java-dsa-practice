import java.util.*;
public class PrintEachInNewLine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            System.out.println(ch);
        }
    }
}