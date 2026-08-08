import java.util.Scanner;
public class MinimumElementInColumn {
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
            int min = arr[0][i];
            for(int j=0; j<r; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            System.out.println(min);;
        }
    }
}
