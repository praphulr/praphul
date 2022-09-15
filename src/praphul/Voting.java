package praphul;

import java.util.Scanner;


public class Voting {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(age>18)
		System.out.println("eligible");
		else
			System.out.println("not eligible");
		sc.close();
	}

		// TODO Auto-generated method stub

	}

