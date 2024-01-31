/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		int wordSize = word.length();
		String wordNew = "";
		char middle = word.charAt((wordSize/2) -1);
		for (int i = 1; i<= wordSize; i++){
			wordNew += word.charAt(wordSize-i);
		}
		System.out.println(wordNew);
		System.out.println("The middle character is " + middle);
	}
}
