package learningHeadFirst;

import java.util.ArrayList;

public class SimpleDotComLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDotCom objSimpleDotCom = new SimpleDotCom();
		
		int randomNum=(int)(Math.random()*10);
		
		int[] locations={randomNum,randomNum+1,randomNum+2};
		
		
		objSimpleDotCom.setLocationCells(locations);
		int userGuess=5;
		objSimpleDotCom.checkYourSelf(userGuess);
		
		
		ArrayList objArrayList = new ArrayList();
		objArrayList.add(0, "apple");
		objArrayList.add(1,"oranges");
		objArrayList.add(2,"mangoes");
		int index = objArrayList.indexOf(userGuess);
		if(objArrayList.indexOf(2) > 0){
			
		}
		
	}

}
