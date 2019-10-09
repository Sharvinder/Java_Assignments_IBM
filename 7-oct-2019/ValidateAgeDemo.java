class InvalidAgeException extends Exception
{  
    InvalidAgeException(String exceptionText)
    {  
        super(exceptionText);  
    }    
}


class ValidateAgeDemo extends Exception
{
	static void validateAge(int age) throws InvalidAgeException
	{
		if(age<15)
		{
            throw new InvalidAgeException("Age should be greater than 15");
        }
        else
        {
            System.out.println("The provided age is valid");
        }
    }
    
    public static void main(String[] args) 
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the age of person :  ");
        int age = scanner.nextInt();
        
        try
        {
            validateAge(age);
        }
        catch(InvalidAgeException ex)
        {
            System.out.println("Caught Exception - Age is less than 15");
        }
    }
}

