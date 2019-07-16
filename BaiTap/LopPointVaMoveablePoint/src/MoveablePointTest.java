public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(2,3);
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(2,3,4,5);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
