public class Solution06 {
    public String solution(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            stringBuilder.append(push(c, n));
        }
        String answer = stringBuilder.toString();
        return answer;
    }

    private char push(char c, int n) {
        if (!Character.isAlphabetic(c)) {
            return c;
        }
        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;
        position = (position + n) % ('Z' - 'A' + 1);
        return (char) (offset + position);
    }
}