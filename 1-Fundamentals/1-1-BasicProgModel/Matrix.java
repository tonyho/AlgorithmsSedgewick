/*************************************************************************
 *  Compilation:  javac Matrix.java
 *  Execution:    java Matrix < data.txt
 *  Dependencies: StdIn.java StdOut.java
 *  
 *  Reads in a sequence of real numbers, and computes their average.
 *
 *  % java Matrix
 *  10.0 5.0 6.0
 *  3.0 7.0 32.0
 *  <Ctrl-d>
 *  Matrix is 10.5

 *  Note <Ctrl-d> signifies the end of file on Unix.
 *  On windows use <Ctrl-z>.
 *
 *************************************************************************/
import java.util.*;

public class Matrix { 
    public static void main(String[] args) { 
        int i = 30;
        int j = 40;
        boolean [][] a = new boolean [i][j];
        Random r = new Random();

        int trueNum=0;
        int ii = 0, jj=0;
        //StdRandom.setSeed(1);
        for (ii=0; ii<i; ii++){
            StdOut.printf("%3d|",ii);
            for (jj=0; jj<j; jj++){
                //a[ii][jj] = (boolean)((int)(StdRandom.random() + 0.5));
                //a[ii][jj] = ((StdRandom.random() + 0.5));
                a[ii][jj] = r.nextBoolean();
                if (true == a[ii][jj]){
                    StdOut.printf("*");
                    trueNum++;
                } else {
                    StdOut.printf(" ");
                }
            }
            StdOut.printf("|\n");
        }
        StdOut.printf("\nTrue percent: %.2f%%\n",(trueNum*100.0/(i*j)));
    }
}
