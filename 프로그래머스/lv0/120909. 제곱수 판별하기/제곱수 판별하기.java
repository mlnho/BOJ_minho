
class Solution {
    public int solution( int n) {
        int result = 0;
       
        if(n%(int)Math.sqrt(n)==0){
            return 1;
        } else {
            return 2;
        }
     
    }
}