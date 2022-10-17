package summer;

abstract class Human {
    protected String name;
    protected int age;

    // constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // abstract method
    abstract void entertain();
    public void sleep() {
        // empty body
    }

}
