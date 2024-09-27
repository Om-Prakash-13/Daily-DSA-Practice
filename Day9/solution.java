package Day9;

public class solution {
    public static void reduce(int[] arr){
        int n = arr.length;
        int lastMin = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j = 0; j < n; j++){
                if(arr[j] > lastMin && arr[j] <= min){
                    min = arr[j];
                    mindex = j;
                }
            }
            arr[mindex] = -i;
            lastMin = min;
        }
    }
    public static void main(String[] args) {
        int arr1[] = {10, 40, 20};
        int arr2[] = {5, 10, 40, 30, 20};

        reduce(arr1);
        reduce(arr2);

        print(arr1);
        print(arr2);
    }

    private static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }System.out.println();
    }
}