package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int fibPrv=0;
        int fibCur=1;
        int fibNew = 0;
        System.out.println("Fibonacci Series");
        System.out.println("1, "+fibPrv);
        System.out.println("2, "+fibCur);
        for (int i=3;i<41;i++){
            fibNew = fibPrv+fibCur;
            System.out.println(i+", "+fibNew);
            fibPrv = fibCur;
            fibCur = fibNew;
        }

    }
}