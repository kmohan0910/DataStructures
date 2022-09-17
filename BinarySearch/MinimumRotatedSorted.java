public class MinimumRotatedSorted {
    public static void main(String[] args) {
        Solution ans= new Solution();
        int[] arr= {5, 1,2, 3, 4};
        int pivot= ans.findPivot(arr ,0 , arr.length-1);
        if (pivot==-1) System.out.print(arr[0]);
        else System.out.print(arr[pivot+1]);
    }
    public int findPivot(int[] nums ,int start , int end){
        int mid ;
        while(start<= end){
            mid= start+ (end-start)/2;
            if ( mid < end && nums[ mid] > nums[mid+1]){
                return mid;
            }
            if ( mid > start && nums[mid]< nums[mid-1]){
                return mid-1;
            }
            if ( nums[mid]>= nums[start]){
                start=mid+1;
            }else{
                end= mid-1;
            }
            
        }return -1;
    }
}
