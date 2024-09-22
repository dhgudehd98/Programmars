class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] str = my_string.split("");
        String tmp = "";
        StringBuilder stringBuilder = new StringBuilder();
        
        tmp = str[num1];
        str[num1] = str[num2];
        str[num2] = tmp;

        for (String x : str) {
            stringBuilder.append(x);
        }
        answer = String.valueOf(stringBuilder);
        
        return answer;
    }
}