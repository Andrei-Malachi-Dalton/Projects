import java.util.*;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter a number: ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		
		System.out.print("Please enter another number: ");
		int num2 = input.nextInt();
		
		System.out.println("The sum is: "+ add(num1, num2));
		
	
		
		

	}
	
	public static int add(int a, int b) {
		return a + b;
	}

}
