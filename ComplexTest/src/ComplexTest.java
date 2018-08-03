//main method for adding of two complex numbers
import java.util.Scanner;

public class ComplexTest {
	public static void main(String[] args)
	{
		Complex complex1=new Complex();
		Complex complex2=new Complex();
		Complex complex3=new Complex();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the real part of the  first complex number");
		complex1.real=scanner.nextFloat();
		System.out.println("Enter the imaginary part of the  first complex number");
		complex1.imaginary=scanner.nextFloat();
		
		System.out.println("Enter the real part of the  second complex number");
		complex2.real=scanner.nextFloat();
		System.out.println("Enter the imaginary part of the  second complex number");
		complex2.imaginary=scanner.nextFloat();
		
		complex1.display();
		complex2.display();
		
		float totalreal=complex3.sum(complex1.real,complex2.real);
		float totalimaginary=complex3.sum(complex1.imaginary,complex2.imaginary);
		
		System.out.println("sum is:"+totalreal);
		System.out.println("sum is:"+totalimaginary+"i");
		
		
		
		
		
		
	}
	

}
