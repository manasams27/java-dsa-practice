public class MultiplicationTable {
    public void printRes(int n){
        for(int i=0; i<=10; i++){
            int Res = n * i;
            System.out.println(n + " x " + i + " = " + Res);
        }

    }
    public static void main(String[] args) {
        MultiplicationTable obj = new MultiplicationTable();
        obj.printRes(5);
    }
}
