import java.util.*;
public class CheckMatrixIsDiagonal {
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
        boolean isDiagonal = true;
        if(r != c){
            isDiagonal = false;
        }
        else{
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    if(i==j && arr[i][j] == 0){
                        isDiagonal = false;
                        break;
                    }
                    if(i != j && arr[i][j] != 0){
                        isDiagonal = false;
                        break;
                    }
                }
                if(!isDiagonal){
                    break;
                }
            }
        }
        if(isDiagonal){
            System.out.println("Diagonal matrix");
        }
        else{
            System.out.println("not a diagonal matrix");
        }
    }
}
