package JavaInterviewPrograms;

import java.util.Scanner;

public class Factoriall {

	public static void main(String[] args) 
	{
		
		
		 @SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
	      System.out.println("Enter the number:-");
	      int n,fact=1;
	      n=in.nextInt();
	      for(int i=1;i<=n;i++)
	      {
	         fact=fact*i;
	      }
	      System.out.println("Factorial Of"+ " n " + " Is :-" +fact);

	}

}
