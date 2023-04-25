import java.util.ArrayList;
import java.util.List;

public class Solution17 {

    private static final char[] CHARS = "AEIOU".toCharArray();
    public int solution(String word) {
        List<String> words = new ArrayList<>();
        generate("", words);
        return words.indexOf(word);
    }

    private List<String> generate(String word) {
        List<String> words = new ArrayList<>();
        words.add(word);
        if (word.length() == 5) {
            return words;
        }
        for (char c : CHARS) {
            words.addAll(generate(word + c));
        }
        return words;
    }

    private void generate(String word, List<String> words) {
        words.add(word);
        if (word.length() == 5) {
            return;
        }
        for (char c : CHARS) {
            generate(word + c, words);
        }
    }
}
