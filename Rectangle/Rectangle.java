//Class rectangle that has length and breadth and calculates area and circumference
	public class Rectangle {
	private float length;
	private float breadth;

	public float getLength() {
	return length;
	}

	public void setLength(float length) {
	if(length > 0.0f)
	this.length = length;
	}

	public float getBreadth() {
	return breadth;
	}

	public void setBreadth(float breadth) {
	if(breadth > 0.0f)
	this.breadth = breadth;
	}

	//Method to calculate area
	public float area()
	{
	float area = length * breadth;
	return area;
	}

	//method to calculate circumference
	public float circumference()
	{
	float circumference = 2 * (length + breadth);
	return circumference;
	}

	@Override
	public String toString() {
	return "Rectangle [length=" + length + ", breadth=" + breadth + ", area()=" + area() + ", circumference()="
	+ circumference() + "]";
	}
	}
