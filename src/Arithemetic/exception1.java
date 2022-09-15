package Arithemetic;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


public class exception1 {
	

	public static void main(String[] args) {
		try
		{
			File f = new File("test.txt");
			FileInputStream stream = new FileInputStream(f);
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub

	}


}
