package crowd.task2;

/**
 * Created with IntelliJ IDEA.
 * User: igortopol
 * Date: 10/25/15
 * Time: 7:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {


    public static void main(String[] args) {
//        System.out.println(solution(new int[]{1, 1, 3, 3, 3, 4, 5, 5, 5, 5, 6,6,6,6,6,6,6,6,6,6}, 4));
        System.out.println(solution(new int[]{1, 1, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, 0));

    }

    static int solution(int[] A, int K) {
        int n = A.length;
        int best = 0;
        int count = 1;
        for (int i = 0; i < n - K - 1; i++) {
            if (A[i] == A[i + 1] && (A[i] != A[n - 1] || K == 0)) {

                count = count + 1;
            } else {
                count = 1;
            }

            if (count > best) {
                best = count;
            }
        }

        int result = best + K;

        return result;
    }

}
