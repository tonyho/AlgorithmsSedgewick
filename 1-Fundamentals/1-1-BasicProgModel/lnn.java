public class lnn {
    public static double lnn(int N){
        if (N==1) {
            return 0.0;
        }
        double Sum = (Math.log(N) + lnn(N-1));
        return Sum;
    }

    public static void main(String[] args){
        StdOut.println("Result is: " + lnn(Integer.parseInt(args[0])));

    }
}
