class EmployeeNameException extends Exception
{
	EmployeeNameException (String message)
	{
		super(message);
	}
}

class TestCustomException
{
	static void employeeNameValidation(String firstName,String lastName) throws EmployeeNameException
	{
		if(firstName.length()== 0 && lastName.length()==0)
			throw new EmployeeNameException("Name is invalid");
		
		else
			System.out.println("Name is valid");
	}

	public static void main(String[] args) 
	{
		java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the firstname :  ");
        String a = scanner.nextLine();
        System.out.println("Enter the  secondname :  ");
        String b = scanner.nextLine();
		try
		{
			employeeNameValidation(a,b);
		}
		catch(EmployeeNameException en)
		{
			System.out.println("Exception occured: "+en.getMessage());
		}  
  }  
}  
			
		
	
