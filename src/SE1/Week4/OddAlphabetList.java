package SE1.Week4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddAlphabetList {
    public static void main(String[] args) {
        // a 97
        List<Character> list = new ArrayList<>();
        for (int i = 97; i < 123; i++) {
            if (i % 2 != 0) {
                list.add((char)i);
            }
        }
        Iterator<Character> it = list.iterator();
        // A B C D
        while(it.hasNext()) {
            System.out.print(it.next() + " ");

        }

    }
}
