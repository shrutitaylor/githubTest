package week7;

class Circle extends Shape
{
	
	private double area;
	private double perimeter;
	private double radius;
	
 protected Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}

@Override
public double computeArea() {
	
	this.area = Math.PI*(this.radius*super.getX());
	return this.area;
}
@Override
public double computePeri() {
	
	this.perimeter = (2*(this.radius* Math.PI));
	return this.perimeter ;
}
@Override
public void print() {
	// TODO Auto-generated method stub
	System.out.println("Area of Circle : " + this.computeArea());
	System.out.println("Perimeter of Circle : " + this.computePeri());
	
}


}