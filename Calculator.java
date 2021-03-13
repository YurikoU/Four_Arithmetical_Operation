package InClassPractice;
import java.util.Scanner;

public class Calculator {
	
	static double num1, num2, num3, sum, difference, produce, quotient, howManyNum; //Declare variables
	static char operation; //Declare a variable

	Calculator() { //Create a constructor
		Scanner scan = new Scanner(System.in); //Initialize the scanner class.

		System.out.println("Please enter how many numbers you would like to enter");		
		this.howManyNum = scan.nextDouble(); // Store the input as a double type

		while ((this.howManyNum != 2) || (this.howManyNum != 3)) {
			System.out.println("Please enter either 2 or 3");
			this.howManyNum = scan.nextDouble(); // Store the input as a double type
			if ((this.howManyNum == 2) || (this.howManyNum == 3)) {
				break;
			} 
		}
		
		if ((this.howManyNum == 2) || (this.howManyNum == 3)) {
		
			System.out.println("Please enter the first number: "); // Ask to enter a number
			this.num1 = scan.nextDouble(); // Store the input as a double type
			
			System.out.println("Please enter the second number: "); // Ask to enter another number	
			this.num2 = scan.nextDouble();  // Store the input as a double type
			
			if (2 < this.howManyNum) {
				System.out.println("Please enter the third number: "); // Ask to enter another number	
				this.num3 = scan.nextDouble();  // Store the input as a double type
			}
		
			System.out.println("Please enter the operation: "); // Ask to enter the operation
			this.operation =  scan.next().charAt(0);
		}
	}
	
	
	public double addition() {
		this.sum = this.num1 + this.num2;
		if (2 < this.howManyNum) {
			this.sum = this.sum + this.num3;
		}
		return sum;
	}

	public double subtraction() {
		this.difference =  this.num1 - this.num2;
		if (2 < this.howManyNum) {
			this.difference = this.difference - this.num3;
		}
		return difference;
	}

	public double multiplication() {
		this.produce =  this.num1 * this.num2;
		if (2 < this.howManyNum) {
			this.produce = this.produce * this.num3;
		}
		
		return produce;
	}

	public double division() {
		this.quotient =  this.num1 / this.num2;
		if (2 < this.howManyNum) {
			this.quotient = this.quotient / this.num3;
		}
		return quotient;
	}

	public void operate() {
		switch (operation) {
		case '+':
			addition();
			System.out.println("Addition: " + sum);
			break;
		case '-':
			subtraction();
			System.out.println("Subtraction: " + difference);
			break;
		case '*':
			multiplication();
			System.out.println("Multiplication: " + produce);
			break;
		case '/':
			division();
			System.out.println("division: " + quotient);
			break;
		}
		
	}
	

	
	public static void main(String[] args) {

		Calculator calculator = new Calculator(); //Create a instance
		calculator.operate(); //execute operate()
		
		
	}

}