package L3.mavenproject;

public class tripletofDice {
	
	int firstDie;
	int secondDie;
	int thirdDie;
	
	int firstDiesides;
	int secondDiesides;
	int thirdDiesides;
	
	int firstDieroll;
	int secondDieroll;
	int thirdDieroll;
	
	public tripletofDice(int s1, int s2, int s3) {
		firstDiesides = s1;
		secondDiesides = s2;
		thirdDiesides = s3;
	}
	
	public void rollAllDice() {
		firstDieroll= (int)(Math.random()*firstDiesides) + 1;
		secondDieroll= (int)(Math.random()*secondDiesides) + 1;
		thirdDieroll= (int)(Math.random()*thirdDiesides) + 1;
		
	}
	
	public void rollOneDie(int dienumber){
		if (dienumber == 1){
			firstDieroll= (int)(Math.random()*firstDiesides) + 1;
		}
		
		if (dienumber == 2){
			secondDieroll= (int)(Math.random()*secondDiesides) + 1;
		}
		
		if (dienumber == 3){
			thirdDieroll= (int)(Math.random()*thirdDiesides) + 1;
		}
		
	}
	
	public int getFirstDie(){
		return firstDieroll;
	}
	
	public int getSecondDie(){
		return secondDieroll;
	}
	
	public int getThirdDie(){
		return thirdDieroll;
	}


}
