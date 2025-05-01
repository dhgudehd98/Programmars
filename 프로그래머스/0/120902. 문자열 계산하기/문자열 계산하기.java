class Solution {
    public int solution(String my_string) {
        String[] array = my_string.split(" ");
       int answer = Integer.parseInt(array[0]);

        for (int i = 1; i < array.length-1; i+=2) {
            String operator = array[i];
            int num = Integer.parseInt(array[i + 1]);

            if (operator.equals("+")) {
                answer += num;
            } else {
                answer -= num;
            }
        }
        
        return answer;
    }
}