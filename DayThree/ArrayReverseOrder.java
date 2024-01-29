package DayThree;
public class ArrayReverseOrder {
	public static void main(String[] args) {
	int[] array=new int[]	{1,2,34,5,5,6,7,8,9,10};
	System.out.println("Array element are");
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+"\t");
	}
	System.out.println("\nArray in reverse order");
	for(int i=array.length-1;i>=0;i--)
	{
		System.out.print(array[i]+"\t");
	}
	}
}
