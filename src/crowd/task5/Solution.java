package crowd.task5;

import java.io.*;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA.
 * User: igortopol
 * Date: 11/15/15
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 */
class Solution implements Iterable<Integer> {
    private BufferedReader inputReader;

    public Solution(Reader inp) {
        this.inputReader = new BufferedReader(inp);
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                try {
                    if (inputReader.ready())
                        return true;
                    else {
                        inputReader.close();
                        return false;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return false;
            }

            @Override
            public Integer next() {
                try {
                    String value = inputReader.readLine();
                    Integer intValue = Integer.valueOf(value);
                    if (Math.abs(intValue) > 1000000000) {
                        return null;
                    }
                    return intValue;
                } catch (NumberFormatException nfe) {
//                    log.warn("ignore NumberFormatException")

                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }


            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void forEachRemaining(Consumer<? super Integer> action) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) throws FileNotFoundException {

        Reader reader = new BufferedReader(new FileReader("/Users/igortopol/Downloads/codility/src/test.txt"));

        for (Integer it : new Solution(reader)) {
            System.out.println(it);
        }
    }

}