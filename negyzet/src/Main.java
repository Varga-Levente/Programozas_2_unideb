import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Kérem e négyzet oldalának hosszát: ");
        Scanner sc = new Scanner(System.in);

        Negyzet negyzet = new Negyzet(Integer.parseInt(sc.nextLine()));    // a konstruktornak a négyzet oldalának a hosszát adjuk át
        int k = negyzet.kerulet();    // 12
        int t = negyzet.terulet();    // 9
        System.out.println("A négyzet kerülete: "+k);
        System.out.println("A négyzet területe: "+t);
    }
}
