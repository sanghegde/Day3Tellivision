//Complex class which performs addition and returns third object 
public class Complex {

	
	float imaginary;
	float sum;
	public float real;
	
   //constructor
 public	void set(float x,float y)
	{
		real=x;
		imaginary=y;
	}
	
       //method for display
	public void display()
	{
		System.out.println("real number is:"+real);
		System.out.println("imagonary is"+imaginary);

	}
	
        //method for adding
	public float sum(float x,float y)
	{
		return x+y;
	}
}
