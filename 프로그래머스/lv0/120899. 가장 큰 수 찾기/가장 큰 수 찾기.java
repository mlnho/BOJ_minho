class Solution {
    public int[] solution(int[] array) {
        
	int[] result = new int[2]; // 최종적으로 담을 배열
   	for (int i = 0; i < array.length; i++) {
			if (array[i] > result[0]) {
				result[0] = array[i];
				result[1] = i;
			}

		}
        
       
        
         return result;
    }
}