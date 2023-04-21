public class Solution12 {
    public int solution(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < num.length; i++) {
            if (s.contains(num[i])) {
                s = s.replaceAll(num[i], Integer.toString(i));
            }
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
}
