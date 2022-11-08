package csodalatos_elme;

import java.util.*;

public class Main {
    static String szoveg = "3Z 4Z UZ3N37 4Z7 4 C3L7 5Z0LG4LJ4, H0GY B3B1Z0NY1754\n" +
            "M1LY3N C50D4L4705 D0LG0KR4 K3P35 4Z 3LM3.\n" +
            "3LK3P35Z70 D0LG0KR4! N3H3Z V0L7 3L05Z0R 3L0LV45N0D\n" +
            "3Z7, D3 M1R3 1D33R5Z 3HH3Z 4 50RH0Z, 4Z 3LM3D\n" +
            "4U70M471KU54N 3L 7UDJ4 0LV45N1.\n" +
            "4N3LKUL H0GY G0ND0LK0DN0D K3LL3N3 R4J74.\n" +
            "L3GY BU5ZK3! C54K K3V35 3MB3R K3P35 3L0LV45N1 3Z7.\n" +
            "H4 7375Z377, 05ZD M3G M450KK4L 15!";

    public static String decode_me(String text){
        Map<Character, Character> dict = new HashMap<Character, Character>();
        dict.put('3', 'E');
        dict.put('4', 'A');
        dict.put('7', 'T');
        dict.put('5', 'S');
        dict.put('1', 'I');
        dict.put('0', 'O');

        char[] ch = text.toCharArray();
        for(int i = 0; i<ch.length; i++){
            if(Character.isDigit(ch[i]) && dict.containsKey(ch[i])){
                ch[i]=dict.get(ch[i]);
            }
        }
        return new String(ch);
    }

    public static void main(String[] args){
        System.out.println(decode_me(szoveg));
    }
}
