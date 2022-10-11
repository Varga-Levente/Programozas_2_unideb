import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String filename = "mozik.csv";
        final int FILE_LINES = Utils.countFileLines(filename);
        try{
            Scanner file_in = new Scanner(new File(filename));
            Movie[] film = new Movie[FILE_LINES];
            for (int i = 0; i < FILE_LINES; i++) {
                film[i] = new Movie(i, file_in.nextLine());
            }

            int counter = 0;
                film[0].setYear(1111);
            for(Movie m : film){
                if(m.getLikes()>=500000){
                    counter++;
                    System.out.println(m);
                }
            }
            System.out.println(Color.CYAN()+"\n\tÖsszesen "+Color.RED()+counter+Color.CYAN()+"db film van ami elérte az "+Color.GREEN()+"500.000"+Color.CYAN()+" like-ot.");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
