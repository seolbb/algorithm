class Solution {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0){
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("이게 맞아?");
    }
}