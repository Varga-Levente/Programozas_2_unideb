public class Teglalap {

    private int oldal_a;
    private int oldal_b;

    public Teglalap(int a, int b) {
        this.oldal_a = a;
        this.oldal_b = b;
    }

    @Override
    public String toString(){
        return String.format("a: %d, b: %d", this.oldal_a, this.oldal_b);
    }

    public int kerulet(){
        return 2*(this.oldal_a+this.oldal_b);
    }

    public int terulet(){
        return this.oldal_a*this.oldal_b;
    }

    public int getOldal_a(){
        return this.oldal_a;
    }

    public int getOldal_b(){
        return this.oldal_b;
    }
}
