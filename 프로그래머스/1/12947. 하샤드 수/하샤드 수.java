class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        // x를 자릿수마다 쪼개기
        // 쪼갠후 더하기
        
        String[] sarr = String.valueOf(x).split("");
        int[] iarr = new int[sarr.length];
        // String[] -> int[]
        for(int i = 0; i < sarr.length; i++){
            iarr[i] = Integer.parseInt(sarr[i]);
        }
        // 각 자릿수의 합
        int sum = 0;
        for(int i : iarr){
            sum += i;
        }
        
        if(x % sum == 0){
            return answer;
        } else {
            answer = false;
        }
        
        
        return answer;
    }
}