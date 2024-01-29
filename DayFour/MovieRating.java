package DayFour;

public class MovieRating {

	public static void main(String[] args) {
	
		int[][] movie =new int[][] {{4,6,2,5},{7,9,2,8},{6,9,3,7}};
		System.out.println(movie[0].length);
		for(int i=0;i<movie[0].length;i++)
		{
			int average=AverageofMovie(movie,i);
			average=average/movie.length;
			System.out.println(average);
		}
		
		
	}

	private static int AverageofMovie(int[][] movie,int index) {
		int avge=0;
		for(int i=0;i<movie.length;i++)
		{
		avge+=movie[i][index];
		
		}
		return avge;
	} 
}
