
public class Complex {
	private double real = 0;
	private double imaginary = 0;
	Complex(double real,double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	public Complex add(Complex input){
		double r = this.real+input.real;
		double i = this.imaginary+input.imaginary;
		return new Complex(r,i);
	}
	public Complex substract(Complex input){
		double r = this.real-input.real;
		double i = this.imaginary-input.imaginary;
		return new Complex(r,i);
	}
	public Complex multiply(Complex input){
		double r = this.real*input.real-this.imaginary*input.imaginary;
		double i = this.imaginary*input.real+this.real*input.imaginary;
		return new Complex(r,i);
	}
	public Complex divide(Complex input){
		double r = (this.real*input.real+this.imaginary*input.imaginary)/(input.real*input.real+input.imaginary*input.imaginary);
		double i = (this.imaginary*input.real-this.real*input.imaginary)/(input.real*input.real+input.imaginary*input.imaginary);
		return new Complex(r,i);
	}
	public double abs(Complex input){
		double r = Math.sqrt(input.real*input.real+input.imaginary*input.imaginary);
		return r;
	}
	public String toString(){
		return real+" + "+imaginary+"i"; 
	}
	
}
