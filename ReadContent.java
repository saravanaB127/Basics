package filehandling;           // reading the file                                                            

import java.io.FileReader;
import java.io.IOException;

public class ReadContent {
	

	public static void main(String[] args) {
		String s= " ";
		try
		{
			FileReader tr= new FileReader("//home//saravana//Documents//Java//First.java");
			int i=0;
			
			while((i=tr.read())!= -1)
			{
			//	System.out.print(i);
				System.out.print((char)i);
				s=s+(char)i;
			}
					
		}
		catch(IOException e)
		{
		//	e.printStackTrace();
			System.out.print("Check code");
		}
		
}
}
