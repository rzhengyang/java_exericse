//12-10
import java.util.ArrayList;
public class test {
	public static void main(String args[]){
		ArrayList<Integer> aa = new ArrayList<>();
		
			try{
				while(true)
					aa.add(1);
			}
			catch(OutOfMemoryError ex){
				System.out.println("Yes out of memory");
			}
	}
}