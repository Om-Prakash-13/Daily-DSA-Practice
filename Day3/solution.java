public class solution {

    private static int maximumSumSubArray(int[] arr){
        int maxSum = 0;
        int currentSum = 0;
        int max = 0;

        for(int i = 0; i< arr.length; i++){
            currentSum += arr[i];
            if(currentSum < 0) currentSum = 0;
            maxSum = Math.max(maxSum, currentSum);
            max = Math.max(max, arr[i]);
        }

        if(maxSum == 0) return max;
        else return maxSum;
    }
    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {1};
        int[] nums3 = {5,4,-1,7,8};

        System.out.println(maximumSumSubArray(nums1));
        System.out.println(maximumSumSubArray(nums2));
        System.out.println(maximumSumSubArray(nums3));
    }
}