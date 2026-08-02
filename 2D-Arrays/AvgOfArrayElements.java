import java.util.*;
public class AvgOfArrayElements {
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
        int sum = 0;
        int avg = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                sum += arr[i][j];
                avg = sum / (r * c);
            }
        }
        System.out.println(avg);
    }
}
