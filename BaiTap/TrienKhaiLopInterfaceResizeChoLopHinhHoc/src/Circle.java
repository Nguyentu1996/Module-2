public class Circle extends Shape implements Resizeable{
    public double radius=1.0;
    public Circle(){

    }
    public  Circle(String color, boolean filled,double radius){
        super(color, filled);
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "A circle have "+getRadius()+" which is subclass of "+super.toString();
    }
    @Override
    public void resize(double percent){
        this.radius+= percent/100;
    }
}
