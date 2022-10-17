package SE1.Week4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddAlphabet {
    public static void main(String[] args) {
        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();
        for (int i = 97; i < 123; i++) {
            l1.add((char)(i));
        }
        Iterator<Character> it1 = l1.iterator();

        while (it1.hasNext()) {
            char ch = it1.next();
            System.out.print(ch + " ");
            if ((int)(ch) % 2 != 0) {
                l2.add(ch);
            }
        }
        System.out.println();
        Iterator<Character> it2 = l2.iterator();
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
    }
}
