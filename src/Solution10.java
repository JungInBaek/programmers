public class Solution10 {
    public int[] solution(String s) {
        int change = 0;
        int remove = 0;
        while (!s.equals("1")) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    remove++;
                } else {
                    stringBuilder.append(c);
                }
            }
            s = Integer.toString(stringBuilder.toString().length(), 2);
            change++;
        }
        int[] answer = {change, remove};
        return answer;
    }
}
