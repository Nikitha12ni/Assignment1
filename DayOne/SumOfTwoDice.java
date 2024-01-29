public class SumOfTwoDice {
	public static void main(String[] args) {
		double randomNumber1=Math.floor(Math.random()*10)%6+1;
		double randomNumber2=Math.floor(Math.random()*10)%6+1;
		double sum;
		sum=randomNumber1+randomNumber2;
		System.out.println("Sum of two random integer is "+sum);
	}
}
