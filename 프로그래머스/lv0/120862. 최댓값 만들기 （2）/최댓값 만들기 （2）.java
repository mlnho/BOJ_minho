class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
      
   	for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[j] < numbers[j + 1]) {
					int tmp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tmp;
				}
			}

		}
		int a1 = numbers[0] * numbers[1];
		int a2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
		if (a1 > a2) {
			answer = a1;
		} else {
			answer = a2;
		}
        
        return answer;
    }
}