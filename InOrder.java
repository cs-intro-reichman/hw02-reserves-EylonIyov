/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int numOld=0, numNew;
		String order = "";
		numNew = (int)(Math.random()*10);
		do {
			order += numNew;
			numOld = numNew;
			numNew = (int)(Math.random()*10);
			if (numNew >= numOld) {
				order += " ";
			}
		}while(numNew >= numOld);
		System.out.println(order);
	}
}
