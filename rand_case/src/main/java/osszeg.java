import java.util.Arrays;

public class osszeg {
    // sum string char values
    public static int sum(String s){
        int sum = 0;
        char[] carr = s.toCharArray();
        for (int i = 0; i < carr.length; i++) {
            sum += carr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "90146852";
        System.out.println(sum(s));

    }
}