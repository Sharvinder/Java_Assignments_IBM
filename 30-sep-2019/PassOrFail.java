import java.util.Scanner;

class PassOrFail
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Three number");
		int num1=s.nextInt();
		int num2=s.nextInt();	
		int num3=s.nextInt();
		int sum=num1+num2+num3;

		if(num1>=40)
        {
        	if(num2>=40)
        	{
        		if(num3>=40)
        		{
        			if(sum>=125)
        			{
        				System.out.println("PASSING");
        			}
        			else
        			{
        				System.out.println("FAILING");
        			}
        		}
        		else
        		{
        			System.out.println("FAILING");
        		}
        	}
        	else
        	{
        		System.out.println("FAILING");
        	}
        }
        else
        {
        	System.out.println("FAILING");
        }
    }
}