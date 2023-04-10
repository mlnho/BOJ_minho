class Solution {
    public int solution(int n) {
        int answer = 0;
        int slice = 7;
        
        if(n % slice == 0){
            answer = n/slice;
        } else  {
            answer = (n/slice) + 1;
        }
        
        
        return answer;
    }
}