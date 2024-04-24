class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        // 맞은 갯수
        int right = 0;
        // 0 의 갯수
        int zero = 0;

        for(int a : lottos){
            for(int b : win_nums){
                if( a == b){
                    right++;
                }
            }
        }
        System.out.println("right : " + right);

        // 0 의 갯수
        for(int a : lottos){
            if(a == 0){
                zero++;
            }
        }
        System.out.println(zero);

        // 0이 다 맞을 경우
        int max = rankingCheck(right + zero);

        // 0 이 다 틀릴 경우
        int min = rankingCheck(right);

        answer[0] = max;
        answer[1] = min;

        return answer;
    }
    
    public int rankingCheck(int x){
        int ranking;
        switch (x){
            case 6 : return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}

