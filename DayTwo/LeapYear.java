package DayTwo;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		int year,f=0;
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year%4==0)
        {
        	if(year%100!=0)
        	{
        		if(year%400==0)
        		{
        			f=1;
        		}
        		else
        		{
        			f=0;
        		}
        	}
        	else {
        		    f=0;
        	}
        }
        else
        {
        	f=0;
        }
        if(f==1)
        {
        	System.out.println("Leap year");
        }
        else {
        	System.out.println("Not a Leap year");
        }
	}
}
