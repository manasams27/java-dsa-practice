import java.util.*;
public class SymmetricOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        boolean symmetric = true;
        if(r != c){
            symmetric = false;
        }else{
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    if(arr[i][j] != arr[j][i]){
                        symmetric = false;
                        break;
                    }
                }
                if(!symmetric){
                    break;
                }
            }
        }
        if(symmetric){
            System.out.println("Symmetric");
        }else{
            System.out.println("Not Symmetric");
        }
    }
}