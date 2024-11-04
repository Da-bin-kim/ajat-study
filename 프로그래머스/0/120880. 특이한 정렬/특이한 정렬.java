class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = numlist;
    
        for (int i = 1; i < answer.length ; i++){
            int j = i-1;
            int target = answer[i];
            int d = Math.abs(answer[i] - n);
            int d2 = Math.abs(answer[j] - n);
            
            while(j >= 0 && (d2 > d || (d2 == d && answer[j] < target))){
    
                answer[j+1] = answer[j];
                j--;
                if (j >= 0) {
                    d2 = Math.abs(answer[j] - n);
                }
            }
            answer[j+1] = target;
            
        }
        return answer;
    }
}