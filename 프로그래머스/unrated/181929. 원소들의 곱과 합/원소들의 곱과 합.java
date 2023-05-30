class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sumMulti = 1;
        int sum = 0;
        int multiMulti;
         for (int i = 0; i < num_list.length; i++) {
             sumMulti *= num_list[i];
              sum += num_list[i];
              multiMulti = sum*sum;
             if(sumMulti < multiMulti){
                 answer = 1;
             } else {
                 answer = 0;
             }
        }
        
        return answer;
    }
}