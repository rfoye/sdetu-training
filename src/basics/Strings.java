package basics;

public class Strings {

	public static void main(String[] args) {
		
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word Ring");
		}
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browswer is Chrome");
		}
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "123456789";
		
		// print the initials plus last 4 of SSN
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.println(SSN.substring(5));
	}

}
