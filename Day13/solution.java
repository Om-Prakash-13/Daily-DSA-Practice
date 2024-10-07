package Day13;

public class solution {
    public static int findPages(int[] arr, int m){
        int n = arr.length;
        if(n < m) return -1;
        int max = arr[0], sum = 0;
        for(int i = 0; i<n; i++){
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        int ans = sum;
        int lo = max;
        int hi = sum;

        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(isValid(arr,mid,m)){
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid +1;
            }
        }

        return ans;
    }
    private static boolean isValid(int[] arr, int mid, int m) {
        int s = 0;
        int currentPage = 0;
        for(int i = 0; i < arr.length;){
            currentPage += arr[i];
            if(currentPage <= mid){
                i++;
            }else{
                s++;
                currentPage = 0;
            }
        }
        s++;
        if(s <= m) return true;
        return false;
    }
    public static void main(String[] args) {
        int pages[] = {12, 34, 67, 90};
        int M = 2;
        System.out.println(findPages(pages, M));
        int pages2[] = {15, 17, 20};
        M = 2;
        System.out.println(findPages(pages2, M));
        int pages3[] = {12, 34, 67, 90};
        M = 5;
        System.out.println(findPages(pages3, M));
    }
}
