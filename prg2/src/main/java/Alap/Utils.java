package Alap;

import java.util.AbstractMap;
import java.util.Map;

public class Utils {

    private Utils(){
        // Nem példányosítható
    };

    // Map/HashMap feltöltése (Ide kell hozzáadni az új nyelvet)
    public static void fillHashMap(Map<Integer, Map.Entry<String, String>> plangs){
        plangs.put(1, new AbstractMap.SimpleEntry<>("Python", "py"));
        plangs.put(2, new AbstractMap.SimpleEntry<>("Java", "java"));
        plangs.put(3, new AbstractMap.SimpleEntry<>("C", "c"));
        plangs.put(4, new AbstractMap.SimpleEntry<>("PHP", "php"));
        plangs.put(5, new AbstractMap.SimpleEntry<>("HTML", "html"));
        plangs.put(6, new AbstractMap.SimpleEntry<>("CSS", "css"));
        plangs.put(7, new AbstractMap.SimpleEntry<>("JS", "js"));
    }

    // Kiírást segítő space generátor
    public static String spacer(String s, String s2){
        int length = s.length()+2+s2.length();
        return " ".repeat(Math.max(0, 24 - length));
    }

    // Beadott programnyelv választó értek vizsgálása, hogy szám e a megadott adat
    public static boolean isNumber(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
