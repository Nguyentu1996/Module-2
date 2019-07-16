public class Circle {
    double radius;
    String color;
    public Circle(){
    }
    public Circle(double radius, String color){
     this.radius=radius;
     this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return " A circle radius = "+getRadius()+" color = "+getColor();
    }
}
