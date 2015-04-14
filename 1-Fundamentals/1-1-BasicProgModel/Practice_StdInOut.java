/**
 * Created by hexiongjun on 4/14/15.
 *
 * Usage: in idea, use the Ctrl+shift+F9 to build
 *      then use the Ctrl + Shift + F10 to run the program
 *      After that, input some double value in the run window, and use the enter to terminate the input
 *      And enter/Ctrl+d again to pass the Stdin.isEmpty
 *      This is different between the Intellij idea run window and terminal, in the terminal use the ctrl+d instead
 *
 *      Other method is use the echo and pipe to pass the number to program:
 *          echo 12.3 23.2 543.4 | java XXXXX Practice_StdInOut
 *
 * Notice: Donot use the Ctrl+d to terminate the input of numbers, for the Ctrl+d means the end of file
 */
public class Practice_StdInOut {
    public static void main(String[] args){
        StdOut.println("Here we go");
        StdOut.println("Please input some double number");

        double[] a;
        a = new double[10];
        int index = 0;

        StdOut.println("Now Reading the numbers");
        while (!StdIn.isEmpty()){
            a[index] = StdIn.readDouble();
            StdOut.println(a[index]);
            index++;
        }

        StdOut.println("Read finish" + "\ttotal read number =" + index);

        for (int i = 0; i<a.length; i++){
            StdOut.println("index=" + i + "\t" + a[i]);
        }
    }
}
