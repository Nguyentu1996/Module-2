import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println(" Enter Year :");
        year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d là năm nhuận", year);

                }else {
                    System.out.printf("%d không phải là năm nhuận", year);
                }
            }else {
                System.out.printf("%d là năm nhuận",year);
            }
        }else {
            System.out.printf("không phải là năm nhuận",year);
        }
    }
}
