class FibonacciSeries
{
	public static void main(String[] args) 
	{
		int n1=1,n2=1;
		int n3=0;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);

		while(n3<89)
		{
			n3=n1+n2;
			System.out.println(n3);
		    n1=n2;
			n2=n3;
		}
	}
}