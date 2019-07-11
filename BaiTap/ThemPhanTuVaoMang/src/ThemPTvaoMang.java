import java.util.Scanner;

public class ThemPTvaoMang {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size");
        size = scanner.nextInt();
        array = new int[size];
        System.out.println("mảng có độ dài là " + size);
        int a = 0;
        while (a < array.length) {
            System.out.println("nhập giá trị " + (a + 1) + ": ");
            array[a] = scanner.nextInt();
            a++;
        }
        System.out.println("mảng sau khi tạo là:");
        for (int z = 0; z < array.length; z++) {
            System.out.printf(+array[z] + "\t");
        }

        int x;
        System.out.println("Nhập x");
        x = scanner.nextInt();
        int index;
        System.out.println("Nhập index");
        index = scanner.nextInt();
        if (index <= 1 && index >= array.length - 1) {
            System.out.println("không thể thêm vào mảng ở vị trí " + index);
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[index] == array[i]) {
                    array[i] = x;
                }
            }
            System.out.println("mảng mới sau khi thêm ");
            for (int j = 0; j < array.length; j++) {
                System.out.printf(+array[j] + "\t");
            }
        }
    }
}
