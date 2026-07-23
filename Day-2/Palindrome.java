import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int original = n;
        while(n > 0){
            int digit = n % 10;
            rev = (rev * 10) + digit;
            n = n / 10;
        }
        if(original == rev){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
    
}
