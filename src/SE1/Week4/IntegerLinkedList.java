package SE1.Week4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IntegerLinkedList extends LinkedList<Integer> {

    public EvenIterator evenIterator () {
        return new EvenIterator();
    }

    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        Iterator it = list.evenIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    public class EvenIterator implements Iterator<Integer> {
        private int pointer;

        @Override
        public boolean hasNext() {
            for (int i = pointer; i < IntegerLinkedList.this.size(); i++) {
                if (IntegerLinkedList.this.get(i) % 2 == 0) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public Integer next() {
            for (int i = pointer; i < IntegerLinkedList.this.size(); i++) {
                if (IntegerLinkedList.this.get(i) % 2 == 0) {
                    pointer = i + 1;
                    return IntegerLinkedList.this.get(i);
                }
            }
            return null;
        }
    }
}
