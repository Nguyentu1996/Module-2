import java.awt.*;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new  Shape[2];
        shapes[0]=new Square();
        shapes[1]= new Circle();
        for (int i = 0 ; i < shapes.length;i++){
            System.out.println(shapes[i]);
            if(shapes[i]instanceof Colorable){
                ((Square) shapes[i]).howToColor();

            }
        }
    }
}
