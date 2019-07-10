import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static double DoiDoCsangDoF(double doC){
        double doF=(9/5)* doC +32;
        return doF;
    }
    public  static double DoiDoFsangDoC(double doF){
        double doC=(5/9)*(doF-32);
        return doC;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doC;
        double doF;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1 chuyển độ c sang độ f");
            System.out.println("2 chuyển độ f sang độ c");
            System.out.println("0 thoát");
            System.out.println("Nhập lựa chọn của bạn");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("nhập độ c");
                    doC=input.nextDouble();
                    System.out.println(" bằng "+DoiDoCsangDoF(doC)+" độ f");
                    break;
                case 2:
                    System.out.println("nhập độ f");
                    doF=input.nextDouble();
                    System.out.println("  bằng "+DoiDoFsangDoC(doF)+" độ C");
                    return;
            }
        }while (choice!=0);
    }
}
