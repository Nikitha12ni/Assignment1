package DayFour;

import java.util.Scanner;

public class SinAndCosSeries {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double deg=sc.nextDouble();
        double rad;
        rad=deg * Math.PI / 180.0;
        int len=10;
        double sinseries=compute(rad,len,"sin");
        double cosseries=compute(rad,len,"cos");
        System.out.println("SIN values is "+sinseries);
        System.out.println("COS values is " +cosseries);
	}

	private static double compute(double rad, int len, String string) {
		double value=0;
		for(int i=0;i<len;i++)
		{
			double res=0;
			if(string.equals("sin"))
			{
				res=Math.pow(-1,i)*Math.pow(rad, 2*i+1)/fac(2*i+1);
			}
			else if(string.equals("cos"))
			{
				res=Math.pow(-1,i)*Math.pow(rad, 2*i)/fac(2*i);
			}
			value+=res;
		}
		return value;
	}

	private static double fac(int i) {
		 return (i== 0 || i == 1) ? 1 : i * fac(i- 1);
	}
}
