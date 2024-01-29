import java.util.Scanner;
public class PrintOrderDetails {
public static void main(String[] args) {
		int id,quantity,cost;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter item name");
		name=sc.nextLine();
		System.out.println("Enter order id");
		id=sc.nextInt();
		System.out.println("Enter thw quantity");
		quantity=sc.nextInt();
		System.out.println("Enter toatl cost");
		cost=sc.nextInt();
		System.out.println("Order "+id+" : "+quantity+" of "+name+" for a total of Rs "+cost+" jbdej.");
	}
}
