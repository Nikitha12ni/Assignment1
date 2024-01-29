import java.util.Scanner;
public class SpeedConversion {
	public static void main(String[] args) {
		int kph,mps;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the speed in km/h");	
		kph=sc.nextInt();
		mps=kph*1000/3600;
		System.out.print("Enter the speed in m/s is:"+mps);
	}
}
