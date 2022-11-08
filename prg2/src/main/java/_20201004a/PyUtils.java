package _20201004a;

import java.util.Scanner;

public class PyUtils {
    private PyUtils(){}

    public static String input(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
