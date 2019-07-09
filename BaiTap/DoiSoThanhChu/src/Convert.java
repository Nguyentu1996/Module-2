import java.util.Scanner;

public class Convert {
    public static String getOnes(int number){
        String value = "";
        switch (number) {
            case 0:
                value = "không";
                break;
            case 1:
                value = "một";
                break;
            case 2:
                value = "hai";
                break;
            case 3:
                value = "ba";
                break;
            case 4:
                value = "bốn";
                break;
            case 5:
                value = "năm";
                break;
            case 6:
                value = "sáu";
                break;
            case 7:
                value = "bảy";
                break;
            case 8:
                value = "tám";
                break;
            case 9:
                value = "chín";
                break;
        }
        return value;

    }
    public static String getBetweenTenAndTwenty(int number){
        String value = "";
        int ones = number % 10;
        switch (number) {
            case 10:
                value = "mười";
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                value = "mười " + getOnes(ones);
                break;
        }
        return value;
    }
    public  static  String getTens(int number){
        String value = "";
        int tens = number % 10;
        int ones = number / 10;
        switch (number) {
            case 20:
                value = "hai mươi";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                value = "hai mươi " + getOnes(ones);
                break;
            case 30:
                value = "ba mươi";
                break;
            default:
                value = getOnes(ones) + " mươi " + getOnes(tens);
                break;
        }
        return value;
    }
    public static String getHundred(int number) {
        String value = "";
        int hundreds = number / 100;
        int tens = number - hundreds * 100;
        System.out.println(getOnes(hundreds) + " trăm " + getTens(tens));
        return value;
    }
    public static void main(String[] args) {
        System.out.println("Nhập số: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0 && number < 10) {
            System.out.println(getOnes(number));
        } else if (number >= 10 && number < 20) {
            System.out.println(getBetweenTenAndTwenty(number));
        } else if (number >= 20 && number < 100) {
            System.out.println(getTens(number));
        } else if (number >= 100 && number < 1000) {
            System.out.println(getHundred(number));
        } else System.out.println("Mời làm từ 0 --> 999");
    }
    }
