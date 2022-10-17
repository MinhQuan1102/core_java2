package summer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.function.*;

public class sample {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student(1, "Quan", 20);
        Student student2 = new Student (2, "Trung", 21);


    }

    public interface HelloSayer {
        // abstract method
        void say();

        // other methods
        default void introduce() {
            System.out.println("Hello I'm Quan");
        }
    }

    public static void sayGoodBye() {
        System.out.println("Good bye!");
    }
}
