package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class LocalVariableTypeInference {
    static void main() throws IOException {
        URL url = new URL("http://www.oracle.com/");
        URLConnection conn = url.openConnection();
        Reader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        var url_ = new URL("http://www.oracle.com/");
        var conn_ = url.openConnection();
        var reader_ = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
    }
}
