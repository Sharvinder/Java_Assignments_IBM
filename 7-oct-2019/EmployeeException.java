package com.cg.eis.exception;

class EmployeeException extends Exception
{
	public  EmployeeException(String message)

	{  
        super(message);  
    }    
}


class EmployeeSalaryDemo extends Exception
{
	static void validateSalary(int salary) throws EmployeeException
	{
		if(salary<3000)
		{
            throw new EmployeeException("Salary should be greater than 3000");
        }
        else
        {
            System.out.println("The given salary is valid");
        }
    }
    
    public static void main(String[] args) 
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the salary of employee :  ");
        int salary = scanner.nextInt();
        
        try
        {
            validateSalary(salary);
        }
        catch(EmployeeException ex)
        {
            System.out.println("Caught Exception - Salary is less than 3000" + ex.getMessage());
        }
    }
}

	
