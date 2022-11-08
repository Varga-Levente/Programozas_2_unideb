package gomb;

public class Sphere {

    double r;

    public Sphere(double r) {
        this.r = r;
    }

    public double felszin(){
        return 4*(Math.PI*Math.pow(r,2));
    }

    public double terfogat(){
        return ((4/3)*Math.PI)*Math.pow(r,3);
    }

    public double kerulet(){
        return 2*Math.PI*r;
    }

    public double atmero(){
        return 2*r;
    }
}
