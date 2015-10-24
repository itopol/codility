package Lesson2;

public class FrogRiverOne {
    public static void main(String[] args) {
        int a[] = new int[]{5};
        System.out.println(solution(5, a));
    }

    public static int solution(int X, int[] A) {
        boolean[] v = new boolean[X + 1];

        long count = 0;

        for (int i = 0; i < A.length; i++) {
            if (!v[A[i]]) {
                v[A[i]] = true;
                count++;
            }

            if (count >= X) {
                return i;
            }
        }

        return -1;
    }
}
