import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Kérem a kör sugarát: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        Circle circle = new Circle(r);
        double k = circle.kerulet();
        double t = circle.terulet();
        System.out.println("A kör kerülete: "+k);
        System.out.println("A kör területe: "+t);
    }
}
