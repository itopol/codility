package crowd.task5;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: igortopol
 * Date: 11/15/15
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 */
class Solution implements Iterable<Integer> {
    public static final int MAGIC_NUMBER = 1000000000;
    private Reader inputReader;

    public Solution(Reader inp) {
        this.inputReader = inp;
    }


    @Override
    public Iterator<Integer> iterator() {

        return readValuesFromFile(inputReader).iterator();
    }

    private LinkedList<Integer> readValuesFromFile(Reader inputReader) {
        LinkedList<Integer> values = new LinkedList<>();

        String line = "";
        try (BufferedReader reader = new BufferedReader(inputReader)) {
            while (reader.ready()) {

                line = reader.readLine();
                if (line != null) {
                    String[] tokens = line.split("[\\r\\n]+");
                    for (String token : tokens) {

                        try {
                            Integer val = Integer.valueOf(token);
                            if (Math.abs(val) > MAGIC_NUMBER) {
                                continue;
                            }

                            values.add(val);
                        } catch (NumberFormatException nfe) {
//                             log.warn("Unparseble value:  " + line);
                            continue;
                        }
                    }

                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return values;
    }

    public static void main(String[] args) throws FileNotFoundException {

        Reader reader = new BufferedReader(new FileReader("/Users/igortopol/Downloads/codility/src/test.txt"));

        for (Integer it : new Solution(reader)) {
            System.out.println(it);
        }
    }

}