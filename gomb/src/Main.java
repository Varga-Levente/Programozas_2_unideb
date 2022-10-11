import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Kérem a gömb sugarát: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        Sphere sphere = new Sphere(r);
        double f = sphere.felszin();
        double t = sphere.terfogat();
        double k = sphere.kerulet();
        double a = sphere.atmero();

        System.out.println("A kör felszíne: "+f);
        System.out.println("A kör térfogata: "+t);
        System.out.println("A kör kerülete: "+k);
        System.out.println("A kör átmérője: "+a);
    }
}
