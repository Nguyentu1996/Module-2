import java.util.Scanner;

public class TimPTLNmang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập hàng");
        int n = input.nextInt();
        System.out.println("Nhập Cột");
        int m=input.nextInt();
        int [][]array=new int[n][m];
        System.out.println("Nhập các Phần tử");
        for (int i = 0;i < n;i++){
            for (int j = 0;j < m;j++){
                System.out.println("array[" + i + "][" + j + "] = ");
                array[i][j] = input.nextInt();
            }
        }
        for (int i = 0;i < n;i++){
            for (int j = 0;j < m;j++){
                System.out.printf(+array[i][j]+"\t");
            }
            System.out.println("\n");
        }
        int max=array[0][0];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(max < array[i][j]){
                    max=array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất "+max);



    }
}
