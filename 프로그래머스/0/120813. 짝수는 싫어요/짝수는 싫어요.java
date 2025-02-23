import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        if(n % 2 == 0){ // n이 짝수일때
            answer = new int[n/2];
        } else {    // n이 홀수일때
            answer = new int[n/2+1];
        }
        
        answer[0] = 1;
        for(int i = 1; i < answer.length; i++){
            answer[i] = answer[i-1] + 2;
        }

        return answer;
    }
}