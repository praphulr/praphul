package Arithemetic;
import java.util.LinkedList;
import java.util.Scanner;



public class assign9 {

	public static void main(String[] args) {
		int a,b,g;
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		System.out.println(1);
		do
		{
			System.out.println("enter position");
			a=sc.nextInt();
			System.out.println("enter element");
			b=sc.nextInt();
			System.out.println("do u want to add more enter 1");
			g=sc.nextInt();
			l.add(a-1,b);
		
			


			
		}while (g==1);
		System.out.println(1);
		
		
		// TODO Auto-generated method stub

	}

}
