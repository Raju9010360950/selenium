package JavaInterviewPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayListReverse {

	public static void main(String[] args)
	{
		
		 // TODO Auto-generated method stub
	      ArrayList<String> list = new ArrayList<String>();
	      list.add("Java");
	      list.add("Cric");
	      list.add("Play");
	      list.add("Watch");
	      list.add("Glass");
	      Collections.reverse(list);
	      System.out.println("Results after reverse operation:");
	      for(String str: list)
	      {
	         System.out.println(str);
	      }


	}

}
