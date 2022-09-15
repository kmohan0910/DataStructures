public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.print(arrangeCoins(8));
    }
    
    public static int arrangeCoins(int n) {
        if (n < 2) return n;
        long start= 2, end= n/2;
        if (n <= 3) {
            return n == 3 ? 2 : 1;
        }
        
        
        while( start <=end){
            long mid = start + (end- start)/2;
            long temp = mid*(mid+1)/2;// Calculating Number of coins that would be required upto mid rows 
            if (temp==n){
                return (int) mid;
            }
            if(temp > n){
                end= mid-1;//if number of coins required is more than decreasing the max number of rows 
            }else{
               start= mid+1;// if number of coins required is less than increasing the start of the number of rows
                
            }
        }
        return (int) end;
        
    }
}
