import java.util.ArrayList;
import java.util.List;
public class StackOfIntegers {  
	    //��ŷֽ������  
	    List<Integer> list = new ArrayList<Integer>();  
	      
	    //����������ֽ�����  
	    public void getSub(int sum){  
	        //��ȡ�м����ĺ�һ��������֤�м��������������for�б�ѭ��  
	        int middle = getMiddleAfter(sum);  
	        //2����С����������2��ʼѭ����  
	        for(int i=2;i<middle;i++){  
	            //���i��Ϊ������ֱ��������ѭ���¸���  
	            if(!isSuShu(i)){  
	                continue;  
	            }  
	            //����  
	            int yu = sum%i;  
	            //��  
	            int last = sum/i;  
	            if(yu==0){  
	                //����Ϊ0��iΪsum�����ӣ�����list  
	                list.add(i);  
	                //�����Ϊ������������̵�list���������  
	                if(isSuShu(last)){  
	                    list.add(last);  
	                    return;  
	                }  
	                //����̲�Ϊ�������ݹ��̵��ñ��������ֽ���  
	                getSub(sum/i);  
	                //���sum���Ա���������������ֱ�ӷֽ��̣����������Ӳ�����ѭ��  
	                break;  
	            }  
	        }  
	    }  
	      
	    //������Ա�2��������+1������+1���ٳ���2  
	    public int getMiddleAfter(int num){  
	        if(num%2==0){  
	            return num/2+1;  
	        }else{  
	            return (num+1)/2;  
	        }  
	    }  
	      
	    //�ж��Ƿ�������  
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
