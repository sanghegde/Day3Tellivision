//class distance which includes the add method for adding the distances
public class Distance {

	float inches;
	float feet;
	float distance;
	
	
	public float set(float x,float y)
	{
		feet=x;
		inches=y;
		distance=add(feet,inches);
		return distance;
	
	}
	
	 void display()
	{
		System.out.println("feet is:"+feet);
		System.out.println("inch is:"+inches);
		
		
		
		
		
	}
	//add method
	public float add(float x,float y)
	{
		return x+y;
		
	}
}
