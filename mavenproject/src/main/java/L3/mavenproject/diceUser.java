package L3.mavenproject;

public class diceUser {
	
	public static int[] rollOnce() {
		
		tripletofDice(6,6,6);
		
		rollAllDice();
		
		return(getFirstDie(), getSecondDie(), getThirdDie() );
	}
	
	public static void main(String [] args) {
		int [] dice = rollOnce();
		System.out.println("The die number 1 is a " + dice[0]);
		System.out.println("The die number 2 is a " + dice[1]);
		System.out.println("The die number 3 is a " + dice[2]);
		
	}
}
