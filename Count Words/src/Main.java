import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter something: ");
		Scanner scanner = new Scanner(System.in);
		String words = scanner.nextLine();
		
		words = words.trim();
		String[] wörterArray = words.split("\\s+");
		System.out.println();
		System.out.println("Words: "+wörterArray.length);
		
		
		int letterCount = 0;
		
		for (int i = 0; i < words.length(); i++) {
			char zeichen = words.charAt(i);
			if (Character.isLetter(zeichen)) {
				letterCount++;
			}		
		}
		System.out.println();
		System.out.println("Letters: "+letterCount);
		scanner.close();
	}
	

}
