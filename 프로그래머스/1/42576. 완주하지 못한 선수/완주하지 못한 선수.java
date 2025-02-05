import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        // 참가자, 1 만들기
        for(String p : participant) hm.put(p, hm.getOrDefault(p,0) + 1);
        // 완주자, 0 만들기
        for(String c : completion) hm.put(c, hm.get(c) - 1);
        
        for(String player : hm.keySet()){
            if(hm.get(player) == 1){
                answer = player;
            }
        }
        return answer;
    }
}