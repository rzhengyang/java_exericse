
public class test {
	public static void main(String args[]){
		String inputString[] = args[0].split(" ");
		String input1String[] = inputString[0].split("\\/");
		String input2String[] = inputString[2].split("\\/");
		long numerator1 = Integer.parseInt(input1String[0]);
		long denominator1 = Integer.parseInt(input1String[1]);
		long numerator2 = Integer.parseInt(input2String[0]);
		long denominator2 = Integer.parseInt(input2String[1]);
		Rational first = new Rational(numerator1,denominator1);
		Rational second = new Rational(numerator2,denominator2);
		System.out.println(first.add(second).toString());
		
		/*System.out.println(inputString[0]+" "+inputString[1]+" "+inputString[2]);
		System.out.println(input1String[0]+" "+input1String[1]);
		System.out.println(input2String[0]+" "+input2String[1]);*/
	}
}		
