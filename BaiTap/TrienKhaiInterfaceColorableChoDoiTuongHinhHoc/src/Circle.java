public class Circle extends Shape {
    public double radius=1.0;
    public  Circle(){

    }
    public  Circle( String color , boolean filled,double radius){
        super(color, filled);
        this.radius=radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
       return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return " A circle has radius:"+getRadius()+" area :"+getArea()+super.toString();
    }
}
