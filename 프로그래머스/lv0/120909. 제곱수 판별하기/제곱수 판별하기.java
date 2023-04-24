
class Solution {
    public int solution( int n) {
        int result = 0;
       
        int i = (int)Math.sqrt(n);
        
        if(i * i == n){
            result = 1;
        } else {
            result = 2;
        }
        
       return result;
    }
}