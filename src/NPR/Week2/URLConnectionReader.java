package NPR.Week2;
import java.net.* ;
import java.io.* ;

public class URLConnectionReader {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://hanu.vn") ;
        URLConnection uc = url.openConnection() ;
        BufferedReader br=new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String line ;
        while ((line=br.readLine())!=null)
            System.out.println(line) ;
        br.close() ;

    }
}
