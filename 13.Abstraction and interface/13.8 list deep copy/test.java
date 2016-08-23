import java.util.ArrayList;
public class test {
	public static void main(String args[]) throws CloneNotSupportedException{
		MyStack list = new MyStack();
		list.push(1);list.push(2);list.push(3);
		MyStack listclone = (MyStack)list.clone();
		
		for(int i=0;i<3;i++)
		if(listclone.pop()==list.pop())
			System.out.println("yes");
	}
}