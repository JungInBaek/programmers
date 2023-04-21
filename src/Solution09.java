public class Solution09 {
    public int solution(int n) {
        String num = Integer.toString(n, 3);
        String reversed = new StringBuilder(num).reverse().toString();
        int answer = Integer.parseInt(reversed, 3);
        return answer;
    }
}
