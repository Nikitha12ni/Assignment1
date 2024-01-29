package DayThree;
public class AscendingOrder {
	public static void main(String[] args) {
		int[] arr=new int[] {3,1,5,2,4,9,7,5,10};
		System.out.print("Array elements are ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("\nArray elements int ascending order are ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
	}
}
