import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Nhập độ dài của mảng");
            size=scanner.nextInt();
            if(size>20){
                System.out.println("độ dài vượt quá");
            }
        }while (size>20);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Nhập giá trị cho phần tử thứ "+(i+1)+": ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "phần tử nằm trong mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for(int j=0;j<array.length/2;j++){
            int temp=array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;

        }
        System.out.printf("%-20s%s", "đảo ngược: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
