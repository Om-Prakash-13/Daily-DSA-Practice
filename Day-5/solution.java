public class solution {
    private static double myPow(double x, int n){
        double ans = 1.0;
        if(n < 0){
            x = 1/x;
            n *= -1;
        }
        for(int i = 1; i <= n; i++){
            ans *= x;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));//1024.00000
        System.out.println(myPow(2.10000, 3));//9.26100
        System.out.println(myPow(2.00000, -2));//0.25000
    }
}