import java.util.ArrayList;
import java.util.List;

public class Solution16 {
    public int[][] solution(int n) {
        List<int[]> process = new ArrayList<>();
        hanoi(n, 1, 3, process);
        return process.toArray(new int[0][]);
    }

    public List<int[]> hanoi(int n, int from, int to) {
        if (n == 1) {
            return List.of(new int[]{from, to});
        }
        int empty = 6 - from - to;
        List<int[]> result = new ArrayList<>();
        result.addAll(hanoi(n - 1, from, empty));
        result.addAll(hanoi(1, from, to));
        result.addAll(hanoi(n - 1, empty, to));
        return result;
    }

    public void hanoi(int n, int from, int to, List<int[]> process) {
        if (n == 1) {
            process.add(new int[]{from, to});
            return;
        }
        int empty = 6 - from - to;
        hanoi(n - 1, from, empty, process);
        hanoi(1, from, to, process);
        hanoi(n - 1, empty, to, process);
    }
}