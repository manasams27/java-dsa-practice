import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        StringBuilder sb = new StringBuilder(word);
        System.out.println(sb.reverse());
    }
}
