package Stock;

public class stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	stock(){
		;
	}
	stock(String a1,String a2,double a,double b){
		symbol=a1;
		name = a2;
		previousClosingPrice=a;
		currentPrice=b;
	}
	double getChangePercent(){
		return Math.abs (previousClosingPrice-currentPrice)/currentPrice;
	}
}
