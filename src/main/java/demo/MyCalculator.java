package demo;

import java.util.Scanner;

public class MyCalculator 
{
	public int mul(int a, int b) {
		
		return a*b;
		
	}

	public static void main(String args[]) {
		
		Scanner myObj = new Scanner(System.in);
		String input = myObj.nextLine();
		
		System.out.println("Hi " +input+ " below is the Answer for your querry");
		
		MyCalculator calc = new MyCalculator();
		System.out.println("Sum is :"+calc.mul(30,10));
		System.out.println("Sum is :"+calc.mul(30,10));
	
	}

}