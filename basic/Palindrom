package Basic;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
        int n=sc.nextInt();
        if(ispalindrom(n)) {
        	System.out.println("Palindrom");
        }else {
        	System.out.println("Not palindrom");
        }
	
	}
	public static boolean ispalindrom(int n) {
		int in=n,div=0;
		while(in>0) {
			int mod=in%10;
	 div=(div*10)+mod;
		  	in=in/10;

		}
		if(n==div) {
			return true;
		}
		return false;
	}
}
