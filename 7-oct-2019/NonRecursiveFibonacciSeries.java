class NonRecursiveFibonacciSeries
{
	public static void main(String[] args)
	 {
	 	java.util.Scanner sc=new java.util.Scanner(System.in);
	 	System.out.println("Enter the value of n :");
	 	int n=sc.nextInt();
	 	System.out.println("\n"+"The non-recursive sequence is :");
	 	System.out.println("\n"+"The nth value of  Non-Recursive Fibonacci Sequence is :"+ "\n"+ fib(n)); 
	 }
	 
	 static int fib(int n) 
    { 
        int a = 0, b = 1, c=0; 
        System.out.println(a);
        System.out.println(b);

        if (n == 0)
        	System.out.println(a);

        	 for (int i = 2; i <= n; i++) 
        	 {
        	 	c = a + b;
        	 	System.out.println(" "+ c);
        	 	a = b; 
              	b = c;
              }

              return c;
          }
      } 
