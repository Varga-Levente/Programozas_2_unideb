package Alap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("---------------------------\nCreate an empty source file\n---------------------------");
        // Map/HashMap-ben tároljuk a programnyelveket
        Map<Integer, Map.Entry<String, String>> langs = new HashMap<>();
        Utils.fillHashMap(langs); // Új programnyelv hozzáadását a Utils classon belül lehet megtenni

        // Programnyelvek kiírása console-ra
        int counter = 1;
        for (Map.Entry<Integer, Map.Entry<String, String>> set : langs.entrySet()) {
            Map.Entry<String, String> nameex = langs.get(counter);
            System.out.println(set.getKey()+") "+nameex.getKey()+ Utils.spacer(nameex.getKey(), nameex.getValue())+"["+nameex.getValue()+"]");
            //Languages.createfile("_SAMPLE", nameex.getKey().toLowerCase(), nameex.getValue()); // Ennek a sornak az engedélyezése legenerálja az összes fájlt
            counter++;
        }
        System.out.println("q) quit");

        // Felhasználói bekérés (Programnyelv választás)
        System.out.print("\nNumber: ");
        Scanner sc = new Scanner(System.in);
        String user_ans = sc.nextLine();

        // Felhasználói bekérés (Fájlnév megadás)
        System.out.print("\nFilename (Without extension): ");
        Scanner filename = new Scanner(System.in);
        String user_filename = filename.nextLine();
        if(user_filename.strip() == null || user_filename.strip() == ""){
            user_filename = "app";
        }

        // Beadott nyelv választási érték ellenőrzése
        if(user_ans.equals("q")){
            System.out.println("Exiting...");
            System.exit(1);
        }else if(Utils.isNumber(user_ans)){
            if(langs.containsKey(Integer.parseInt(user_ans))){
                // Helyes adatok esetén adatok lekérése a Map-ből és fájl generálás indítása
                Map.Entry<String, String> nameex = langs.get(Integer.parseInt(user_ans));
                Languages.createfile(user_filename, nameex.getKey().toLowerCase(), nameex.getValue());
            }else{
                // Hiba üzenet nem létező index megadása esetén
                System.out.println("No index found! Exiting...");
                System.exit(1);
            }
        }else{
            // Hiba üzenet nem szám érték megadása esetén
            System.out.println("Wrong data given! Exiting...");
            System.exit(1);
        }
    }
}