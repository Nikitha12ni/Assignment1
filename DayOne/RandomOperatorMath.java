import java.util.Random;
public class RandomOperatorMath {
	public static void main(String[] args) {
		Random r=new Random();
		int oper1=r.nextInt(10) + 1;
		int oper2=r.nextInt(10) + 1;
		int randomChoice=r.nextInt(4) + 1;;
		int oam;
		double result=0;
		char operator=' ';
		switch(randomChoice)
		{
		case 0:operator='+';
		       break;
		case 1:operator='-';
		       break;       
		case 2:operator='*';
		       break;
		case 3:operator='/';
		       break;
		 default:System.out.println("invalid choice");
		    	   
		}
		switch(operator)
		{
		case '+':result=oper1+oper2;
		         break;
		case '-':result=oper1-oper2;
                  break;        
		case '*':result=oper1*oper2;
                  break;	
		case '/':result=oper1/oper2;
                 break;
        default :System.out.println("Unexpexted value");
		}
		System.out.println("Equation is "+oper1+" "+operator+" "+oper2);
		System.out.println("Result is "+result);
	}
}
