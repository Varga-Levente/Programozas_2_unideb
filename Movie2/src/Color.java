public class Color {
    private Color(){}

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    public static String RESET(){
        return ANSI_RESET;
    }

    public static String BLACK(){
        return ANSI_BLACK;
    }

    public static String RED(){
        return ANSI_RED;
    }

    public static String GREEN(){
        return ANSI_GREEN;
    }

    public static String YELLOW(){
        return ANSI_YELLOW;
    }

    public static String BLUE(){
        return ANSI_BLUE;
    }

    public static String PURPLE(){
        return ANSI_PURPLE;
    }

    public static String CYAN(){
        return ANSI_CYAN;
    }

    public static String WHITE(){
        return ANSI_WHITE;
    }

}
