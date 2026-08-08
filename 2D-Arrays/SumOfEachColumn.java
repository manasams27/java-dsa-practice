import java.util.*;
public class SumOfEachColumn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<c; i++){
            int sum = 0;
            for(int j=0; j<r; j++){
                sum += arr[j][i];
            }
            System.out.println("Sum of each column " + (i + 1) + " = " + sum);
        }
    }
}