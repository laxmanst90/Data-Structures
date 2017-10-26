package learningHeadFirst;

public class SimpleDotCom {
private int numberOfHits;
private int[] locationCells;

public void setNumberOfHits(int n){
	this.numberOfHits = n;
}

public int getNumberOfHits(){
	System.out.println("No of hits::"+numberOfHits);
	return numberOfHits;
}

public void setLocationCells(int[] cells){
	this.locationCells=cells;
}

public int[] getLocationCells(){
	return locationCells;
}


public void checkYourSelf(int guess){
	//int guessNumber=Integer.parseInt(guess);
	String result="miss";
	for (int i=0;i<getLocationCells().length;i++){
		if(guess == (locationCells[i])){
			numberOfHits=numberOfHits+1;
			System.out.print("found at index "+i+"\n");
			result ="Hit";
		}
	}
	if(numberOfHits==getLocationCells().length){
		result="kill";
	}
	System.out.println("Result is : "+result);
}

}
