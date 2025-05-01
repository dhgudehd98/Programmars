package Lv0;

public class _30합성수찾기 {
    public static void main(String[] args) {
       int n = 10;
       int answer = 0;
       int cnt = 0; //

        for (int i = 1; i <= n; i++) {
            cnt = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    cnt++;
                    if(cnt >= 3) {
                        answer ++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);

    }




}