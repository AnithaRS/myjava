package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		}
	
		int ans=method(a);
		System.out.println(ans);
	}
	public static int method(int[] a) {
		
		int min=Integer.MAX_VALUE;
		 for(int i=0;i<a.length;i++) {
			 if(min>a[i]) {
				 min=a[i];
			 }
		 }return min;
		
		
	}

}
