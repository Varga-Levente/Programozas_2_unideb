import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
    private Utils(){}

    public static int countFileLines(String filename) {
        int FILE_LINES = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while (reader.readLine() != null) FILE_LINES++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return FILE_LINES;
    }

}
