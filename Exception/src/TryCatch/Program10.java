package TryCatch;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Program10 {

	public static void main(String[] args) {
		
		PrintWriter p;
		try
		{
			p=new PrintWriter("jbc.text");
			p.print("save");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("save");
	}
}
