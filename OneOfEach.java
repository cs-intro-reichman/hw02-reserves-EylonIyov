
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {	
		int counter = 1;
		// 1 for boy, 0 for girl 
		int gender = (int)(Math.random()*2);
		String genderCounter = "";
		if (gender == 1){
			while (gender == 1) {
				counter ++;
				genderCounter += "b ";
				gender = (int)(Math.random()*2);
			}
			genderCounter += "g ";
			gender = 3;
		}
		if (gender == 0){
			while (gender == 0) {
				counter ++;
				genderCounter += "g ";
				gender = (int)(Math.random()*2);
			}
			genderCounter += "b ";
			gender = 3;
		}
		System.out.println(genderCounter);
			System.out.println("You made it... and you now have " + counter + " children");
		}
	}
	
