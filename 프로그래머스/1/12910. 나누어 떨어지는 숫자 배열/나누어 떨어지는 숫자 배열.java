import java.util.*;
class Solution {
    public Integer[] solution(int[] arr, int divisor) {
        // int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        
        // 없으면 -1 반환
        if(list.size() == 0) list.add(-1);
        
        Collections.sort(list);
        Integer[] answer = list.toArray(new Integer[0]);
        return answer;
    }
}