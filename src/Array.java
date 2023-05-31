public class Array {
    public static int min(int[] a) {
        int min = a[0];
        for(int n: a) {
            if (n < min) min = n;
        }
        return min;
    }
    public static int max (int[] a) {
        int max = 0;
        for(int n: a) {
            if (n > max) max = n;
        }
        return max;
    }
    public static double average(int[] a) {
        double avg = 0;
        int sum = 0;
        for(int n: a) {
            sum +=n;
        }
        avg = (double) sum/a.length;
        return avg;
    }
}
