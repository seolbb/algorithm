import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] str = Integer.toString(n).split("");
        
        for(String i : str){
            answer += Integer.parseInt(i);
        }

        return answer;
    }
}