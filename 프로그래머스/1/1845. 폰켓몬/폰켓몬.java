import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        HashSet<Integer> hs = new HashSet<>();
        for(int n : nums){
            hs.add(n);
        }
        
        if(hs.size() < max){
            max = hs.size();
        }
        return max;
    }
}