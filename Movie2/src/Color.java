public class Color {
    private Color(){}

        // Reset
        private static final String RESET = "\033[0m";  // Text Reset
        public static String RESET(){
            return RESET;
        }

        // Regular Colors
        private static final String BLACK = "\033[0;30m";   // BLACK
        private static final String RED = "\033[0;31m";     // RED
        private static final String GREEN = "\033[0;32m";   // GREEN
        private static final String YELLOW = "\033[0;33m";  // YELLOW
        private static final String BLUE = "\033[0;34m";    // BLUE
        private static final String PURPLE = "\033[0;35m";  // PURPLE
        private static final String CYAN = "\033[0;36m";    // CYAN
        private static final String WHITE = "\033[0;37m";   // WHITE

        // Regular Colors
        public static String BLACK(){
            return BLACK;
        }
        public static String RED(){
            return RED;
        }
        public static String GREEN(){
            return GREEN;
        }
        public static String YELLOW(){
            return YELLOW;
        }
        public static String BLUE(){
            return BLUE;
        }
        public static String PURPLE(){
            return PURPLE;
        }
        public static String CYAN(){
            return CYAN;
        }
        public static String WHITE(){
            return WHITE;
        }

        // Bold
        private static final String BLACK_BOLD = "\033[1;30m";  // BLACK
        private static final String RED_BOLD = "\033[1;31m";    // RED
        private static final String GREEN_BOLD = "\033[1;32m";  // GREEN
        private static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
        private static final String BLUE_BOLD = "\033[1;34m";   // BLUE
        private static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
        private static final String CYAN_BOLD = "\033[1;36m";   // CYAN
        private static final String WHITE_BOLD = "\033[1;37m";  // WHITE

        public static String BLACK_BOLD(){
            return BLACK_BOLD;
        }
        public static String RED_BOLD(){
            return RED_BOLD;
        }
        public static String GREEN_BOLD(){
            return GREEN_BOLD;
        }
        public static String YELLOW_BOLD(){
            return YELLOW_BOLD;
        }
        public static String BLUE_BOLD(){
            return BLUE_BOLD;
        }
        public static String PURPLE_BOLD(){
            return PURPLE_BOLD;
        }
        public static String CYAN_BOLD(){
            return CYAN_BOLD;
        }
        public static String WHITE_BOLD(){
            return WHITE_BOLD;
        }

        // Underline
        private static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
        private static final String RED_UNDERLINED = "\033[4;31m";    // RED
        private static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
        private static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
        private static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
        private static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
        private static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
        private static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

        public static String BLACK_UNDERLINED(){
            return BLACK_UNDERLINED;
        }
        public static String RED_UNDERLINED(){
            return RED_UNDERLINED;
        }
        public static String GREEN_UNDERLINED(){
            return GREEN_UNDERLINED;
        }
        public static String YELLOW_UNDERLINED(){
            return YELLOW_UNDERLINED;
        }
        public static String BLUE_UNDERLINED(){
            return BLUE_UNDERLINED;
        }
        public static String PURPLE_UNDERLINED(){
            return PURPLE_UNDERLINED;
        }
        public static String CYAN_UNDERLINED(){
            return CYAN_UNDERLINED;
        }
        public static String WHITE_UNDERLINED(){
            return WHITE_UNDERLINED;
        }

        // Background
        private static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
        private static final String RED_BACKGROUND = "\033[41m";    // RED
        private static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
        private static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
        private static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
        private static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
        private static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
        private static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

        public static String BLACK_BACKGROUND(){
            return BLACK_BACKGROUND;
        }
        public static String RED_BACKGROUND(){
            return RED_BACKGROUND;
        }
        public static String GREEN_BACKGROUND(){
            return GREEN_BACKGROUND;
        }
        public static String YELLOW_BACKGROUND(){
            return YELLOW_BACKGROUND;
        }
        public static String BLUE_BACKGROUND(){
            return BLUE_BACKGROUND;
        }
        public static String PURPLE_BACKGROUND(){
            return PURPLE_BACKGROUND;
        }
        public static String CYAN_BACKGROUND(){
            return CYAN_BACKGROUND;
        }
        public static String WHITE_BACKGROUND(){
            return WHITE_BACKGROUND;
        }

        // High Intensity
        private static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
        private static final String RED_BRIGHT = "\033[0;91m";    // RED
        private static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
        private static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
        private static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
        private static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
        private static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
        private static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

        public static String BLACK_BRIGHT(){
            return BLACK_BRIGHT;
        }
        public static String RED_BRIGHT(){
            return RED_BRIGHT;
        }
        public static String GREEN_BRIGHT(){
            return GREEN_BRIGHT;
        }
        public static String YELLOW_BRIGHT(){
            return YELLOW_BRIGHT;
        }
        public static String BLUE_BRIGHT(){
            return BLUE_BRIGHT;
        }
        public static String PURPLE_BRIGHT(){
            return PURPLE_BRIGHT;
        }
        public static String CYAN_BRIGHT(){
            return CYAN_BRIGHT;
        }
        public static String WHITE_BRIGHT(){
            return WHITE_BRIGHT;
        }

        // Bold High Intensity
        private static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
        private static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
        private static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
        private static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
        private static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
        private static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
        private static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
        private static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

        public static String BLACK_BOLD_BRIGHT(){
            return BLUE_BOLD_BRIGHT;
        }
        public static String RED_BOLD_BRIGHT(){
            return RED_BOLD_BRIGHT;
        }
        public static String GREEN_BOLD_BRIGHT(){
            return GREEN_BOLD_BRIGHT;
        }
        public static String YELLOW_BOLD_BRIGHT(){
            return YELLOW_BOLD_BRIGHT;
        }
        public static String BLUE_BOLD_BRIGHT(){
            return BLUE_BOLD_BRIGHT;
        }
        public static String PURPLE_BOLD_BRIGHT(){
            return PURPLE_BOLD_BRIGHT;
        }
        public static String CYAN_BOLD_BRIGHT(){
            return CYAN_BOLD_BRIGHT;
        }
        public static String WHITE_BOLD_BRIGHT(){
            return WHITE_BOLD_BRIGHT;
        }

        // High Intensity backgrounds
        private static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
        private static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
        private static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
        private static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
        private static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
        private static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
        private static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
        private static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE

        public static String BLACK_BACKGROUND_BRIGHT(){
            return BLACK_BACKGROUND_BRIGHT;
        }
        public static String RED_BACKGROUND_BRIGHT(){
            return RED_BACKGROUND_BRIGHT;
        }
        public static String GREEN_BACKGROUND_BRIGHT(){
            return GREEN_BACKGROUND_BRIGHT;
        }
        public static String YELLOW_BACKGROUND_BRIGHT(){
            return YELLOW_BACKGROUND_BRIGHT;
        }
        public static String BLUE_BACKGROUND_BRIGHT(){
            return BLUE_BACKGROUND_BRIGHT;
        }
        public static String PURPLE_BACKGROUND_BRIGHT(){
            return PURPLE_BACKGROUND_BRIGHT;
        }
        public static String CYAN_BACKGROUND_BRIGHT(){
            return CYAN_BACKGROUND_BRIGHT;
        }
        public static String WHITE_BACKGROUND_BRIGHT(){
            return WHITE_BACKGROUND_BRIGHT;
        }
}