package SE1.Week1;

/**
 * @overview Counter is a class to keep track of a value
 * @attributes
 *   value    Integer
 * @object
 */
public class Counter {
    private int value;

    /**
     * @effects Makes this contain 0
     */
    public Counter() {
        this.value = 0;
    }

    /**
     *
     * @effects Returns the value of this
     */
    public int get() {
        return this.value;
    }

    /**
     * @modifies this
     * @effects Increments the value of this
     */
    public void incr() {
        this.value++;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.incr();
        counter.incr();
        System.out.println(counter.get());
    }
}
