package Day14;

public class solution {

    private static boolean isSufficient(int[] arr, long mid, int k){
        long timeTaken = 0;
        long painter = 0;
        for(int i = 0; i < arr.length;){
            timeTaken += arr[i];
            if(timeTaken <= mid){
                i++;
            }else{
                painter ++;
                timeTaken = 0;
            }
        }
        painter ++;

        if(painter <= k) return true;
        return false;
        
    }

    private static long minTime(int[] arr,int k){
        int n = arr.length;
        long max = arr[0], sum = 0, ans;
        for(int i = 0; i<n; i++){
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        long lo = max;
        long hi = ans = sum;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if(isSufficient(arr,mid,k)){
                ans = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(minTime(new int[]{5,10,30,20,15}, 3));
        System.out.println(minTime(new int[]{10,20,30,40}, 2));
    }
}
