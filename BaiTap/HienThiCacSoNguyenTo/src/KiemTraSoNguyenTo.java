import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        number = scanner.nextInt();
        isPrime(number);

//        for (int i = 0; i < 100; i++) {
//            isPrime(i);
//        }
    }

    public static void isPrime(int number) {
        boolean check = true;
        if (number < 2) {
            check = false;
        } else if (number == 2) {
            check = true;
        } else if (number % 2 == 0) {
            check = false;
        } else {
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            System.out.println(number +" là số nguyên tố");
        } else System.out.println(number+" k phải là số nguyên tố");

    }
}

