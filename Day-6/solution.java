public class solution {

    private static int maxProfit(int[] arr) {
        int maxProfit = 0;
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i]-min);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int [] arr1 = {7,1,5,3,6,4};
        int [] arr2 = {7,6,4,3,1};

        System.out.println(maxProfit(arr1));
        System.out.println(maxProfit(arr2));
    }
}