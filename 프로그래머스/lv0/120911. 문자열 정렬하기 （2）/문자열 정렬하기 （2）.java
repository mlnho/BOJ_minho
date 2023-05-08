import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
     

        // 소문자 만들기 + 배열에 담기 (println로 검토해보기)
        char [] arr = my_string.toLowerCase().toCharArray(); 
        
        // 3. 정렬하기 (오름차순)
        Arrays.sort(arr);
        answer = new String(arr);
        
        return answer;
         
         
         
    }
}