package DayFive;
public class EncryptNmaes {
	public static void main(String[] args) {
	String[] names= {"Nikitha Shetty","Sharavi Rai","Nishan Poojari","Asha Nayak","Nireeksha Rao"};
	String[] encryptedName=encryption(names);
	System.out.println("Original name");
	printname(names);
	System.out.println("\nReverse");
	printname(encryptedName);
	}
	private static void printname(String[] names) {
		for(String name:names) {
			System.out.println(name);
		}
	}
	private static String[] encryption(String[] names) {
		String[] encryptedname=new String[names.length];
		for(int i=0;i<encryptedname.length;i++)
		{
			String[] name=names[i].split(" ");
			String firstname=name[0];
			String secondname=name[1];
			String encryptedfirstname=encrypted(firstname,1);
			String encryptedsecondname=encrypted(secondname,-1);
			encryptedname[i]=encryptedfirstname+" "+encryptedsecondname;
		}
		return encryptedname;
	}
	private static String encrypted(String name, int i) {
		StringBuilder encrypt=new StringBuilder();
		for(char ch:name.toCharArray())
		{
			if(Character.isLetter(ch))
			{
				char shiftchar=(char)(ch+i);
				if((Character.isLowerCase(shiftchar)&&shiftchar>'z' ) || (Character.isUpperCase(shiftchar)) &&shiftchar>'Z' )
				{
					shiftchar-=26;
					encrypt.append(shiftchar);
				}
				
				else
				{
					encrypt.append(shiftchar);
				}
			}
			else {
				encrypt.append(ch);
			}
		}
		return encrypt.toString();
	}
}
