class solution {
    public static int majorityElement(int[] arr) {
        int ans = arr[0];
        int freq = 0;
        
        for(int ele : arr){
            if(freq == 0){
                ans = ele;
            }
            if(ans == ele){
                freq ++;
            }
            else{
                freq --;
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