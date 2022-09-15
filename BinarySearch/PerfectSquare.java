public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(8));
    }
   
        public  static boolean isPerfectSquare(int num) {
            long start= 1 , end= num;
            long mid;
            if (num< 2 ) return true;
            while ( start<= end){
                mid= start+ (end-start)/2;
                if ( mid == num/mid && num%mid ==0) return true;
                if (mid>(num/mid)){
                    end=mid-1;
                }else{
                    start= mid+1;
                }
            }
            return false;
            
        }
    
}
