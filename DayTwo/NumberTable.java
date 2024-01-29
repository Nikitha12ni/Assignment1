package DayTwo;
import java.util.Scanner;
public class NumberTable {
	public static void main(String[] args) {
    int num;
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    for(int i=1;i<11;i++) {
    	System.out.println(num+" * "+i+" = "+num*i);
    }
	}
}
