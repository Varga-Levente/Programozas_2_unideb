import java.util.Random;

public class Main {
    public static String randomizeCase(String str) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (rand.nextBoolean()) {
                c = Character.toUpperCase(c);
            } else {
                c = Character.toLowerCase(c);
            }
            sb.append(c);
        }
        return sb.toString();
    }
    public static String rnd_case(String s){
        Random rnd = new Random(Integer.parseInt(String.valueOf(Math.round(Math.random()*1000))));
        StringBuilder sb = new StringBuilder();
        char[] carr = s.toCharArray();
        for (int i = 0; i < carr.length; i++) {
            boolean r = rnd.nextBoolean();
            if(r==true){
                carr[i] = Character.toUpperCase(carr[i]);
            }else{
                carr[i] = Character.toLowerCase(carr[i]);
            }
            sb.append(carr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(rnd_case("hello world"));
        System.out.println(randomizeCase("hello world"));
    }
}
