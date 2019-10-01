import java.util.Scanner;

class  DecimalToBinary
{
	public static void main(String[] args) 
	{
		int n,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any decimal number");
		n=sc.nextInt();
		System.out.println(Integer.toBinaryString(n));
	}
}
