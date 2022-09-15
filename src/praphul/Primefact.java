package praphul;

import java.util.Scanner;

public class Primefact {

	public static void main(String[] args) {
		int a,b,i,f=0,k;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for (k = 1;k<=8; k++)
		{
			
			
			if (a % k == 0)
			{
				
				
				b=k/2;
				i=2;
				f=0;
				while(i<=b)
				{
					if(k%i ==0)
					{
						f++;
						
					}
					i++;
					
					
				}
				if (f==0)
					System.out.println(k);
			}
		
				
					
			
			sc.close();
		}
	
}
}			
