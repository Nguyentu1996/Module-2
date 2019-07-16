public class Cylinder extends Circle {
    double height;
    public Cylinder(){

    }
    public  Cylinder(double height){
        this.height=height;
    }
    public  Cylinder(double height , double radius, String color){
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getTheTich(){
        return height*Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "A Cylinder with height= "+getHeight()+"the tich = "+getTheTich()+", which is a subclass of"+super.toString();
    }
}
