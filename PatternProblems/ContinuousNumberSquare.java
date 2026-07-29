import java.util.*;
public class ContinuousNumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
