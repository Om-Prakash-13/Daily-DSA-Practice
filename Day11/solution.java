package Day11;

public class solution {
    private static int findMountain(int[] arr){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;

        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) lo = mid + 1;
            else hi = mid - 1;
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {0,1,0};
        int[] arr2 = {0,2,1,0};
        int[] arr3 = {0,10,5,2};
        
        System.out.println(findMountain(arr1));
        System.out.println(findMountain(arr2));
        System.out.println(findMountain(arr3));
    }
}