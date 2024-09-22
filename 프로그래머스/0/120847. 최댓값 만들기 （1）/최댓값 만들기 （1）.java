class Solution {
    public int solution(int[] numbers) {
        int answer = 0; // 최대값을 저장하는 변수 
        int multi = 0; // 곱을 저장하는 변수 
        
        for(int i = 0; i<numbers.length-1; i++){
            for(int j = i+1; j< numbers.length; j++){
                multi = numbers[i] * numbers[j];
                
                if(multi > answer) answer = multi;
            }
        }
        return answer;
    }
}