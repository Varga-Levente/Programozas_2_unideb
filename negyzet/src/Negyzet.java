public class Negyzet {

    int oldal;

    public Negyzet(int i) {
        oldal = i;
    }

    public int kerulet(){
        return this.oldal*4;
    }

    public int terulet(){
        return (int)Math.pow(oldal,2);
    }
}
