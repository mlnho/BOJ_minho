import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
 
       
    int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			//Arrays.copyOfRange (복사할 array명, 시작index, 끝위치 index)
			int[] tmp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);

			Arrays.sort(tmp);

			answer[i] = tmp[commands[i][2] - 1];

		}
        
    
        return answer;
    }
}