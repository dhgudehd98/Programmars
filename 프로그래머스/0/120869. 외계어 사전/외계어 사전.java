import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        
        String sp = String.join("",spell);
        
        for(String x : dic){
            char[] ch = x.toCharArray();
            Arrays.sort(ch);
            String d = new String(ch);
            
            if(d.equals(sp)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}