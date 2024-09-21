class Solution {
    public int solution(int slice, int n) {
        // slice : 피자 조각 수 , n : 피자를 먹는 사람 수 
        int answer = 0;
        int pizza = n %slice == 0 ? n/slice : n/slice + 1;
        answer = pizza;
        return answer;
    }
}