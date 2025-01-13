import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int md = array.length / 2;
        int answer = array[md];
        return answer;
    }
}