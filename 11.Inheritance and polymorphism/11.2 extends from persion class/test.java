public class test {
	public static void main(String args[]){
		Persion p = new Persion();
		Student St = new Student();
		Employee Em = new Employee();
		Faculty Fa = new Faculty();
		Staff Sta = new Staff();
		p.name = "张三";
		p.address = "home";;
		p.phoneNumb = 111;
		p.email = "gmail@gail.com";
		System.out.println(p.toString());
		St.name = "lisi";
		St.classStatus = "大一";
		System.out.println(St.toString());
		Em.salary = "10000";
		Em.email = "mmmy";
		Em.name = "fly";
		Em.workRoom = "washroom";
		System.out.println(Em.toString());
	}	
}
