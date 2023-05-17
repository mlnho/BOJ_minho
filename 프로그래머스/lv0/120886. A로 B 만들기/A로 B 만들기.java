import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        boolean flag = false;
		
		
		String [] arrB = before.split("");
		String [] arrA = after.split("");
		
		Arrays.sort(arrB);
		Arrays.sort(arrA);
		
		
		for(int i=0; i<arrB.length; i++ ) {
			if(arrB[i].equals(arrA[i])) {
				flag = true;
                answer = 1;
			} else {
                flag = false;
                break;
            }
		} 
		
	    if(flag == false) {
			answer = 0;
		}
 
        
        
        return answer;
    }
}