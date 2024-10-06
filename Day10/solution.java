package Day10;

public class solution {
    
    private static int search(int[] arr,int target){
        int n = arr.length - 1;
        int lo = 0;
        int hi = n-1;

        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] <= n - 1){ // mid is in right sorted part.
                if(arr[mid] < target && arr[hi] >= target) lo = mid + 1;
                else hi = mid - 1;
            }else{ // mid is in left sorted part
                if(arr[mid] > target && arr[lo] <= target) hi = mid - 1;
                else lo = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr1; int target;
        arr1 = new int[]{4,5,6,7,0,1,2};
        target = 0;
        System.out.println(search(arr1,target));
        arr1 = new int[]{4,5,6,7,0,1,2};
        target = 3;
        System.out.println(search(arr1,target));
        arr1 = new int[]{1};
        target = 0;
        System.out.println(search(arr1,target));
    }
}
