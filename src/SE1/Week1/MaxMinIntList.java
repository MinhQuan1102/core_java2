package SE1.Week1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @overview MaxMinIntList is a subtype of ArrayList with additional methods
 */
public class MaxMinIntList extends ArrayList<Integer> {

    // no argument constructor
    public MaxMinIntList() {
        super();
    }

    /**
     * @effects
     *   if this is empty
     *     throw an exception
     *   else
     *     return the smallest element of this
     */
    public int min() throws Exception{
        if (super.size() == 0) {
            throw new Exception("Empty list!");
        } else {
            int smallest = super.get(0);
            for (int i = 1; i < super.size(); i++) {
                if (super.get(i) < smallest) {
                    smallest = super.get(i);
                }
            }
            return smallest;
        }
    }

    /**
     * @effects
     *   if this is empty
     *     throw an exception
     *   else
     *     return the largest element of this
     */
    public int max() throws Exception {
        if (super.size() == 0) {
            throw new Exception("Empty list!");
        }
        else {
            // namtt@hanu.edu.vn
            int biggest = super.get(0);
            for (int i = 1; i < super.size(); i++) {
                if (super.get(i) > biggest) {
                    biggest = super.get(i);
                }
            }
            return biggest;
        }
    }

    public boolean repOk() {
        int length = super.size();
        if (length == 0) return false;
        for (int i = 0; i < length; i++) {
            Object o = super.get(i);
            if (o == null) return false;
            for (int j = i + 1; j < length; j++) {
                if (o.equals(super.get(j))) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MaxMinIntList list = new MaxMinIntList();
        list.add(1);
        list.add(2);
        list.add(-3);
        list.add(-2);
        list.add(-10);
        try {
            if (list.repOk()) {
                System.out.println("The smallest number: " + list.min());
                System.out.println("The biggest number: " + list.max());
            } else {
                System.out.println("Invalid list!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
