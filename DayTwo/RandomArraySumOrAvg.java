package DayTwo;
public class RandomArraySumOrAvg {
	public static void main(String[] args) {
		int avg,sum=0;
		int[] a=new int[75];
		for(int i=0;i<75;i++)
		{
			a[i]=(int) (Math.random()*100%100);
			sum=sum+a[i];
		}
		avg=sum/75;
		for(int i=0;i<75;i++)
		{
			 System.out.println(a[i]);
		}
       System.out.println("Sum is"+sum);
       System.out.print("Avg is"+avg);
	}
}
