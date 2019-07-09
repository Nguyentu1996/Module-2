import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width,height,bmi;
        System.out.println("Nhập cân nặng (kg): ");
        width=input.nextDouble();
        System.out.println("Nhập Chiều Cao (met): ");
        height= input.nextDouble();
        bmi=width/Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if(bmi<18){
            System.out.printf("%-20.2f%s",bmi,"underweight");
        } else  if(bmi<25.0){
            System.out.printf("%-20.2f%s",bmi,"Normal");
        } else  if(bmi<30.0){
            System.out.printf("%-20.2f%s",bmi,"Over Weight");
        } else  System.out.printf("%-20.2f%s",bmi,"Obese");

    }
}
