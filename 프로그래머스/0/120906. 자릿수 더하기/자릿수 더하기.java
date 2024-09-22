class Solution {
    public int solution(int n) {
        //1. String 형으로 변경해서 푸는 방법 
        int answer = 0; // 각 자릿수의 합을 저장하는 변수
        String str = String.valueOf(n);
        String[] array = str.split("");
        
        for(int i = 0; i< array.length; i++){
            answer += Integer.parseInt(array[i]);
        }
        
        
        return answer;
    }
}