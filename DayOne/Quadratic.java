import java.util.Scanner;
public class Quadratic {
	public static void main(String[] args) {
		double a,b,c,delta,root1,root2;;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thev value of a");
		a=sc.nextDouble();
		System.out.println("Enter thev value of b");
		b=sc.nextDouble();
		System.out.println("Enter thev value of c");
		c=sc.nextDouble();
		delta=(b*b)-(4*a*c);
		root1=(int) ((-b+Math.pow(delta, 0.5))/(2*a));
		root2=(int) ((-b-Math.pow(delta, 0.5))/(2*a));
		System.out.println("Root value of x are "+root1+" and "+root2);
	}
}
