public class Solution07 {
    public String solution(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean toUpper = true;
        for (char c : s.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                stringBuilder.append(c);
                toUpper = true;
            } else {
                if (toUpper) {
                    stringBuilder.append(Character.toUpperCase(c));
                } else {
                    stringBuilder.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }
        String answer = stringBuilder.toString();
        return answer;
    }
}
