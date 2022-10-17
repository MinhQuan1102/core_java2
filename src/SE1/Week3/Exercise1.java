package SE1.Week3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Exercise1 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/SE1/Week3/ReadFile.txt"));
            PrintWriter printWriter = new PrintWriter("src/SE1/Week3/ReadFile.txt");
            String line = bufferedReader.readLine();
            try (printWriter) {
                while (line != null) {
                    line = line.replaceAll(" ", "");
                    printWriter.write(line + "\n");
                    line = bufferedReader.readLine();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
