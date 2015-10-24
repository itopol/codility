package Lesson1;

/**
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
 * <p/>
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 * <p/>
 * Write a function:
 * <p/>
 * class Solution { public int solution(int X, int Y, int D); }
 * <p/>
 * that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
 * <p/>
 * For example, given:
 * <p/>
 * X = 10
 * Y = 85
 * D = 30
 * <p/>
 * the function should return 3, because the frog will be positioned as follows:
 * <p/>
 * after the first jump, at position 10 + 30 = 40
 * after the second jump, at position 10 + 30 + 30 = 70
 * after the third jump, at position 10 + 30 + 30 + 30 = 100
 * <p/>
 * Assume that:
 * <p/>
 * X, Y and D are integers within the range [1..1,000,000,000];
 * X ≤ Y.
 * <p/>
 * Complexity:
 * <p/>
 * expected worst-case time complexity is O(1);
 * expected worst-case space complexity is O(1).
 */
public class FrogJmp {

    public static int solution(int X, int Y, int D) {
        int rest = (Y - X) % D;
        int res = (Y - X) / D;
        if (rest > 0) {
            return res + 1;
        } else {
            return res;
        }
    }

//    public int solution(int X, int Y, int D) {
//        return ((Y - X) + D - 1)/D;
//    }

    public static void main(String[] args) {
//        System.out.println(solution(85, 85, 30));
        int i;
        int j;
        for (i = 0, j = 0; j < 1; ++j, i++) {
            System.out.println(i + " " + j);
        }
        System.out.println(i + " " + j);
    }
}
