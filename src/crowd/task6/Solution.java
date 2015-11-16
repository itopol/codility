package crowd.task6;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: igortopol
 * Date: 11/15/15
 * Time: 2:37 PM
 */
class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{100, 250}));
        System.out.println(solution(new int[]{100, 250, 1000}));
        System.out.println(solution(new int[]{100, 250, 1000, 1300}));

    }

    public static int solution(int[] a) {
        int sum = 0;

        if (a.length <= 2) {
            for (int i : a) {
                sum += i;
            }
            return sum;
        }


        Arrays.sort(a);
        int prevSum = a[0] + a[1];
        for (int i = 2; i < a.length; i++) {
            sum = a[i] + 2 * prevSum;
            prevSum = sum;

        }
        return sum;
    }


}