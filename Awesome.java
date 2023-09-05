package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Awesome {

	public static void main(String[] args) {
		try
		{
			FileWriter fw = new FileWriter("//home//saravana//Documents//Untitled Folder//Awesome.java",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("public class Awesome"+"\n");
			bw.write("{"+"\n");
			bw.write("public static void main(String[] args) {"+"\n");
			bw.write("System.out.println(\"Awesome\");"+"\n");
			bw.write("}"+"\n");
			bw.write("}"+"\n");
			bw.close();
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	}


