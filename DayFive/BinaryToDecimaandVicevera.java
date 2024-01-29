package DayFive;

import java.util.Scanner;

public class BinaryToDecimaandVicevera {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string -binary");
		String str=sc.nextLine();
		int binary=binaryconverter(str);
		System.out.println(binary);
        System.out.println("Enter the digit");
        int dig=sc.nextInt();
        String digit=decimaconverter(dig);
    	System.out.print(digit);
    	String a="110";
    	String b="110";
		comp2bin(a,b);
		
	}

	private static void comp2bin(String a, String b) {
		if(a.equals(b))
		{
			System.out.println("Equals");	
		}
		else
		{
			System.out.println("Not Equals");	
		}
	}

	private static String decimaconverter(int dig) {
		
		int num=dig;
		String str="";
		int a=0;
		while(num!=0)
		{
			a=num%2;
			str=Integer.toString(a)+str;
			num=num/2;
		}
	
		return str;
	}

	private static int binaryconverter(String str) {
		int binary=Integer.parseInt(str);
		int i=0,rem=0,dig=0;
		while(binary!=0)
		{
			rem=binary%10;
			dig=(int) (dig+(Math.pow(2,i)*rem));
			i++;
			binary=binary/10;
		}
		return dig;
	}

}
