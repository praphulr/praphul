package array;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		int[] array=new int[10];
		int l=0,s=0;
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<4;i++)
		{
			array[i]=sc.nextInt();
		}
		l=array[0];
		s=array[0];
		for(int i=0;i<4;i++)
			{
				if (array[i]>l)
					l=array[i];
				if(array[i]<s)
					s=array[i];
				
			}System.out.println(l+" is lagest");
			System.out.println(s+" is smallest");
		}
			
		// TODO Auto-generated method stub

	

}
