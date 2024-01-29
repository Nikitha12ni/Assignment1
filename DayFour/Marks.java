package DayFour;
public class Marks {
	public static void main(String[] args) {
		int totalstudent=435;
		double[] marks=RandomMarks(totalstudent);
		AvgandPercent(marks);
	}
	static double[] RandomMarks(int n)
	{
		double[] mark=new double[n];
		for(int i=0;i<n;i++)
		{
			mark[i]=Math.random()*100;
			System.out.print(mark[i]+"\t");
		}
		return mark;	
	}
	static void AvgandPercent(double[] mark) {
		int passcount=0;
	    int firstcount=0;
		int count90above=0;
		double avgfirst=0;
		double avgsecond=0;
		for(double m:mark)
		{
			if(m>=40)
			{
				passcount++;
				
			
			if(m>=90)
			{
				count90above++;
			}
			if(m>=60)
			{
                firstcount++;
				avgfirst=+m;
			}
			else if(m>=45) {
				avgsecond=+m;
			}
			
			}
		}
		double passpercentage=(double)passcount/mark.length*100;
        double firstpercentage=(double)firstcount/mark.length*100;
        double averageoffirst=avgfirst/firstcount;
        double averageofsecond=avgsecond/(passcount-firstcount);
        System.out.println("\nPercentage of pass is "+passpercentage+"%");
        System.out.println("Percentage of first division is "+firstpercentage+"%");
        System.out.println(count90above+" students scored above 90%");
        System.out.println("Average marks of first divison is "+averageoffirst);
        System.out.println("Average marks of second divison is "+averageofsecond);
        
        
	}
}
