import java.util.Arrays;
class solution {
    public static int majorityElement(int[] arr) {
        Arrays.sort(arr);
        int b = 0;
        int e = 0;
        int ans = arr[0];
        while (e < arr.length) {
            if(arr[b] == arr[e]){
                e++;
                if(e == arr.length-1){
                    ans = arr[e];
                    break;
                }
            }
            else{
                if(e-b > arr.length/2){
                    ans = arr[b];
                    break;
                }
                else{
                    b = e;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr1[] = {3,2,3};
        int arr2[] = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(arr1));
        System.out.println(majorityElement(arr2));
    }
    
}