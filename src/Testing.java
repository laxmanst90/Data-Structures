import java.io.IOException;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Runtime rt = Runtime.getRuntime();
		try {
			Process value=rt.exec("ps cax | grep chrome | wc -l");
			System.out.println("Value at index 0 : "+value.toString().indexOf(0));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
