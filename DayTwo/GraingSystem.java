package DayTwo;
import java.util.Scanner;
public class GraingSystem {
	public static void main(String[] args) {
	int mark;
	char grade;
	Scanner sc=new Scanner(System.in);
	mark=sc.nextInt();
	switch(mark/10) {
	case 10:
	case 9:grade='A';
	       break;
	case 8:grade='B';
	        break;
	case 7:grade='C' ;
	        break;
	case 6:grade='D'  ;
	      break;
	case  5:grade='E';
	       break;
	default:grade='F';
	     break;
	}
	System.out.print("Grade System is: "+grade);
	}
}
