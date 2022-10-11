public class Main {
    public static String clearME(String raw){

        return raw.replaceAll("\\s", "");
    }
    public static void main(String[] args) {
        System.out.println(clearME("192.20.246.138:\\n 6666"));
        System.out.println(clearME("206.130.99.82:\\n8080"));
    }
}
