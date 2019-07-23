import java.util.Arrays;

public class ComparableTest {

    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0]=new ComparableCircle(3.6);
        circles[1]= new ComparableCircle();
        circles[2]= new ComparableCircle(3.5,"yellow",true);
        System.out.println("before");
        for(ComparableCircle circle : circles){
            System.out.println(circle);
        }
        System.out.println("after");
        Arrays.sort(circles);
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }

    }
}
