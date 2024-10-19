package _01_algorithms._2_fibonacci;

public class golden_ratio {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int sum = (num1+num2);
		System.out.println("0 1");
		for(int i=0;i<20;i++) {
			System.out.print(sum+" ");
			num1 = num2;
			num2 = sum;
			sum = num1+num2;
		}
	}
}
