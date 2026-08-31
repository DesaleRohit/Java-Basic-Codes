public class PowerOfTwo {
    public  static boolean isPowerOfTwo(int n) {

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }

        return n == 1;

    }

    public static void main(String[] args) {
        int n = 16; // power of two are 1, 2, 4, 8, 16, 32, 64...
        System.out.println(isPowerOfTwo(n));
    }
}
