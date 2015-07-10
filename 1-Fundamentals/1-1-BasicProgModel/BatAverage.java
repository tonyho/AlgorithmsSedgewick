public class BatAverage{
    public static void main(String[] args) {
        String name = StdIn.readString();
        int number = StdIn.readInt();
        int total = StdIn.readInt();
        StdOut.printf("name:%s,average=%.3f\n", name, (double)total/number);
    }
}
