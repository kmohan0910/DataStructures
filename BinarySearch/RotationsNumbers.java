public class RotationsNumbers {
    public static void main(String[] args) {
        Solution ans= new Solution();
        int[] arr= {5, 1,2, 3, 4};
        System.out.println(ans.findKRotation(arr , 5));
    }
}
class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int ans= findPivot(arr, 0 , n-1);
        return ans+1;


    }
    int findPivot( int arr[], int start, int end){
        int mid ;
        while(start< end){
            mid= start+ (end- start)/2;
            if (mid < end && arr[mid]> arr[mid+1]){
                // if mid is greater than the next element than the current element is pivot;
                return mid;
            }
            if ( mid > start && arr[mid ]< arr[mid-1]){
                //if previous element is greater than the current element then previous element is the pivot;
                return mid-1;

            }
            if ( arr[ mid ] < arr[0]){
                //if mid is less than the start of the array then we are in the second section of the array i.e non rotated
                end= mid-1;
            }else{
                start= mid+1;
            }

        }
        return -1;
    }
}