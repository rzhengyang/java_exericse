import java.util.*;
public class array {
	public static void main(String args[]){
		ArrayList<String> arr = new ArrayList<>();
		Date dat = new Date();
		arr.add(dat.toString());
		arr.add("Œ“≤¡≤¡");
		while(arr.isEmpty() == false ){
			System.out.println(arr.get(0));
			arr.remove(0);
		}
	}
}
