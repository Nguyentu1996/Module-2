import java.util.Random;

public class TestResizeable {
    public static void main(String[] args) {
      Shape[] shapes = new Shape[3];
      shapes[0]= new Circle("yellow",true,3.0);
      shapes[1]= new Rectangle("blue",true,5.0,3.0);
      shapes[2]= new Square(4.0,"red",true);
        System.out.println("Truoc- resize");
        for (Shape shape : shapes){
            System.out.println(shape);
        }
        System.out.println("Sau resize");
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0]= new Circle("yellow",true,3.0);
        resizeables[1]= new Rectangle("blue",true,5.0,3.0);
        resizeables[2]= new Square(4.0,"red",true);
        for (Resizeable resizeable : resizeables){
            Random rd = new  Random();
          int  percent = rd.nextInt(100)+1;
            System.out.println("tang them "+percent+"%");
            resizeable.resize(percent);
            System.out.println(resizeable);
        }
    }
}
