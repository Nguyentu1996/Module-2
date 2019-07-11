import java.util.Scanner;

public class TimGTNN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int []array;
        System.out.println("Nhập size cho mảng");
        size=input.nextInt();
        System.out.println("mảng có độ dài là "+size);
        array=new int[size];
        for (int i=0;i<array.length;i++){
            System.out.println("nhập phần tử thứ "+(i+1));
            array[i]=input.nextInt();
        }
        System.out.println("in mảng");
        for (int i = 0;i< array.length;i++){
            System.out.printf(+array[i]+"\t");
        }
        int min=array[0];
        for (int i = 1;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println("min : "+min);
    }
}
