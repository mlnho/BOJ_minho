class Solution {
    public boolean solution(int x) {
        boolean answer = true;
      
        //정수를 문자열로 변환
		String str = Integer.toString(x);
		
		//문자을  split을 통해서 나누고 arr 배열에 담았다. 
		String [] arr = str.split("");
		
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + Integer.parseInt(arr[i]);
		}
		
		if(x%sum == 0) {
			answer = true;
		} else {
			answer = false;
		}
        
        
        
        return answer;
    }
}