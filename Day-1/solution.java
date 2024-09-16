public class solution {

    public static void printArray(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void sortColors(int[] arr) {
        int l = 0, m = 0, h = arr.length-1;
        while(m <= h){
            if(arr[m] == 0){
                swap(arr,m,l);
                l++;
                m++;
            }
            else if(arr[m] == 1) {
                m++;
            }
            else if(arr[m]== 2){
                swap(arr,m,h);
                h--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        int[] arr2 = {2,0,1};

        sortColors(arr);
        sortColors(arr2);

        printArray(arr);
        printArray(arr2);
    }
}