package stringManuProg;

import java.util.Vector;

public class StringLiterals {

	public static void main(String[] args) {
		
		String str = "abcd";
		//str=addNextLine();
		System.out.println("abcd".length());
		System.out.println(str.toUpperCase().charAt(0));
		// System.out.println(str.getChars(0, 0, null, 0));
		System.out.println("new prog");

		// String s = “This is a Demo program”;
		String ss= "This is a demo456789011 Prog";
		int start = 10, end = 20;
		char buf[] = new char[10];
		ss.getChars(start, end, buf, 0);
		System.out.println(buf);
		//char[] ch= new char[str];
		//str.toCharArray();
		System.out.println(str.toCharArray());
		Vector<Integer> v1= new Vector<>();
		for(int i=0;i<=10;i++) {
			v1.add(i);
		}
		System.out.println("checking the values in vector v1");
		for(int value: v1) {
			System.out.println(value);
		}
		System.out.println();
		}

}
