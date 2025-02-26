package edu.training.jc.simple_output;

public class Task_06 {

	public static void main(String[] args) {
		double a, b, c, res;
		
		a = 3.5;
		b = 4.5;
		c = 5.5;
		
		res = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.println("Значение выражения = " + res);
		
	}

}
