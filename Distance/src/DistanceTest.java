//program to add two distances which are inches and feet
import java.util.Scanner;

public class DistanceTest {

	public static void main(String[] args)
	{
		Distance dist1=new Distance();
		Distance dist2=new Distance();
		Distance dist3=new Distance();
		
		dist1.feet=3;
		dist1.inches=(float)0.4;

		dist2.feet=4;
		dist2.inches=(float)0.3;
		
		dist1.display();
		dist2.display();
		
		float var=dist1.add(dist1.feet, dist2.feet);
		float var1=dist2.add(dist1.inches, dist2.inches);
		
		System.out.println("distance"+var);
		System.out.println("distance"+var1);
		
		float sum=dist3.add(var, var1);
		
		System.out.println("distance"+sum);
		
		
		
	
		
		
		
	}
}
