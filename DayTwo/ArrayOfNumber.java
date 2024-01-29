package DayTwo;
public class ArrayOfNumber {
	public static void main(String[] args) {
     int[] n=new int[10];
     for(int i=0;i<10;i++)
     {
    	 n[i]=(i+1)*(i+1);
     }
     for(int i=0;i<10;i++)
     {
    	 System.out.println(n[i]);
     }
	}
}
