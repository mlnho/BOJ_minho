import java.util.Arrays;
class Solution {
    public int[][] solution(int[] num_list, int n) {
        
        
       int [][] answer = new int[num_list.length/n][n];
        System.out.println(answer.length);
        int count = 0;
        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[count];
                count++;
            }
        }
            return answer;
        }
    }