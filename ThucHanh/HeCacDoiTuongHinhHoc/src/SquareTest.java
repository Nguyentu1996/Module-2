public class SquareTest {
        public static void main(String[] args) {
            Square square = new Square();
            System.out.println(square);

            square = new Square(2.4);
            System.out.println(square);

            square = new Square(5.9, "yellow", true);
            System.out.println(square);
        }
}

