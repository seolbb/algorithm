class Solution {
    public long solution(long n) {
        String answer = "";

        // 한글자씩 쪼갠 string[] -> long[]
        String[] arr = String.valueOf(n).split("");
        long[] larr = new long[arr.length];
        for(int i = 0; i < arr.length; i++){
            larr[i] = Long.parseLong(arr[i]);
        }
        
        // 큰것부터 정렬
        for (int i = 0; i < larr.length; i++) {
            for (int j = i + 1; j < larr.length; j++) {
                if (larr[i] < larr[j]) {
                    long temp = larr[i];
                    larr[i] = larr[j];
                    larr[j] = temp;
                }
            }
        }
        
        
        for(int i = 0; i < larr.length; i++){
            answer += larr[i];
        }

        
        return Long.parseLong(answer);
    }
}