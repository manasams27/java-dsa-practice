import java.util.*;
public class RemoveSpacesInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(ch != ' '){
                System.out.print(ch);
            }
        }
    }
}
