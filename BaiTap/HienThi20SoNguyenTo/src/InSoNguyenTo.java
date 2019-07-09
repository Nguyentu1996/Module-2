import java.util.Scanner;

public class InSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập N");
        int number =scanner.nextInt();
        System.out.printf("in ra %d số nguyên tố \n",number);
        int dem=0;
        int i=2;
        while (dem<number){
            if(KiemTraSNT(i)){
                System.out.println(i+ " ");
                dem++;
            }
            i++;
        }
    }
    public static boolean KiemTraSNT(int number){

        if (number < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
