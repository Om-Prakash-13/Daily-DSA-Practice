public class solution {
    private static double myPow(double x, int n){
        // Some Base case for bets time complexity.
        if(x == 0) return 0;
        if(x == 1 || n == 0 || (x == -1 && n % 2 == 0)) return 1;
        if(n == 1) return x;
        if(n == -1) return 1/x;
        if(x == -1 && n % 2 != 0) return -1;

        double ans = 1.0;
        if(n < 0){
            x = 1/x;
            n *= -1;
        }
        while (n != 0) {
            if(n % 2 == 1) ans *= x;
            x *= x;
            n /= 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));//1024.00000
        System.out.println(myPow(2.10000, 3));//9.26100
        System.out.println(myPow(2.00000, -2));//0.25000
    }
}