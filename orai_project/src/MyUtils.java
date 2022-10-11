import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;

public class MyUtils {

    private MyUtils(){}

    public static int duplaz(int num){
        return 2*num;
    }
    public static int strlen(@NotNull String s){
        return s.length();
    }
    public void separator(int n, char c){
        if(n<1){
            n=1;
        }
        if (c == ' ' || c == '\t' || c == '\r' || c == '\n') {
            c='#';
        }
        for(int i=0; i<n; i++){
            System.out.print("#");
        }
    }

    public static void reverse(int[] a){
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
}
