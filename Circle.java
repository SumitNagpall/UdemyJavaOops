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
	public Circle(double radius,String color)
	{
		this.radius = radius;
		this.color = color;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public double getArea()
	{
		return 3.14*this.radius*this.radius;
	}
	public String getColor()
	{
		return this.color;
	}
	public String toString()
	{
		return "Area of "+getColor()+" Circle having Radius "+getRadius()+" is "+getArea();
	}
	public static void main(String[] args)
	{
		Circle circ = new Circle();
		System.out.println("Area of "+circ.getColor()+" Circle having Radius "+circ.getRadius()+" is "+circ.getArea());
		Circle circ1 = new Circle(5);
		System.out.println("Area of "+circ1.getColor()+" Circle having Radius "+circ1.getRadius()+" is "+circ1.getArea());
		Circle circ2 = new Circle(5,"red");
		System.out.println(circ2);
		
	}
}