import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = -1;

        while (num != 4) {
            System.out.println("Menu");
            System.out.println("1 in hình chữ nhật");
            System.out.println("2 in hình tam giác");
            System.out.println("3 in hình tam giác cân");
            System.out.println("4 Thoát");
            num = input.nextInt();
            switch (num) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i=1;i<5;i++){
                        for (int j=1;j<i;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i=1;i<6;i++){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        for (int z=1;z<=i;z++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
            }
        }
    }


}


