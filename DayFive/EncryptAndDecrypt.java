package DayFive;

public class EncryptAndDecrypt {

	public static void main(String[] args) {
		String[] names= {"Nikitha Shetty","Sharavi Ai","Nishan Poojari","Asha Nayak","Nireeksha Rao"};
		String[] encryptedName=encryption(names);
		String[] decryptName=decryption(encryptedName);
		System.out.println("Original name");
		printname(names);
		System.out.println("\nReverse");
		printname(encryptedName);
		System.out.println("\nDecrypted");
		printname(decryptName);
		}
		private static String[] decryption(String[] encryptedName) {
		
			String[] decryptedname=new String[encryptedName.length];
			for(int i=0;i<decryptedname.length;i++)
			{
				String[] name=encryptedName[i].split(" ");
				String firstname=name[0];
				String secondname=name[1];
				String encryptedfirstname=encrypted(firstname,-1);
				String encryptedsecondname=encrypted(secondname,1);
				decryptedname[i]=encryptedfirstname+" "+encryptedsecondname;
			}
			return decryptedname;
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
					char base = Character.isUpperCase(ch) ? 'A' : 'a';
					char shiftchar=(char) ((ch-base+i+26)%26+base);
	                
					
					if ((Character.isLowerCase(shiftchar)&&shiftchar<'a')||(Character.isUpperCase(shiftchar)&&shiftchar<'A')) {
						shiftchar+=1;
						encrypt.append(shiftchar);
					}
					if((Character.isLowerCase(shiftchar)&&shiftchar>'z' ) || (Character.isUpperCase(shiftchar)) &&shiftchar>'Z' )
					{
						shiftchar-=26;
						encrypt.append(shiftchar);
					}
					else if ((Character.isLowerCase(shiftchar)&&shiftchar<'a')||(Character.isUpperCase(shiftchar)&&shiftchar<'A')) {
						shiftchar+=1;
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


