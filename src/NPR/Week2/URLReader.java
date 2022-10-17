package NPR.Week2;
import java.net.* ;
import java.io.* ;
import java.nio.file.Files;
import java.nio.file.Path;

public class URLReader {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://hanu.vn") ;
        FileWriter fw = new FileWriter("src/NPR/Week2/text.txt");
        BufferedReader br = new BufferedReader (new InputStreamReader(url.openStream())) ;
        String line ;
        while ((line=br.readLine())!=null) {
            System.out.println(line) ;
            fw.write(line + "\n");
        }

        fw.close();
        br.close() ;


    }
}
