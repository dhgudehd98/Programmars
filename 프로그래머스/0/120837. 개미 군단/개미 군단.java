class Solution {
    public int solution(int hp) {
        // 장군개미 : 5, 병정개미 : 3 , 일개미 1
        // 최소한의 병력 구성하기 위해 필요한 개미 
        int answer = 0;
        int a = 5; 
        int b = 3;
        int c = 1;
       
        answer += hp / a + (hp%a) / b + (hp % a % b) / c ;
        
        return answer;
    }
}