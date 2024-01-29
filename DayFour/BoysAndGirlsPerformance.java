package DayFour;
public class BoysAndGirlsPerformance {
	public static void main(String[] args) {
		int totalstudent=435;
		int boypercentage=55;
		int girlpercentage=45;
		int countboys=(totalstudent*boypercentage)/100;
		int countgirls=(totalstudent*girlpercentage)/100;
		int passCountBoys = 0;
        int firstDivCountBoys = 0;
        int Above90CountBoys = 0;
        double firstDivTotalMarksBoys = 0;
        double secondDivTotalMarksBoys = 0;
        int passCountGirls = 0;
        int firstDivCountGirls = 0;
        int Above90CountGirls = 0;
        double firstDivTotalMarksGirls = 0;
        double secondDivTotalMarksGirls = 0;
		for(int i=0;i<countboys;i++)
		{
			double marks=generaterandommarks();
			if(marks>=45)
			{
				passCountBoys++;
				if(marks>=90)
				{
					Above90CountBoys++;
				}
				if(marks>=60)
				{
					firstDivCountBoys++;
					firstDivTotalMarksBoys=+marks;
				}
				else if(marks>=45)
				{
					secondDivTotalMarksBoys=+marks;
				}
			}
			
		}
		for(int i=0;i<countgirls;i++)
		{
			double marks=generaterandommarks();
			if(marks>=45)
			{
				passCountGirls++;
				if(marks>=90)
				{
					Above90CountGirls++;
				}
				if(marks>=60)
				{
					firstDivCountGirls++;
					firstDivTotalMarksGirls=+marks;
				}
				else if(marks>=45)
				{
					secondDivTotalMarksGirls=+marks;
				}
			} 
			
		}  
		double passpercentageofboys=(double) passCountBoys /countboys*100;	
		double firstDivPercentageofboys=(double)firstDivTotalMarksBoys/countboys;
		double averageFirstDivisonMarksBoys=firstDivTotalMarksBoys/firstDivCountBoys;
		double averageSecondDivisonMarksBoys=secondDivTotalMarksBoys/(passCountGirls-firstDivCountBoys);
		double passpercentageofgirls=(double) passCountGirls /countgirls*100;
		double firstDivPercentageofgirls=(double)firstDivTotalMarksGirls/countgirls;
		double averageFirstDivisonMarksGirls=firstDivTotalMarksGirls/firstDivCountGirls;
		double averageSecondDivisonMarksGirls=secondDivTotalMarksGirls/(passCountBoys-firstDivCountGirls);
		double difpasspercentage=passpercentageofboys-passpercentageofgirls;
		double diffirstpasspercentage= firstDivPercentageofboys-firstDivPercentageofgirls;
        System.out.println("For Girls");
        System.out.printf("Percentage of girls who passed: %.2f%%\n", passpercentageofgirls);
        System.out.printf("Percentage of girls in first division: %.2f%%\n", firstDivPercentageofgirls);
        System.out.printf("Number of girls scoring 90%% and above: %d\n", Above90CountGirls);
        System.out.printf("Average marks of first division girls: %.2f\n", averageFirstDivisonMarksGirls);
        System.out.printf("Average marks of second division girls: %.2f\n",averageSecondDivisonMarksGirls);
        System.out.println("For Boys");
        System.out.printf("Percentage of girls who passed: %.2f%%\n", passpercentageofboys);
        System.out.printf("Percentage of girls in first division: %.2f%%\n", firstDivPercentageofboys);
        System.out.printf("Number of girls scoring 90%% and above: %d\n", Above90CountGirls);
        System.out.printf("Average marks of first division girls: %.2f\n", averageFirstDivisonMarksBoys);
        System.out.printf("Average marks of second division girls: %.2f\n",averageSecondDivisonMarksBoys);
        System.out.println("\nDifference in Performance Between Boys and Girls:");
        System.out.printf("Difference in pass percentage: %.2f%%\n", difpasspercentage);
        System.out.printf("Difference in first division percentage: %.2f%%\n", diffirstpasspercentage);

        
	}

	private static double generaterandommarks() {
		// TODO Auto-generated method stub
		return Math.random()*100;
	}
}
