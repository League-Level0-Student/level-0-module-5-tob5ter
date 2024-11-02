package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Primes {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("type a random number");
		int num = Integer.parseInt(number);
		for(int i = 2; i<num/2+1;i++) {
			System.out.println(num%i);
			if(num%i == 0) {
				System.out.println("your number is not prime");
				return;
			}
			
		}
		System.out.println("Your number is prime");
		
}
}