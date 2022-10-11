import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static Map.Entry<String, Integer> getmaxmap(Map<String, Integer> dict){
        Map.Entry<String, Integer> max = null;
        for(Map.Entry<String,Integer> price:dict.entrySet()) {
            if (max == null || price.getValue().compareTo(max.getValue()) > 0)
            {
                max = price;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        final String filename = "input.txt";

        Map<String, Integer> dict = new HashMap<>();

        try {
            Scanner file_in = new Scanner(new File(filename));
            while(file_in.hasNextLine()){
                String[] line_split = file_in.nextLine().split(" ");
                int i = 0;
                while (i < line_split.length) {
                    if(dict.containsKey(line_split[i])){
                        dict.computeIfPresent(line_split[i], (key, oldValue) -> oldValue+1);
                    }else{
                        dict.put(line_split[i], 1);
                    }
                    i++;
                }
            }

            Map.Entry<String, Integer> max = getmaxmap(dict);

            dict.forEach((key, value) -> {
                System.out.println(key+" -> "+value+"db");
            });

            System.out.println("\nÖsszesen "+dict.size()+"db különböző szó van a fileban.");
            System.out.println("Legtöbbet szerepelt szó: "+max.getKey()+" -> ("+max.getValue()+"db)");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
