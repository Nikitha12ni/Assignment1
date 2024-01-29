package DayThree;
public class SecondLargest {
	public static void main(String[] args) {
		int[] array=new int[] {1,10,8,5,8,2,11};
		int sec=array[0];
		int larg=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>larg)
			{
				sec=larg;
				larg=array[i];
			}
		}
		System.out.println("Second Lagrest is "+sec);
	}
}
