class ReplaceWord
{
	public static void main(String[] args)
	 {
	 	java.util.Scanner sc=  new java.util.Scanner(System.in);
	 	System.out.println("Enter the old term:");
		String old = sc.nextLine();

		System.out.println("Enter the search term:");
		String search = sc.nextLine();

		System.out.println("Enter the replace term:");
		String replace = sc.nextLine();

		String result = old.replace(search, replace);

		System.out.println("The new term after replacement is :" + result);

		sc.close();
	}

}
	 