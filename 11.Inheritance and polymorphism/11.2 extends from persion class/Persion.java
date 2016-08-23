public class Persion {
	String name ;
	String address;
	long phoneNumb;
	String email;
	public Persion(){
		;
	}
	public String toString(){
		return this.name+this.address+this.phoneNumb+this.phoneNumb+this.email;
	}
}
class Student extends Persion{
	String classStatus;
	public String toString(){
		return super.name+this.classStatus;
	}
}
class Employee extends Persion{
	String workRoom;
	String salary;
	public String toString(){
		return super.name+this.workRoom+this.salary;
	}
}
class Faculty extends Employee{
	String level;
	public String toString(){
		return super.name+this.level;
	}
}
class Staff extends Employee{
	String position;
	public String toString(){
		return super.name+this.position;
	}
}