public class TamGiac extends Shape {
    double side1=1.0,side2=1.0,side3=1.0;
    public TamGiac(){

    }
    public TamGiac(double side1, double side2 , double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public TamGiac(String color,boolean filled,double side1, double side2, double side3){
        super(color, filled);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double p = (side1+side2+side3)/2;
        double s = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return s;
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    @Override
    public String toString() {
        return "tam giac co 3 canh : "+getSide1()+", "+getSide2()+", "+getSide3()+" dien tich= "+getArea()+" Chu vi = "+getPerimeter()+" "+super.toString();
    }
}