import java.util.ArrayList;
public class rzyStack extends ArrayList{
	public int getSize(){
		return super.size();
	}
	public Object peek(){
		return super.get(getSize()-1);
	}
	public Object pop(){
		Object o = super.get(getSize() - 1);
		super.remove(getSize()-1);
		return o;
	}
	public void push (Object o){
		super.add(o);
	}
	public String toString(){
		return "stack"+super.toString();
	}
	
}
