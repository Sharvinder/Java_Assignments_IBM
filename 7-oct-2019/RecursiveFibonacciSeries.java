class MainDemo
{
	public static void main(String[] args)
	 {
	 	java.util.Scanner sc=new java.util.Scanner(System.in);
	 	System.out.println("Enter the value of n : ");
	 	int n=sc.nextInt();
	 	System.out.println("\n"+"The Recursive Fibonacci Sequence is :" );
	 	
	 	RecursiveFibonacciSeries rs=new RecursiveFibonacciSeries();
	 	
	 	for(int i = 0; i <= n; i++)
	 		System.out.println(rs.fib(i));
	 		System.out.println("\n"+"The nth value of  Recursive Fibonacci Sequence is :"+ "\n"+ rs.fib(n)); 
	 	}
	 }

	  class RecursiveFibonacciSeries
	  {
	  	static int fib(int n)
	  	{
	  		if(n <=1 )

	  			return n;

	  		return fib(n - 1) + fib(n - 2);
	  	}
}