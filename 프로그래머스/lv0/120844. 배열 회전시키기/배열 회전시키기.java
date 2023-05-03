class Solution {
    public int[] solution(int[] numbers, String direction) {

        		int[] answer = new int[numbers.length];
        
	for (int i = 0; i < answer.length - 1; i++) {
			if (direction.equals("left")) {
				answer[i] = numbers[i + 1];
				answer[answer.length - 1] = numbers[0];
			} else if (direction.equals("right")) {
				for (int j = 1; j < answer.length; j++) {
					answer[0] = numbers[numbers.length - 1];
					answer[j] = numbers[j - 1];
				}
			}

		}
        return answer;
    }
}