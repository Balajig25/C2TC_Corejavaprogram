package day1.basics;

import java.util.Scanner;
public class additionscanner {

		public static void main(String[] args) {
			int a,b,c;
			Scanner s=new Scanner(System.in);
			System.out.println("enter the value of a :");
			a=s.nextInt();
			System.out.println("enter the value of b : ");
			b=s.nextInt();
			c=a+b;
			System.out.println("addition of a="+a+" and b="+b+" is "+c);
		}
}
