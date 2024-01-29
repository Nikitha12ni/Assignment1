package DayTwo;
public class ArrayOfThree {
	public static void main(String[] args) {
	int[] n=new int[10];
	int j=0;
	for(int i=1;i<31;i++)
	{
		if(i%3==0)
		{
			n[j++]=i;
		}
	}
	for(int i=0;i<10;i++)
	{
		System.out.println(n[i]);
	}
	}
}
