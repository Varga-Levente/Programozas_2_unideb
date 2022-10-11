import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Kérem a téglalap 'a' oldalának hosszát: ");
        Scanner sc_a = new Scanner(System.in);
        int a_oldal = Integer.parseInt(sc_a.nextLine());

        System.out.print("Kérem a téglalap 'b' oldalának hosszát: ");
        Scanner sc_b = new Scanner(System.in);
        int b_oldal = Integer.parseInt(sc_b.nextLine());

        Teglalap teglalap = new Teglalap(a_oldal,b_oldal);
        int k = teglalap.kerulet();
        int t = teglalap.terulet();
        System.out.println("A téglalap kerülete: "+k);
        System.out.println("A téglalap területe: "+t);
    }
}
