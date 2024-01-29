package DayTwo;
public class ReverseString {
static String RevString(String str)
{
	String r=" ";
	for(int i=0;i<str.length();i++) {
		r=str.charAt(i)+r;
	}
	return r;
}
	public static void main(String[] args) {
   String str="Good Morning";
   System.out.print("Given string"+str+"\n");
   String rev=RevString(str);
   System.out.print("Reverse of a given string"+rev);
	}
}
