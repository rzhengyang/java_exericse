
public class test {
	public static void main(String args[]){
		Complex a = new Complex(3.5, 5.5);
		Complex b = new Complex(-3.5,1);
		System.out.println(a.add(b).toString());
		System.out.println(a.substract(b).toString());
		System.out.println(a.multiply(b).toString());
		System.out.println(a.divide(b).toString());
		System.out.println(a.abs(a));
	}
}
