package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int num1 = in.nextInt();
		System.out.println("Enter the second integer: ");
		int num2 = in.nextInt();
		double ave = (num1 + num2) / 2.0;
		
		System.out.println("Average: " + ave);
	}

}
