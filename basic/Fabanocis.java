package Basic;

import java.util.Scanner;

public class Fabanocis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int n=sc.nextInt();
    fabanocis(n);
	}

	public static void fabanocis(int n) {
		int a=0;
	    int b=1;
	 
	    System.out.println(a);
	    System.out.println(b);

		for(int i=2;i<n;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	
	}
}
