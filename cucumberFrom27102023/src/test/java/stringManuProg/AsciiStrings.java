package stringManuProg;

public class AsciiStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte ascii[]= {65,66,67,68,69,70,80};
		String asci= new String(ascii);
		System.out.println(asci);
		String asci1= new String(ascii,2,5).toLowerCase().toUpperCase().toLowerCase();
		System.out.println(asci1);
		

	}

}
