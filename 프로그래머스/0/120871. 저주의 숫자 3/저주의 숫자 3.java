class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        
        for(int i = 1; i<=n; i++){
            num ++;
            
            // num이 3의 배수이거나 , num에 3이 들어가 있으면 없을 때까지 num 값 증가시키기
            while(num % 3 == 0 || String.valueOf(num).contains("3")){
                num++;
            }
            if(i == n) answer = num;
        }
        return answer;
    }
}