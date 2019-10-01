import java.util.Scanner;

class TableOfNumber
{
	public static void main(String[] args)
	 {
	 	Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		System.out.println("Enter limit");
		int limit=s.nextInt();

		for(int i = 1; i <= limit; i++)
		{
			System.out.println(n + "*" + i + "=" + n * i);
		}
	}
}