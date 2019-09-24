package JavaInterviewPrograms;

public class Stringreplace {

	public static void main(String[] args) 
	{
		
		String s1="javatpoint is a very good website";  
		String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"  
		System.out.println(replaceString); 
		
		
		String s2="My name is Khan. My name is Bob. My name is Sonoo.";  
		String replaceemptyspces=s2.replaceAll("\\s","");  
		System.out.println(replaceemptyspces);  
		

	}

}
