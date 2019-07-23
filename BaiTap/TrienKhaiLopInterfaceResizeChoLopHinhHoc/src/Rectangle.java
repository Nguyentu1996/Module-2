import java.awt.*;

public class Rectangle extends Shape implements Resizeable {
    public double height=1.0;
    public double width=2.0;
    public Rectangle(){

    }
    public Rectangle(String color, boolean filled,double height, double width){
        super(color, filled);
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
        return this.width*this.height;

    }

    @Override
    public String toString() {
        return "A rectangle have "+getHeight() +" and"+getWidth()+" dien tich = "+getArea()+super.toString();
    }
    @Override
    public void resize(double percent){
        this.width*=percent/100;
        this.height*=percent/100;
    }
}
