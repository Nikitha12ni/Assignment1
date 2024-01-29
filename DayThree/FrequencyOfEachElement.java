package DayThree;
public class FrequencyOfEachElement {
	public static void main(String[] args) {
		int[] arr=new int[] {1,1,3,4,5,5,6,1,3,3,4,1};
		int z=0;
		for(int i=0;i<arr.length;i++)
		{
			z=0;
			for(int j=i+1;j<arr.length;j++)
			{
			 if(arr[i]==arr[j]&&arr[i]!=0)	
			   {
				z++;
				arr[j]=0;		
			      }
			}
			if(arr[i]!=0) {
				System.out.println("frequency of "+arr[i]+" is "+z);
			}
		}
	}
}
