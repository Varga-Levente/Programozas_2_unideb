public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Radius: "+this.radius;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double getRadius(){
        return this.radius;
    }

    public boolean isGreaterThan(Circle other){
        if(this.getRadius()>other.getRadius()){
            return true;
        }else{
            return false;
        }
    }
}
