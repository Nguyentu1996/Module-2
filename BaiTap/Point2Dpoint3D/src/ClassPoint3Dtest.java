public class ClassPoint3Dtest {
    public static void main(String[] args) {
        ClassPoint3D classPoint3D = new ClassPoint3D();
        System.out.println(classPoint3D);
        classPoint3D=new ClassPoint3D(5,6,7);
        System.out.println(classPoint3D);
        classPoint3D.setXYZ(1,2,3);
        System.out.println(classPoint3D);
    }
}
