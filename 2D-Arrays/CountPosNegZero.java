import java.util.*;
public class CountPosNegZero {
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
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j] > 0){
                    posCount++;
                }else if(arr[i][j] < 0){
                    negCount++;
                }else{
                    zeroCount++;
                }
            }
        }
        System.out.println(posCount);
        System.out.println(negCount);
        System.out.println(zeroCount);
        
    }
}
