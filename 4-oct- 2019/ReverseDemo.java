import java.util.Scanner;

class ReverseDemo
{
	public static void main(String[] args) {
		String reverse="",str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string you want to reverse");
		str=sc.nextLine();
		int a=str.length();

		for(int i = a-1 ; i >= 0 ; i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("The reverse of string is:"+ reverse);

		
	}
}
