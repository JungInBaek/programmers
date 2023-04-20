import java.util.ArrayList;
import java.util.List;

public class Solution08 {
    public int solution(String s) {
        int min = Integer.MAX_VALUE;
        for (int length = 1; length <= s.length(); length++) {
            // 문자열 압축 후 가장 짧은 길이 선택
            int compressed = compress(s, length);
            if (min > compressed) {
                min = compressed;
            }
        }
        return min;
    }

    private int compress(String source, int length) {
        // 압축한 문자열의 길이 반환
        StringBuilder stringBuilder = new StringBuilder();
        String last = "";
        int count = 0;
        for (String token : split(source, length)) {
            // 압축 문자열 구성
            if (token.equals(last)) {
                count++;
            } else {
                if (count > 1) {
                    stringBuilder.append(count);
                }
                stringBuilder.append(last);
                last = token;
                count = 1;
            }
        }
        if (count > 1) {
            stringBuilder.append(count);
        }
        stringBuilder.append(last);
        String compressed = stringBuilder.toString();
        return compressed.length();
    }

    private List<String> split(String source, int length) {
        List<String> tokens = new ArrayList<>();
        // source를 length만큼씩 잘라 tokens 리스트에 추가
        for (int beginIndex = 0; beginIndex < source.length(); beginIndex += length) {
            int endIndex = beginIndex + length;
            if (endIndex > source.length()) {
                endIndex = source.length();
            }
            tokens.add(source.substring(beginIndex, endIndex));
        }
        return tokens;
    }
}
