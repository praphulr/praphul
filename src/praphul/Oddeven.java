package praphul;

import java.until.scanner;

public class Oddeven {

	public static void main(String[] args) {
		int sum=0, sum=0,b,r;
		Scanner sc=new Scanner(system.in);
		int a=sc.nextInt();
		b=a;
		for(int i=0;b!=0;i++)
		{
			r=b%10;
			if(r%2==0)
				sume=sume+r;
			else
				sumo=sumo+r;
			b=b/10;
		}
		System.out.println("sum of even ="+sum);
		System.out.println("sum of odd ="+sumo);
		sc.close();
		}
			
	

}
