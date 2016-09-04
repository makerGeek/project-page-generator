
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;

public class ProjectPageGenerator {

    public static void main(String[] args) {
        try {
            System.out.println("reading data...");
            String data = readFile("data.txt", Charset.defaultCharset());
            System.out.println("parsing data...");
            JSONObject obj = new JSONObject(data);
            String title = obj.getString("title");
            String description = obj.getString("description");
            System.out.println("title : "+title +" : OK");
            System.out.println("description : "+ description.substring(0, 20) +"... : OK");
            System.out.println("fetching images...");
            File directory = new File("img");
            File[] contents = directory.listFiles();

            System.out.println("fetching : OK");
            System.out.println("found "+ contents.length+" images");
            System.out.println("generating html...");
            String html = Templates.generateHtml(title, description, contents);
            File index = new File("index.html");
            FileWriter fileWriter = new FileWriter(index);
            fileWriter.append(html);
            fileWriter.close();
            System.out.println("Done !");
        } catch (Exception ex) {
            System.out.println("ERROR : " + ex.getMessage());
        }

    }

    static String readFile(String path, Charset encoding)
            throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

}
