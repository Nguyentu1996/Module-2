public class Square extends Rectangle {
    public Square(){
    }
    public Square(double size){
        super(size,size);
    }
    public Square(double size,String color,boolean filled){
        super(size,size,color,filled);
    }
    public double getSize(){
         return getWidth();
    }

    public  void setSize(double size){
        setWidth(size);
        setHeight(size);
    }

    @Override
    public void setWidth(double width){
        setSize(width);
    }
    @Override
    public void setHeight(double height){
        setSize(height);
    }

    @Override
    public String toString() {
        return "A square width size= "+getSize()+" which is a subclass of "+super.toString();
    }
}
