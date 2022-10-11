import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> getFirstAndLast(int[] szamok){
        List<Integer> list = new ArrayList<Integer>();
        list.add(szamok[0]);
        list.add(szamok[szamok.length-1]);
        return list;
    }

    public static void main(String[] args) {
        int[] szamok = {1,3,5,2,1,33,0,44,50};
        List<Integer> res = getFirstAndLast(szamok);
        System.out.println(res);
    }
}
