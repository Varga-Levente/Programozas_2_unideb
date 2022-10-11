public class Circle {

    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double kerulet(){
        return 2*Math.PI*r;
    }

    public double terulet(){
        return Math.PI* Math.pow(r,2);
    }
}
