public class Solution11 {

//    boolean solution(String s) {
//        int p = 0;
//        int y = 0;
//        s = s.toLowerCase();
//        p = s.length() - s.replace("p", "").length();
//        y = s.length() - s.replace("y", "").length();
//        return p == y;
//    }

    boolean solution(String s) {
        int p = 0;
        int y = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (c == 'p') {
                p++;
            } else if (c == 'y') {
                y++;
            }
        }
        return p == y;
    }
}
