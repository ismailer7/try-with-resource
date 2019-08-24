import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {
        BufferedReader br = null;
        try (  
            br = new BufferedReader(new FileReader("middle-earth-species.txt"));
        ) {
            String line = null;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 

        System.out.println("*****************************************");

        try {
            br = new BufferedReader(new FileReader("middle-earth-species.txt"))
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.err(e.getMessage());
        } finally {
            if(br != null) {
                br.close(); // ensure that the resource is closed.
            }
        }

    }


}