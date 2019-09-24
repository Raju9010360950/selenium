package JavaInterviewPrograms;

public class FibonacciExample {

	public static void main(String[] args)
	{
		
		int n1=0,n2=1,n3,i=0,j=0,count=10;    
	      System.out.print(n1);//printing 0 and 1
	      System.out.print(" "+n2);
	      for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	      {    
	         n3=n1+n2;    
	         System.out.print(" "+n3);    
	         n1=n2;    
	         n2=n3;    
	      } 
	      System.out.println("");
	      System.out.println("---------------------------------");
	      n1=0;
	      n2=1;
	      n3=0;
	      
	      while(j<5)
	      {
	         n3=n1+n2;
	         n1=n2;
	         n2=n3;
	         j++;
	         System.out.print(n3 +" ");
		
	      }
	}

}
