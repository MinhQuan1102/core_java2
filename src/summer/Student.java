package summer;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;



    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }
    @Override
    public int compareTo(Student other) {
        return Long.compare(id, other.id);
    }
}
