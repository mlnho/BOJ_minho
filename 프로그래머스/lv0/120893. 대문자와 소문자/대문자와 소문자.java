import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String result = "";
        
     
         for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) {
                result += (char)(my_string.charAt(i) + 32);
            } else if (my_string.charAt(i) >= 97 && (int) my_string.charAt(i) <= 122){
                result += (char) (my_string.charAt(i) - 32);
            }
        }

        
        
        return result;
    }
}