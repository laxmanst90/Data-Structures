package learningHeadFirst;

public class SharpenPencil {

	static int calcArea(int height,int width){
		return height * width;
	}
	
	public static void main(String[] args){
		
	int a = calcArea(7, 12);
	short c = 7;
	int ab=calcArea(c,15);
	int d = calcArea(57,60);
	
	long t=42;
	int f = calcArea((int)t, 17);
	String abcd="2";
	final int laxman = 1234;
	
	byte h = (byte) calcArea(a, ab);
	
	Integer objInt = new Integer(a);
	
	System.out.println(h);
	System.out.println(laxman);
	
	}
}
