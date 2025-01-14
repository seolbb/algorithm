class Solution {
    public int solution(int n) {
        int answer = 0;
        // 6과 n의 최대공약수를 구하기
        int gcdNum = gcd(6, n);
        // n을 최대공약수로 나누기
        answer = n / gcdNum;
        return answer;
    }
    
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        } else {
            return gcd(b, a%b);
        }
    }
    
}