public class Square extends Shape implements Colorable {
    public double size=1.0;
    public Square(){

    }
    public Square(double size,String color, boolean filled){
        super(color, filled);
        this.size=size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }
    public double getArea(){
        return this.size*this.size;
    }

    @Override
    public String toString() {
        return "A square has size :"+getSize()+" area:"+getArea()+super.toString();
    }
    @Override
    public void howToColor(){
        System.out.println("color all four sides");
    }
}
