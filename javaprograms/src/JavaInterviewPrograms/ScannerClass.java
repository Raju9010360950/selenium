package JavaInterviewPrograms;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) 
	{
		
		 // TODO Auto-generated method stub
	      @SuppressWarnings("resource")
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Name: -");
	      String name=sc.nextLine();
	      System.out.println("Enter Age: -");
	      int age=sc.nextInt();
	      System.out.println("Entered Name Is - "+name);
	      System.out.println("Entered Age Is"+ age);
		

	}

}
