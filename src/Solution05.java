public class Solution05 {
    public int[] solution(long n) {
        String num = Long.toString(n);
        String reverse = new StringBuilder(num).reverse().toString();
        char[] arr = reverse.toCharArray();
        int[] answer = new int[arr.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Character.getNumericValue(arr[i]);
        }
        return answer;
    }
}
