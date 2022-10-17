package SE1.Week4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RandomNums {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 100) + 1);
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

}
