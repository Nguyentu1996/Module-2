import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []array={6,7,5,2,4,2,0,1};
        int c;
        System.out.println("Nhập phần tử cần xóa ");
        int x =input.nextInt();
        for (int i = c = 0;i<array.length;i++){
            if(array[i]!=x ){
                array[c]=array[i];
                c++;
            }
        }
        System.out.println("In mảng đã xóa ");
        for (int i=0;i<c;i++){
            System.out.printf(+array[i]+"\t");
        }
    }
}
