package DayFour;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a : ");
		a=sc.nextInt();
		System.out.println("Enter b : ");
		b=sc.nextInt();
		System.out.println("Enter c : ");
		c=sc.nextInt();
		Quadratic(a,b,c);
	}
	static void Quadratic(int a,int b,int c) {
		int delta,root1,root2=0;
		delta=(b*b)-(4*a*c);
		root1=(int) ((-b-Math.pow(delta, 0.5))/(2*a));
		root1=(int) ((-b+Math.pow(delta, 0.5))/(2*a));
		System.out.print("Root are "+root1 +"and"+root2);
	}
}
