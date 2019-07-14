import java.util.Scanner;

public class PTbac2 {
    int a,b,c;
    double delta;
    double x1,x2;
    public PTbac2(){

    }
    public PTbac2(int a, int b , int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDelta(){
        return delta= Math.pow(this.b,2)-(4*this.a*this.c);
    }
    public double root1(){
        return x1=((-b + Math.sqrt(delta)) / (2*a));
    }
    public double root2(){
        return ((-b - Math.sqrt(delta)) / (2*a));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a");
        int a=input.nextInt();
        System.out.println("nhập b");
        int b =input.nextInt();
        System.out.println("nhập c");
        int c = input.nextInt();
        PTbac2 ptb2=new PTbac2(a ,  b , c);

        System.out.println("DELTA ="+ptb2.getDelta());
        if(ptb2.getDelta()>0){
            System.out.println("pt có 2 nghiệm là "+ptb2.root1()+" và "+ptb2.root2());
        } else if(ptb2.getDelta()==0){
            System.out.println("pt có 1 nghiệm kép "+ptb2.root1());
        }else {
            System.out.println("PT vô nghiệm");
        }
    }
}
