package JavaInterviewPrograms;

public class StringvsStringBuildervsStringBuffer {

	// Concatenates to String
	   public static void concat1(String s1)
	   {
	      s1 = s1 + "Testing Blog";
	      System.out.println(s1);
	   }
	   // Concatenates to StringBuilder
	   public static void concat2(StringBuilder s2)
	   {
	      s2.append("Testing Blog");
	   }
	   // Concatenates to StringBuffer
	   public static void concat3(StringBuffer s3)
	   {
	      s3.append("Testing Blog");
	   }
	   public static void main(String[] args) 
	   {
	      String s1 = "Software";
	      concat1(s1);  // s1 is not changed
	      System.out.println("String: " + s1);
	      StringBuilder s2 = new StringBuilder("Software");
	      concat2(s2); // s2 is changed
	      System.out.println("StringBuilder: " + s2);
	      StringBuffer s3 = new StringBuffer("Software");
	      concat3(s3); // s3 is changed
	      System.out.println("StringBuffer: " + s3);
		

	}

}
