import java.util.*;
public class array {
	public static void main(String args[]){
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<=10;i++){
			arr.add(i);
		}	
		Collections.shuffle(arr);
		for(int number :arr){
			System.out.println(" "+arr.get(number));
		}
	}
}

