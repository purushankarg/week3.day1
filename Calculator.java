package week3.day1;


public class Calculator {
	public int add(int num1,int num2) {
		return num1+num2;	
	}
	public int add(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	public int sub(int num1,int num2) {
		return num1-num2;
	}
	public double sub(double num1,double num2) {
		return num1-num2;
	}
	
	public int mult(int num1,int num2) {
		return num1*num2;
	}
	public double mult(int num1,double num2) {
		return num1*num2;
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println("Adding two int args = "+ cal.add(2,3));
		System.out.println("Adding three int args = "+ cal.add(1, 2, 3));
		System.out.println("Subtracting two int args = "+ cal.sub(9, 6));
		System.out.println("Subtracting two double args = "+cal.sub(25.5, 12.3));
		System.out.println("Multiplying two int args = "+cal.mult(9, 2));
		System.out.println("Multiplying with double arg = "+cal.mult(12, 2.5));
	}
 
}
