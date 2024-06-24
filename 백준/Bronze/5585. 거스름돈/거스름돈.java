import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1000 - Integer.parseInt(br.readLine()); // 620
        int result = 0;
        int[] coins = {500,100,50,10,5,1};
        int i = 0;

        while(n != 0){
            if(n / coins[i] != 0){
                result += n / coins[i];
                n %= coins[i];
            }
            i++;
        }

        System.out.println(result);
    }
}