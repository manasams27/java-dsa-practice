import java.util.*;
public class UpperTriangularMatrix{
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
        boolean isUpper = true;
        if(r != c){
            isUpper = false;
        }else{
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    if(i > j && arr[i][j] != 0){
                        isUpper = false;
                        break;
                    }
                }
                if(!isUpper){
                    break;
                }
            }
        }
        if(isUpper){
            System.out.println("Upper triangular matrix");
        }else{
            System.out.println("not");
        }
    }
}