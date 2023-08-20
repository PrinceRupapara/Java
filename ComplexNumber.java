public class ComplexNumber {
    public static void main(String[] args) {
       Complex c1 = new Complex(5.0,8.5); 
       Complex c2 = new Complex(8.9,7.3);
       c1.add(c2);
       System.out.println(c1.realNumber+"+"+c1.imaginaryNumber+"i"); 
    }
}
class Complex{
    double realNumber;
    double imaginaryNumber;

    Complex(){}
    Complex(double realNumber,double imaginaryNumber){
        this.realNumber=realNumber;
        this.imaginaryNumber=imaginaryNumber;
    }

    void add(Complex t){
        Complex temp = new Complex(0,0);
        this.realNumber+=t.realNumber;
        this.imaginaryNumber+=t.imaginaryNumber;
    }
}