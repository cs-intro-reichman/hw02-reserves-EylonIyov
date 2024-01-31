/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int runs = Integer.parseInt(args [0]);
		int counter2, counter3, counter4;
		int counter = 0;
		double bigCounter = 0;
		counter2 = 0;
		counter3 = 0;
		counter4 = 0;
		bigCounter = 0;
		for (int i = 0; i < runs; i++){
			int gender = (int)(Math.random()*2);
			if (gender == 1){
				while (gender == 1) {
					counter ++;
					gender = (int)(Math.random()*2);
				}
				gender = 2;
				counter++;
			}
			if (gender == 0){
				while (gender == 0) {
					counter ++;
					gender = (int)(Math.random()*2);
				}
				gender = 2;
				counter++;
			}
			if (counter == 2){
				counter2++;
			}
			if (counter == 3){
				counter3++;
			} 
			if (counter >= 4){
				counter4++;
			}
		bigCounter += counter;
		counter = 0;
	}
	double avarage = bigCounter/runs;
	System.out.println("Average: " + avarage + " children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: "+ counter2);
	System.out.println("Number of families with 3 children: "+ counter3);
	System.out.println("Number of families with 4 or more children: "+ counter4);
	int maxCounter = Math.max(counter2, counter3);
	maxCounter = Math.max(maxCounter, counter4);
	if (counter2 == maxCounter){
		System.out.println("The most common number of children is 2.");
	}else if (counter3 == maxCounter) {
		System.out.println("The most common number of children is 3.");
	}else{
		System.out.println("The most common number of children is 4 or more.");

	}
	}
}

