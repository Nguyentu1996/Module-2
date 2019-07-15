public class Rectangle extends Shape{
    double height=1.0;
    double width=1.0;
    public Rectangle(){
    }
    public Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }
    public Rectangle(double height,double width, String color,boolean filled){
        super(color,filled);
        this.height=height;
        this.width=width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return height*width;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "A rectangle width = "+getWidth()+" and height= "+getHeight()+" , which subclass of "+super.toString();
    }
}
