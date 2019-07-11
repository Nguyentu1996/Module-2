import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array_1;
        int[] array_2;
        int[] array_3;
        int size_2;
        int size_1;
        int size_3;
        System.out.println("nhập size cho mảng 1");
        size_1=input.nextInt();
        array_1=new int[size_1];
        System.out.println("mảng có độ dài là :"+size_1);
        int i;
        for(i=0;i < array_1.length;i++){
            System.out.println(" nhập giá trị cho phần tử thứ  "+(i+1));
            array_1[i]=input.nextInt();
        }
        System.out.println("mảng sau khi tạo là :");
        for (i=0;i<array_1.length;i++){
            System.out.printf(+array_1[i]+"\t");

        }

        System.out.println("Nhập size cho mảng 2 ");
        size_2=input.nextInt();
        System.out.println(" mảng 2 có độ dài là :"+size_2);
        array_2= new int [size_2];
        for(i=0;i<array_2.length;i++){
            System.out.println("Nhập giá trị cho phần tử tứ :"+(i+1));
            array_2[i]=input.nextInt();
        }
        System.out.println("mảng 2 sau khi tạo là :");
        for (i=0;i<array_2.length;i++){
            System.out.println(+array_2[i]+"\t");
        }

        System.out.println("gộp mảng");
         array_3 = new int[array_1.length+array_2.length];
        for (i=0;i< array_1.length;i++){
            array_3[i]=array_1[i];
        }
        int k = 0;
        for (int a = array_1.length; a < array_3.length; a++){
            array_3[i] = array_2[k++];
        }
        for (i=0;i<array_3.length;i++){
            System.out.printf(+array_3[i]+"\t");
        }
    }
}
