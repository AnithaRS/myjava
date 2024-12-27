package Basic;

import java.util.Scanner;

public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {54,32,87,43,76};
		int largest=l_array(a);
	   System.out.println(largest);
	}

	public static int l_array(int[] a) {
		int max=Integer.MIN_VALUE;
		for(int ans:a) {
			if(max<ans) {
				max=ans;
			}
		}return max;
	}
	
}
