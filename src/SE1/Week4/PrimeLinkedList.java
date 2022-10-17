package SE1.Week4;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimeLinkedList extends LinkedList<Integer> {

    public PrimeIterator primeIterator() {
        return new PrimeIterator();
    }

    public static void main(String[] args) {
        PrimeLinkedList list = new PrimeLinkedList();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        Iterator it = list.primeIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
    public class PrimeIterator implements Iterator<Integer> {
        private int pointer;
        @Override
        public boolean hasNext() {
            for (int i = pointer; i < PrimeLinkedList.this.size(); i++) {
                if (isPrime(PrimeLinkedList.this.get(i))) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public Integer next() {
            for (int i = pointer; i < PrimeLinkedList.this.size(); i++) {
                if (isPrime(PrimeLinkedList.this.get(i))) {
                    pointer = i + 1;
                    return PrimeLinkedList.this.get(i);
                }
            }
            return null;
        }

        private boolean isPrime(int number) {
            if (number < 2) return false;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) return false;
            }
            return true;
        }
    }
}
