import java.util.Scanner;

public class ComputeMarks {
	public static void main(String[] args) {
	String name;
	int phy,che,mat,total;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the student name");
	name=sc.nextLine();
	System.out.print("Enter the physics marks");
	phy=sc.nextInt();
	System.out.print("Enter the chemistry marks");
	che=sc.nextInt();
	System.out.print("Enter the mathematics marks");
	mat=sc.nextInt();
	total=(phy+che+mat)/3;
	System.out.println(name+" obtained following % of marks in PCM:\r\n"+ "Physics: "+phy+" , Chemistry : "+che+" , Maths : "+mat+"\r\n"+ "Total : "+total);
	}
}
