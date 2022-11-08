package Hamming;

public class Mian {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    static void ErrorHandler(int err){
        if(err==-1){
            System.out.println("A két szó hossza nem térhet el!");
        }
        if(err==-2){
            System.out.println("A megadott szavak nem lehetnek üres sztringek!");
        }
    }
    static void Hamming(String str1, String str2) {
        int i = 0, counter = 0;
        if(str1.length() != str2.length()) {
            ErrorHandler(-1);
        }else if(str1.length()==0 || str2.length()==0 || str1.equals("") || str2.equals("")){
            ErrorHandler(-2);
        }else {
            while (i < str1.length()) {
                if (str1.charAt(i) != str2.charAt(i))
                    counter++;
                i++;
            }
            System.out.println("A két szó("+str1+", "+str2+") hamming tábolsága: " + counter);
        }
    }

    public static void main(String[] args) {
        String str1 = "toned";
        String str2 = "roses";
        Hamming(str1, str2);

        String str3 = "111111";
        String str4 = "101000";
        Hamming(str3, str4);

        int diff = Hamming.distance("toned", "roses");
        System.out.println(ANSI_CYAN+"[CLASS] "+ANSI_RED+"- "+ANSI_RESET+"A két szó hamming távolsága: "+ANSI_GREEN+diff);
    }
}
