class Circle
{
	private double radius;
	private String color = "blue";

	public Circle()
	{
		radius = 1;
		//color="blue";
	}		
	public Circle(double radius)
	{
		this.radius = radius;
		//this.color = "blue";
	}
	public double getRadius()
	{
		return this.radius;
	}
	public double getArea()
	{
		return 3.14*this.radius*this.radius;
	}
	public static void main(String[] args)
	{
		Circle circ = new Circle();
		System.out.println("Area of Radius "+circ.getRadius()+" is "+circ.getArea());
		Circle circ1 = new Circle(5);
		System.out.println("Area of Radius "+circ1.getRadius()+" is "+circ1.getArea());
	
	}
}