import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utils {
    private Utils(){
        // Nem példányosítható
    }

    public static void printSeparator(int length){
        for(int i = 0; i < length; i++){
            System.out.print("#");
        }
        System.out.println("\n");
    }

    // Visszaadja a legmagasabb ratingű filmet
    public static Movie getMax(Movie[] mov){
        double maxrating = 0.0;
        Movie[] max = new Movie[1];
        for(Movie m : mov){
            if(m.getRating()>maxrating){
                maxrating=m.getRating();
                max[0]=m;
            }
        }
        return max[0];
    }

    // Visszaadja a legkisebb ratingű filmet
    public static Movie getMin(Movie[] mov){
        double minrating = mov[0].getRating();
        Movie[] min = new Movie[1];
        for(Movie m : mov){
            if(m.getRating()<minrating){
                minrating=m.getRating();
                min[0] = m;
            }
        }
        return min[0];
    }

    // Feltölti a movie_names tömböt az objektum name tartalmával
    public static String[] toArray(Movie[] movies, int FILE_LINES){
        int i = 0;
        String[] movie_names = new String[FILE_LINES];
        for (Movie m : movies){
            movie_names[i]=m.getName();
            i++;
        }
        return movie_names;
    }

    // Kapott file-nak megszámolja a sorait
    public static int countFile(String filename){
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while (reader.readLine() != null) lines++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
