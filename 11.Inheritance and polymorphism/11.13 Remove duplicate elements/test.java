import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class test {
	public static void main(String args[]){
		ArrayList<Integer> rr= new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		//
		for(int i=0;i<10;i++)
			rr.add(input.nextInt());
		//
		for(int i=0;i<rr.size();i++)
			System.out.print(" "+rr.get(i));
		System.out.println();
		rr=removeDuplicate(rr);
		for(int i=0;i<rr.size();i++)
			System.out.print(" "+rr.get(i));
		input.close();
	}
	public static void sort(ArrayList<Integer> list){
		Collections.sort(list);
	}
	public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
		ArrayList<Integer> remove= new ArrayList<>();
		for(int i=0;i<list.size();i++){
			//remove中没有出现过
			boolean flag=false;
			for(int j=0;j<remove.size();j++){
				if(remove.get(j)==list.get(i)){
					flag = true;
					break;
				}
			}
			if(flag == false) 
				remove.add(list.get(i));
		}
			return remove;
	}
}
