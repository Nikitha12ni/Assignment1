package DayThree;
public class MaxArray {
	public static void main(String[] args) {
	int[] arr=new int[]	{2,5,6,77,8,9};
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.print("Largest element is "+max);
	}
}
