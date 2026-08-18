import java.util.*;
public class CheckIdentityMatrix {
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
        boolean isIdentity = true;
        if(r != c){
            isIdentity = false;
        }else{
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    if(i == j && arr[i][j] != 1){
                        isIdentity = false;
                        break;
                    }
                    if(i != j && arr[i][j] != 0){
                        isIdentity = false;
                        break;
                    }
                }
                if(!isIdentity){
                    break;
                }
            }
        }
        if(isIdentity){
            System.out.println("Identity Matrix");
        }else{
            System.out.println("Not a identity matrix");
        }
    }
}
