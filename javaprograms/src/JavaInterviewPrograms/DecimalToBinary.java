package JavaInterviewPrograms;

import java.util.Scanner;

public class DecimalToBinary {

	public void printBinaryFormat(int number)
	   {
	      int binary[] = new int[25];
	      int index = 0;
	      while(number > 0)
	      {
	         binary[index++] = number%2;
	         number = number/2;
	      }
	      System.out.print("Binary Value Of Given Number:12");
	      for(int i = index-1;i >= 0;i--){
	         System.out.print(binary[i]);
	      }
	   } 
	   public static void main(String a[])
	   {
	      @SuppressWarnings("resource")
	      Scanner input=new Scanner(System.in);
	      System.out.println("Enter a Decimal number");
	      Integer binr=Integer.parseInt(input.nextLine());
	      DecimalToBinary dtb = new DecimalToBinary();
	      dtb.printBinaryFormat(binr);

	}

}
