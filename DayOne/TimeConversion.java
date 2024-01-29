import java.util.Scanner;
public class TimeConversion {
	public static void main(String[] args) {
    int sec;
    int hour,min,s;
    Scanner sc=new Scanner(System.in);
    sec=sc.nextInt();
    hour=sec/3600;
    min=(sec % 3600) / 60;
    sec=sec%60;
    System.out.println(hour+" hours, "+min+" minutes and "+sec+" seconds ");
	}
}
