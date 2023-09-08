package week7;

class Rectangle extends Shape
{
	
	private double area;
	private double perimeter;
	private double width;
	private double height;
	
	protected Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}


@Override
public double computeArea() {
	
	this.area = (this.width * this.height);
	return this.area;
}
@Override
public double computePeri() {
	
	this.perimeter = (2*(this.width + this.height));
	return this.perimeter ;
}
@Override
public void print() {
	
	System.out.println("Area of Rectangle : " + this.computeArea());
	System.out.println("Perimeter of Rectangle : " + this.computePeri());
	
}


}