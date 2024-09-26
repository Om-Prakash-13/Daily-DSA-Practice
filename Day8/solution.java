public class solution {
    private static int[] productExceptSelf(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = 1;

        int prefixProduct = arr[0];
        for(int i = 1; i<ans.length; i++){
            ans[i] = prefixProduct;
            prefixProduct *= arr[i];
        }

        int suffixProduct = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            ans[i] *= suffixProduct;
            suffixProduct *= arr[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {-1,1,0,-3,3};

        printArray(productExceptSelf(arr1));
        printArray(productExceptSelf(arr2));
    }

    private static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
