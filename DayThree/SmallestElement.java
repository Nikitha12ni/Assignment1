package DayThree;
public class SmallestElement {
	public static void main(String[] args) {
		int[] arr=new int[] {8,5,6,39,8,82,9};
		int small=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		System.out.print("Smallest element is "+small );
}
	}

