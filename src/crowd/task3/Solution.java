package crowd.task3;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: igortopol
 * Date: 10/25/15
 * Time: 7:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
    public int solution(int N) {
        int count = 0;
        BigInteger bigInt = new BigInteger("11").pow(N);
        String bigIntStr = bigInt.toString();
        for (int i = 0; i < bigIntStr.length(); i++) {
            char c = bigIntStr.charAt(i);

            int num = Character.getNumericValue(c);
            if (num == 1) {
                count++;
            }
        }
        return count;
    }
}