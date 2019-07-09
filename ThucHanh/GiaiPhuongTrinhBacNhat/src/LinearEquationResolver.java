import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as a*x+ b=0, please enter constants: ");
        Scanner scanner= new Scanner(System.in);
        System.out.println("a: ");
        double a= scanner.nextDouble();
        System.out.println("b :");
        double b = scanner.nextDouble();
        if(a != 0){
            double solution = -b/a;
            System.out.println("the solution is : "+ solution);
        }
        else {
            if(b==0){
                System.out.println("The Solution all x ");
            }else {
                System.out.println("No solution");
            }
        }
    }
}
