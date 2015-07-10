public class BatAverage{
    public static void main(String[] args) {
        while (!StdIn.isEmpty()){
            String name = StdIn.readString();
            int number = StdIn.readInt();
            int total = StdIn.readInt();
            StdOut.printf("%s  %d  %d %.3f\n", name, total, number, (double)total/number);
        }
    }
}
