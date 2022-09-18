public class greatestCharacter {
    public static void main(String[] args) {
        greatestCharacter obj = new greatestCharacter();
        char[] letters = {'c', 'j', 'k'};
        char target = 'l';
        System.out.print(obj.nextGreatestLetter(letters, target));
        
    }
    public char nextGreatestLetter(char[] letters, char target) {
    
        int start= 0 , end= letters.length-1;
        
        while(start<=end){
            int mid = start+ (end- start)/2;
            if ( letters[mid]> target) end= mid-1;
            else  start= mid+1;
        }
        
        return letters[start%letters.length];
    }
}
