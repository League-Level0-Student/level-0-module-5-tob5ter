package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		float number1 = Float.parseFloat(input1);
		float number2 = Float.parseFloat(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);
		
		// 3) Call the correct method depending on what option the user chooses
		if(task==0) {
			divide(number1, number2);
		}
		else if(task==1){
			multiply(number1, number2);	
		}
		else if(task==2) {
			subtract(number1, number2);
		}
		else if(task ==3) {
			add(number1, number2);
		}
		
		
		
		// 4) Call the result() method and put the answer in a pop-up
	}
	
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	public static void divide(float number1, float number2) {
		JOptionPane.showMessageDialog(null, number1/number2);
	}
	public static void multiply(float number1, float number2) {
		JOptionPane.showMessageDialog(null, number1*number2);
	}
	public static void subtract(float number1, float number2) {
		JOptionPane.showMessageDialog(null, number1-number2);
	}
	public static void add(float number1, float number2) {
		JOptionPane.showMessageDialog(null, number1+number2);
	}
	
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	
}
