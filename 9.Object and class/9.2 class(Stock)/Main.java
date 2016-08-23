package Stock;

public class Main{
		public static void main(String arg[]){
			stock a= new stock("ORCL","Oracle Corporation",34.5,34.35);
			System.out.println(a.name + "  "+a.symbol+"  "+a.getChangePercent());
		}
}