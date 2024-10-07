package Day12;
public class solution {
    public static int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];

        int lo = 0;
        int hi = n-1;

        if(arr[lo] != arr[lo+1]) return arr[lo];
        if(arr[hi] != arr[hi-1]) return arr[hi];

        while(lo <= hi){
            int m = lo + (hi-lo)/2;
            int m1 = m-1;
            int m2 = m+1;

            if(arr[m] != arr[m1] && arr[m] != arr[m2]) return arr[m];

            else{
                if(arr[m] == arr[m1]) m1--;
                else m2++;
                int left = m1-lo+1;
                if(left % 2 != 0) hi = m1;
                else lo = m2;
            }

        }
        
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,3,4,4,8,8};
        int[] arr2 = {3,3,7,7,10,11,11};
        int[] arr3 = {1};
        int[] arr4 = {1,1,2,2,3};

        System.out.println(singleNonDuplicate(arr1));
        System.out.println(singleNonDuplicate(arr2));
        System.out.println(singleNonDuplicate(arr3));
        System.out.println(singleNonDuplicate(arr4));
    }
}