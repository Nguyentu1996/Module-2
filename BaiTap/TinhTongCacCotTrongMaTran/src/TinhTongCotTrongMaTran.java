import java.util.Scanner;

public class TinhTongCotTrongMaTran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m,cot;
        int sum =0;
        int [][]array;
        System.out.println("nhập hàng cho ma trận");
        n= input.nextInt();
        System.out.println("Nhập cột cho ma trận");
        m=input.nextInt();
        array= new int [n][m];
        for(int i = 0 ; i < n ; i++ ){
            for (int j = 0 ; j < m;j++){
                System.out.println("array["+i+"]["+j+"] =");
                array[i][j]=input.nextInt();
            }
        }
        for (int i = 0 ; i< n ; i ++){
            for (int j = 0 ; j <m ; j++){
                System.out.printf(+array[i][j]+"\t");
            }
            System.out.println("\t");
        }
        System.out.println("Nhập cột cần tính tổng");
        cot=input.nextInt();
        for (int i = 0 ; i < n;i++){
            for (int j = 0 ; j < m ; j++){
                if(j+1==cot){
                    sum+=array[i][j];
                }
            }
        }
        System.out.println("Tổng cột "+sum);
    }
}
