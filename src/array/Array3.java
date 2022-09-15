package array;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int[] array=new int[10];
		int a=0,p=1;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			array[i]=sc.nextInt();
			a+=array[i];
			p=p*array[i];
			
		}
		System.out.println("sum="+a);
		System.out.println("product="+p);

		// TODO Auto-generated method stub

	}

}
