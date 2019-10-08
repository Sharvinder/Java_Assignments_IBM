import java.util.Scanner;
class PalindromeDemo
{
	public static void main(String[] args) {
		String str,b="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to check :");
		 str=sc.nextLine();
		int a=str.length();

		for(int i = a-1 ; i >= 0; i--)
		{
			b = b + str.charAt(i);

		}

		if(str.equalsIgnoreCase(b))
		{
			System.out.println("The string entered is Palindrome");
		}

		else
		{
			System.out.println("The string entered is not Palindrome");

		}
		System.out.println(str.length());
	}
}