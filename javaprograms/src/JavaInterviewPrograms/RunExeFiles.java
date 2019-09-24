package JavaInterviewPrograms;

import java.io.IOException;

public class RunExeFiles {

	public static void main(String[] args) 
	{
		 
		      try {
				Runtime.getRuntime().exec("C:\\Windows\\notepad.exe");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
