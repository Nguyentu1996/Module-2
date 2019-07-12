import java.util.Scanner;

public class DemKiTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        int count=0;
        System.out.println("Nhập chuỗi ");
        str = input.nextLine();
        System.out.println("Nhập vào kí tự cần đếm lần xuất hiện");
        char kitu=input.next().charAt(0);
        for (int i = 0 ; i < str.length();i++){
            if(str.charAt(i)== kitu){
              count++;
            }
        }
        System.out.println("số lần xuất hiện kí tự "+kitu+" trong chuỗi "+str+" = "+count);

    }
}
