public class test {
	public static void main(String args[]){
		fan t1 = new fan();
			t1.setspeed(t1.FAST);
			t1.setradius(10);
			t1.setcolour("yellow");
			t1.seton(true);
			System.out.println(t1.toString());
		fan t2 = new fan();
			t2.setspeed(t2.MEDIUM);
			t2.setradius(5);
			t2.setcolour("blue");
			t2.seton(false);
			System.out.println(t2.toString());
	}
}
