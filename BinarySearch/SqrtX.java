public class SqrtX {
    public static void main(String[] args) {
        SqrtX obj = new SqrtX();
        System.out.println(obj.mySqrt(6));
        
    }
    public int mySqrt(int x) {
        if (x < 2){
            return x;
        }
        int start=1 , end= x;
        int mid;
        while(true){
            mid= start+ (end-start)/2;//y<= √x: y^2 <= x; y<=x/2
            if (mid>x/mid){
                end= mid-1;// if y is greater than y/x then decrease end= y-1;
            }
            else if( (mid+1)>x/(mid+1)){
                return mid; // y is less than x/y checking if y+1<x/y+1 ( more closer ans exists ) : if true : return y else start = y+1 
            }else {start=mid+1;}
        }


        
    }
}
