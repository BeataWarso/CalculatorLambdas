import java.util.Scanner;

public class CalculatorLambdas {
	
	interface Operations {
		double operand(double a, double b);
	}

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner scan = new Scanner(System.in);
		System.out.println("Type first number");
		double c = scan.nextDouble();

		System.out.println("Type second number");
		double d = scan.nextDouble();
	
		Operations add = (a, b) -> (a + b);
		Operations sub = (a, b) -> (a - b);
		Operations multi = (a, b) -> (a * b);
		Operations div = (a, b) -> (a / b);
		Operations mod = (a,b) -> (a % b);

		System.out.println("Divide = "+div.operand(c,d));
		System.out.println("Multiply = "+multi.operand(c,d));
		System.out.println("Substract = "+sub.operand(c,d));
		System.out.println("Add = "+add.operand(c,d));
		System.out.println("Modulo= "+mod.operand(c,d));
	
	
	}
	
	

}
