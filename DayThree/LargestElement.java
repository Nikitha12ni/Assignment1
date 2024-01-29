package DayThree;
public class LargestElement {
	public static void main(String[] args) {
		int[] arr=new int[] {2,5,6,3,8,8,9};
		int larg=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>larg)
			{
				larg=arr[i];
			}
		}
		System.out.print("Largest element is "+larg );
}
}