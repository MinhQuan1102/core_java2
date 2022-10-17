package summer;

public class Baby extends Human{
    public Baby(String name, int age) {
        super(name, age);
    }

    @Override
    void entertain() {

    }

    @Override
    public void sleep() {
        System.out.println("I'm sleeping");
    }

}
