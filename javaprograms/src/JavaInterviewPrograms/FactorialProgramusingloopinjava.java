package JavaInterviewPrograms;

import java.util.Scanner;

public class FactorialProgramusingloopinjava {

	public static void main(String[] args) 
	{
		int number;
		System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        
        
        //scaneer changed
        scanner.close();
        
		int i,fact=1;  
		 
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  

	

}
