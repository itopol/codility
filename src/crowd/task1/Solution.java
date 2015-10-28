package crowd.task1;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: igortopol
 * Date: 10/25/15
 * Time: 7:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {

    public int solution(String S) {
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < S.length(); i++) {
            char character = S.charAt(i);
            if (Character.isDigit(character)) {
                stack.push(Character.getNumericValue(character));
            } else if (stack.size() >= 2) {     // stack should contains at lease 2 numbers inside
                Integer firstValue = stack.pop();
                Integer secondValue = stack.pop();
                if (character == '*') {
                    stack.push(firstValue * secondValue);
                }
                if (character == '+') {
                    stack.push(firstValue + secondValue);
                }
            } else {
                return -1;
            }

        }

        if (stack.size() != 0) {
            return stack.pop();
        } else {

            return -1;
        }
    }
}