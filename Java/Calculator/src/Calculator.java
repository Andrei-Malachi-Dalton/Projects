import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter: add, subtract, multiply, divide: ");
		Scanner input = new Scanner(System.in);
		
		String choice = input.nextLine();
		
		if(choice.equals("add")) {
			System.out.print("Please enter a number: ");
			int num1 = input.nextInt();
			System.out.print("Please enter another number: ");
			int num2 = input.nextInt();
			
			int answer = add(num1, num2);
			System.out.print(answer);
		}
		else if(choice.equals("subtract")) {
			System.out.print("Please enter a number: ");
			int num1 = input.nextInt();
			System.out.print("Please enter another number: ");
			int num2 = input.nextInt();
			
			int answer = subtract(num1, num2);
			System.out.print(answer);
		}
		else if(choice.equals("multiply")) {
			System.out.print("Please enter a number: ");
			int num1 = input.nextInt();
			System.out.print("Please enter another number: ");
			int num2 = input.nextInt();
			
			int answer = multiply(num1, num2);
			System.out.print(answer);
		}
		else if(choice.equals("divide")) {
			System.out.print("Please enter a number: ");
			int num1 = input.nextInt();
			System.out.print("Please enter another number: ");
			int num2 = input.nextInt();
			
			if(num2 == 0) {
				System.out.println("Cannot divide by zero");
			}
			else {
				int answer = divide(num1, num2);
				System.out.print(answer);
			}
			
		}
		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static int divide(int a, int b) {
		return a / b;
	}

}
