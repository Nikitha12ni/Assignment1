package DayThree;
public class ElementAtEvenPosition {
	public static void main(String[] args) {
	int[] array=new int[]{1,23,34,565,56,78,8,9,90,0,2};
	System.out.println("Array at even position are ");
	for(int i=0;i<array.length;i=i+2) {
		System.out.println(array[i]);
	}
	}
}
