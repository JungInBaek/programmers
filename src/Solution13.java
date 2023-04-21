public class Solution13 {
    public boolean solution(String s) {
        if (s.matches("[0-9]{4}") || s.matches("[0-9]{6}")) {
            return true;
        }
        return false;
    }
}
