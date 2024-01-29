package DayTwo;
import java.util.Scanner;
public class GuessingTheNumber {
	public static void main(String[] args) {
		int number,guess;
		number=(int) ((Math.random()*10%100)+1);
		Scanner sc=new Scanner(System.in);
		while(true) {
			guess=sc.nextInt();
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
