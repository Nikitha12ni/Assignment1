package DayTwo;
import java.util.Scanner;
public class Eleven {
	public static void main(String[] args) {
		int number,guess,g,i=0;
		number=(int) (Math.random()*100%100+1);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit for  guess \n");
		g=sc.nextInt();
		System.out.println("Enteryour guess \n");
		while(true) {
			guess=sc.nextInt();
			i++;
			if(i>g) {
				System.out.println("You crossed the limit\n");
				break;
			}
			if(guess<number) {
				System.out.println("Too Less\n");
			}
			else if(guess>number) {
				System.out.println("Too High\n");
			}
			else
			{
				System.out.println("Correct guess");
				break;
			}
		}
	}

}
