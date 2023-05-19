class Solution {
    public String solution(String my_string) {
        String answer = "";
    
        
        //my_string을 배열에 담자! 
        String [] arr = my_string.split("");
    
        for(int i=0; i<arr.length; i++){
            if(!answer.contains(arr[i])){
                answer += arr[i];
            }
        }
        
        
    
        return answer;
    }
}