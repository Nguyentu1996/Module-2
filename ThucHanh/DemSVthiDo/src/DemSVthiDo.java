import java.util.Scanner;

public class DemSVthiDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập size");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("nhập vượt quá 30 sinh viên");
            }
        } while (size > 30);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập điểm cho thí sinh thứ " + (i + 1));
            array[i] = input.nextInt();
        }
        System.out.println("danh sách điểm thi :");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(+array[i] + "\t");
        }
        int dem = 0;
        for (int j = 0 ;j < array.length;j++){
            if(array[j]>= 5 && array[j]<= 10){
                dem++;
            }
        }
        System.out.println("có  "+dem+" thí sinh thi đỗ");
    }
}
