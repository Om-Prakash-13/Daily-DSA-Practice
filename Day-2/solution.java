public class solution {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7};
        int k1 = 3;

        int[] nums2 = {-1,-100,3,99};
        int k2 = 2;

        rotate(nums1,k1);
        rotate(nums2,k2);

        System.out.println("Example-1 :");
        printArray(nums1);
        System.out.println("Example-2 :");
        printArray(nums2);

    }

    private static void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        
    }
    private static void reverse(int[] arr, int i, int j){
        for(; i<j; i++, j--){
            swap(arr, i, j);
        }
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }System.out.println();
    }
    
}