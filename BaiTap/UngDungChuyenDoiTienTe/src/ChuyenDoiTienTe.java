import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate=23000;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn cần đổi ");
        int usd = input.nextInt();
        int vnd =usd * rate;
        System.out.printf("%d usd bằng %s nvd",usd,vnd);
    }
}
