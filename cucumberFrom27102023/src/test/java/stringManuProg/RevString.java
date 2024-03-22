package stringManuProg;

public class RevString {

	public static void main(String[] args) {
		String s= "abcdeddfefr";
		String rev= "";
		int l=s.length();
		for(int i=l-1;i>=0;i--) {
			rev= rev+s.charAt(i);
		}
		System.out.println(rev);
		System.out.println("new prog");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println("new prog");
		String str= "Abcd";
				StringBuffer sb= new StringBuffer(str);
				//sb.reverse();
				System.out.println(sb.reverse());
				

	}
}
