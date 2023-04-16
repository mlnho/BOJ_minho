class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while (num != 1) {
			if (num % 2 == 0)
				num /= 2; // n을 2로 나누고 다시 n에 할당시키는 것이다!!! 16 -> 8 -> 4...이런것들 계속 나눠야하기 위해서
			else
				num = num * 3 + 1;
			answer++;
		}
        
        
        if(answer>500){
            answer = -1;
        }
        
        
        return answer;
    }
}