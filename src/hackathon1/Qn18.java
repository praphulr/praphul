package hackathon1;
import java.util.Scanner;
public class Qn18 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in pattern?");
		int rows = sc.nextInt();
		System.out.println("Here is your pattern !");
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
			

	sc.close();
	}
}
