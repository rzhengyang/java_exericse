	import java.util.ArrayList;
import java.util.List;
	public class StackOfIntegers {
		List<Integer> list = new ArrayList<Integer>();
		public void getSub(int sum){  
			for(int i=1;i<=sum;i++){
				if(isSuShu(i)==true){
					list.add(i);  
				}
			}
		}
	    //ÅÐ¶ÏÊÇ·ñÊÇËØÊý  
	    public boolean isSuShu(int num){  
	        boolean flag = true;  
	        for(int i=2;i<num;i++){  
	            if(num%i==0){  
	                flag = false;  
	                break;  
	            }  
	        }  
	        return flag;  
	    }  
	    public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	        StackOfIntegers s = new StackOfIntegers();  
	        s.getSub(120);  
	        System.out.println(s.list);  
	    }  
	}