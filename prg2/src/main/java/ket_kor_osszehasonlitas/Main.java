package ket_kor_osszehasonlitas;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10.5);

        Circle c2 = new Circle(19.5);
        System.out.println(c1.toString());
        System.out.println(c1.isGreaterThan(c2));
    }
}
