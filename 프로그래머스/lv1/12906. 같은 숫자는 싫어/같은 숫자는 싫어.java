import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> resultList = new ArrayList<>();
        
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i+1]) {
                resultList.add(arr[i]);
            }
        }
        resultList.add(arr[arr.length-1]);

        int[] answer = new int[resultList.size()];
        
        for(int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}