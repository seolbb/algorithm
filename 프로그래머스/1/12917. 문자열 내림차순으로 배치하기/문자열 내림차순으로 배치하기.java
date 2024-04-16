import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        // 내림차순하는방법 구글링
        Arrays.sort(str, Collections.reverseOrder());
        
        for(String a : str)
           answer += a;
        
        return answer;
    }
}