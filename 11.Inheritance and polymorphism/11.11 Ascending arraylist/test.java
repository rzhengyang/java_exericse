import java.util.ArrayList;
import java.util.Collections;
public class test {
	public static void main(String args[]){
		ArrayList<Integer> rr= new ArrayList<>();
		rr.add(1);rr.add(6);rr.add(3);rr.add(2);rr.add(8);rr.add(3);
		for(int i=0;i<rr.size();i++)
			System.out.print(" "+rr.get(i));
		System.out.println();
		sort(rr);
		for(int i=0;i<rr.size();i++)
			System.out.print(" "+rr.get(i));
	}
	public static void sort(ArrayList<Integer> list){
		Collections.sort(list);
	}
}
