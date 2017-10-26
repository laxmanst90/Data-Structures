package learningHeadFirst;

 public class Dog{

private int height;
private int weight;

public void setHeight(int ht){
if(ht > 0){
this.height=ht;
}else{
	System.out.println("You guys are sick!!!You have given a value which shouldnt be passed to a dog, fine i will give a default value");
	this.height=20;
}
}

public void setWeight(int wt){
this.weight=wt;
}

public int getHeight(){
	if(height == 0){
		System.out.println("You have called getHeight directly, I am setting a default value, please call the setHeight()");
		height=20;
	}
	System.out.println("height is:"+height);
return height;
}

public int getWeight(){
return weight;
}


}
