package Movie;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final String filename = "movies.txt";
        int FILE_LINES = Utils.countFile(filename);

        Movie[] movies = new Movie[FILE_LINES];

        try {
            Scanner file_in = new Scanner(new File(filename));
            for (int i = 0; i < FILE_LINES; i++) {
                movies[i] = new Movie(i, file_in.nextLine());
            }

            String[] movie_names = Utils.toArray(movies, FILE_LINES);

            Arrays.sort(movie_names);

            System.out.println("Legmagasabb rating: "+Utils.getMax(movies).getRating());
            System.out.println("\t"+Utils.getMax(movies).toString()+"\n");
            Utils.printSeparator(70);
            System.out.println("Legalacsonyabb rating: "+Utils.getMin(movies).getRating());
            System.out.println("\t"+Utils.getMin(movies).toString()+"\n");

            Utils.printSeparator(70);

            System.out.println("Sorted film names: ");
            for(String s : movie_names){
                System.out.println("\t"+s);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
