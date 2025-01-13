import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < array.length; i++){
            int num = array[i]; // map 의 key
            int sum = 0;    // map 의 value
            for(int j = 0; j < array.length; j++){
                if(array[j] == num) sum++;
            }
            map.put(num, sum);
        }
        
        // map의 value가 가장 큰 key 찾아내기
        int max = Integer.MIN_VALUE;
        boolean isDuplicate = false;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                answer = entry.getKey();
                isDuplicate = false;
            } else if(entry.getValue() == max){
                isDuplicate = true;
            }
        }
        
        if(isDuplicate){
            answer = -1;
        }

        return answer;
    }
}