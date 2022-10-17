package SE1.Week4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class First10Primes {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
            if (list.size() == 10) break;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    public static boolean isPrime (int number) {
        if (number < 2) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
