package DayThree;
public class OddPositionElement {
	public static void main(String[] args) {
		int[] array=new int[]{11,23,34,55,50,78,8,34,4,98,3};
		System.out.println("Array at odd position are ");
		for(int i=1;i<array.length;i=i+2) {
			System.out.println(array[i]);
		}
	}
}
