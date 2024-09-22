class solution {
    public static int majorityElement(int[] arr) {
        int freq = 0;
        int ans = arr[0];
        int n = arr.length;

        for(int  i = 0; i<n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]) freq ++;
            }            
            if(freq > n/2){
                ans = arr[i];
                break;
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