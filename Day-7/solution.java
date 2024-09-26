public class solution {

    private static int maxArea(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int maxArea = 0;

        while (i<j) {
            int height = Math.min(arr[i], arr[j]);
            int width = Math.abs(j-i);
            int area = height * width;
            maxArea = Math.max(maxArea, area);
            if(arr[i] < arr[j]) i++;
            else j--;
        }

        return maxArea;
    }
    public static void main(String[] args) {
        int [] arr1 = {1,8,6,2,5,4,8,3,7};
        int [] arr2 = {1,1};

        System.out.println(maxArea(arr1));
        System.out.println(maxArea(arr2));
    }
}
