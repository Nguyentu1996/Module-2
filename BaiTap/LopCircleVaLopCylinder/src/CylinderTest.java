public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder=new Cylinder(3.5);
        System.out.println(cylinder);
        cylinder=new Cylinder(3.5,3.0,"yellow");
        System.out.println(cylinder);
    }
}
