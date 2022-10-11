public class Main {
    public static String swapcase(String s){
        char[] chars = s.toCharArray();
        String ans = "";
        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                ans += String.valueOf(aChar).toLowerCase();
            } else if (Character.isLowerCase(aChar)) {
                ans += String.valueOf(aChar).toUpperCase();
            } else {
                ans += String.valueOf(aChar);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("AAA_bbb_CcC");
        System.out.println(swapcase("AAA_bbb_CcC"));
    }
}
