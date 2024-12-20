public class CountTheVowles {

	public static void main(String[] args) {
String str="This is a really simple sentence";
method(str);
	}

	public static void method(String str) {
		int count=0;
		int count1=0;
		String t=str.trim();
		for(int i=0;i<t.length();i++) {
			if(t.charAt(i)=='a'||t.charAt(i)=='e'||t.charAt(i)=='i'||t.charAt(i)=='o'||t.charAt(i)=='u') {
		count++;
			}
		else {
			count1++;
		}
	}
		System.out.println("vowles:"+count);
System.out.println("costant:"+count1);
}
}
