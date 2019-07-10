import java.util.Scanner;

public class TimGTLN {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Nhập size ");
            size=scanner.nextInt();
            if(size>20){
                System.out.println("Vượt Qúa giới hạn");

            }
        }while (size>20 );
        array= new int[size];
        int i =0;
        while (i<array.length){
            System.out.println("Nhập giá trị "+ (i+1)+": ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("In danh sách");
        for (int j=0;j<array.length;j++){
            System.out.println(array[j]+"\t");
        }
        int max=array[0];
        int index=1;
        for (int j=1;j<array.length;j++){
            if(array[j]>max){
                max=array[j];
                index=j+1;
            }
        }
        System.out.println("giá trị lớn nhất "+max+" vị trí "+index);

    }
}
