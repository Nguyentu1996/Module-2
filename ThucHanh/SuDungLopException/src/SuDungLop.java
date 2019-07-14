import java.util.Random;

public class SuDungLop {
    public Integer[] createRandom() {
        Random rd = new Random();
        int[] array = new int[100];
        System.out.println("danh sách phần tử của mảng");
        for (int i = 0 ;i< 100;i++){
            array[i]=rd.nextInt(100);
            System.out.print(array[i]+" ");
        }
        return array[];

    }

    public static void main(String[] args) {
        SuDungLop arrExample = new SuDungLop();
        Integer[] array = arrExample.createRandom();

        Scanner scaner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scaner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + array[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
