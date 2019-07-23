public class Square extends Shape implements Resizeable{
    public double size =1.0;

    public Square(){

    }
    public Square(double size,String color,boolean filled){
        super(color, filled);
        this.size=size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public double getArea(){
        return this.size*this.size;
    }

    @Override
    public String toString() {
        return " a Square have height = width= "+getSize() +" dien tich ="+getArea()+ super.toString();
    }
    @Override
    public void resize(double persent){
        this.size*=persent/100;
    }
}
