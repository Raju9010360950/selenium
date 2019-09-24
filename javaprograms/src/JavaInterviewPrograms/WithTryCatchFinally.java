package JavaInterviewPrograms;

public class WithTryCatchFinally {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
	      try
	      {
	         int i=8;
	         int z=i/0;
	         System.out.println("Executed Sucessfully"+z);
	      }
	      catch(ArithmeticException e)
	      {
	         System.out.println(e.getMessage());
	      }
	      finally
	      {
	         System.out.println("Finally Block Executed");
		
	      }
	}

}
