public class Circle extends Shape  {
   public  double radius=1.0;
   public Circle(){

   }
   public Circle(double radius){
       this.radius=radius;
   }
   public Circle(double radius,String color,boolean filled){
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
        return " a circle have :"+getRadius() +"area :"+getArea() +super.toString();

    }
}