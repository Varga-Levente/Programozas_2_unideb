import java.util.Scanner;

public class Gyakorlat_5 {
    public static void main(String[] args) {
        String[] string_nums = new String[2];
        int sum = 0;
        for(String s : args){
            sum+=Integer.parseInt(s);
        }
        System.out.println("A számok összege: " + sum);
    }
}
