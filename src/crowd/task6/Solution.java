package crowd.task6;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: igortopol
 * Date: 11/15/15
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 */
class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{100, 250, 1000, 1300}));
    }

    public static int solution(int[] a) {
        int sum = 0;
        int prev_sum = a[0] + a[1];
        Arrays.sort(a);
        for (int i = 2; i < a.length; i++) {
            sum = a[i] + 2 * prev_sum;
            prev_sum = sum;

        }
        return sum;
    }


}