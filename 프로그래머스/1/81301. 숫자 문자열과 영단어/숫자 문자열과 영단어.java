class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = s;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i <= 9 ; i++){
            str = str.replace(num[i], Integer.toString(i));
        }
        
        answer =  Integer.parseInt(str);
        
        return answer;
    }
}