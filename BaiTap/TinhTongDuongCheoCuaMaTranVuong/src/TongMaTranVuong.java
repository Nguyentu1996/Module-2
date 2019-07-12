import java.util.Scanner;

public class TongMaTranVuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int sum=0;
        System.out.println("Nhập bậc cho ma trận vuông");
        n=input.nextInt();
        float[][]array = new float[n][n];
        System.out.println("Nhập các phần tử cho ma trận ");
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.println("ma trận vị trí["+i+"]["+j+"]=");
                array[i][j]=input.nextFloat();
            }
        }
        for (int i=0 ;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.printf(+array[i][j]+"\t");
            }
            System.out.println("\n");
        }
        for (int i=0;i<n;i++){
            for (int j =0 ; j<n;j++){
                if(i==j){
                    sum+=array[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính của ma trận "+sum);
    }
}
