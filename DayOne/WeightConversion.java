import java.util.Scanner;
public class WeightConversion {
	public static void main(String[] args) {
    int pound;
    double KG;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the weight in pound");
    pound=sc.nextInt();
    KG= pound*0.453592;
    System.out.println("Enter the weight in KG is"+KG);
	}
}