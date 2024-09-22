class Solution {
    public int solution(int n) {
        //2. 수학적으로 계산하는 방법
        int answer = 0; // 각 자릿수의 합을 저장하는 변수
        
        while(n > 0){
            answer += n % 10;
            n /= 10;
        }
        
        
        return answer;
    }
}