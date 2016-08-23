import java.util.ArrayList;
import java.util.List;
public class StackOfIntegers {  
	    //存放分解的素数  
	    List<Integer> list = new ArrayList<Integer>();  
	      
	    //主方法，求分解素数  
	    public void getSub(int sum){  
	        //获取中间数的后一个数，保证中间数可以在下面的for中被循环  
	        int middle = getMiddleAfter(sum);  
	        //2是最小的素数，从2开始循环除  
	        for(int i=2;i<middle;i++){  
	            //如果i不为素数，直接跳过，循环下个数  
	            if(!isSuShu(i)){  
	                continue;  
	            }  
	            //余数  
	            int yu = sum%i;  
	            //商  
	            int last = sum/i;  
	            if(yu==0){  
	                //余数为0，i为sum的因子，填入list  
	                list.add(i);  
	                //如果商为素数，则添加商到list，程序结束  
	                if(isSuShu(last)){  
	                    list.add(last);  
	                    return;  
	                }  
	                //如果商不为素数，递归商调用本方法，分解商  
	                getSub(sum/i);  
	                //如果sum可以被素数因子整除，直接分解商，后续的因子不必再循环  
	                break;  
	            }  
	        }  
	    }  
	      
	    //如果可以被2整除，则+1，否则+1后再除以2  
	    public int getMiddleAfter(int num){  
	        if(num%2==0){  
	            return num/2+1;  
	        }else{  
	            return (num+1)/2;  
	        }  
	    }  
	      
	    //判断是否是素数  
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
	    /** 
	     * @param args 
	     */  
	    public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	        StackOfIntegers s = new StackOfIntegers();  
	        s.getSub(175);  
	        System.out.println(s.list);  
	    }  
	  
	}  
